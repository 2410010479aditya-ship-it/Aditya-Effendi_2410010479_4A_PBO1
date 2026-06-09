
package pbo;


// 8. Poin Inheritance(Pewarisan) subclass dari PetShop
public class Anjing extends PetShop {
    private String ras; // tambahan atribut baru

    public Anjing(String nama, double harga, String ras) {
        // Memanggil constructor dari superclass (PetShop) 
        super(nama, "Anjing", harga); // Di dalam constructor-nya, kita memakai perintah super untuk mengirim data ke kelas induknya."
        this.ras = ras;
    }

    // 9. Poin Polymorphism (overriding) untuk mengubah method dari induk (khusus untuk object anjing)
    @Override
    public void bersuara() {
        System.out.println("Guk.. Guk..!!");
    }
    // method accessor / getter
    public String getRas() { // untuk mengambil nilai atribut
        return ras;
    }
}
