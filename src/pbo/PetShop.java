package pbo;

// 1. Poin Class & 7. Poin Encapsulation private
public class PetShop {
    // 3. Poin Atribut
    private String nama; // agar tidak bisa di ubah sembarangan dari luar
    private String jenis;
    private double harga;

    // 4. Poin Constructor membrikan nilai awal object 
    public PetShop(String nama, String jenis, double harga) {
        this.nama = nama;
        this.jenis = jenis;
        this.harga = harga;
    }

    // 5. Poin Mutator (Setter) untuk mengisikan atribut
    public void setNama(String nama) {
        this.nama = nama;
    }

    // 6. Poin Accessor (Getter) untuk mengambil atribut
    public String getNama() {
        return nama;
    }

    public String getJenis() {
        return jenis;
    }

    public double getHarga() {
        return harga;
    }

    // 9. Poin Polymorphism 
    public void bersuara() {
        System.out.println("Meong Meong");
    }

    // 10. Poin Seleksi (If-Else untuk mengecek diskon berdasarkan jenis hewan)
    public double hitungDiskon() {
        if (jenis.equalsIgnoreCase("Kucing")) {
            return harga * 0.10; // Diskon 10% untuk kucing
        } else {
            return 0; // Tidak ada diskon untuk hewan lain
        }
    }
}