package pbo;

import java.util.Scanner; // agar bisa menggunakan class scanner

public class Kucing {
    public static void main(String[] args) {
        // 14. Poin Error Handling (Menggunakan try-catch) agar saat salah input program tidak crash
        try ( // 12. Poin IO Sederhana (Menggunakan Scanner untuk menerima input)
                Scanner input = new Scanner(System.in) //untuk membaca input dari keyboard, sekaligus otomatis menutupnya ketika program selesai.
        ) {
            // 13. Poin Array (Membuat array objek berkapasitas 2 data)
            PetShop[] daftarPet = new PetShop[2];

            System.out.println("--- INPUT DATA PETSHOP ---");
            
            // Input untuk Data 1: Menggunakan Class Kucing langsung dari objek PetShop
            System.out.print("Masukkan nama kucing: ");
            String namaKucing = input.nextLine(); // agar input berikutnya tidak lompat otomatis
            System.out.print("Masukkan harga kucing: ");
            double hargaKucing = input.nextDouble();
            input.nextLine(); // Membersihkan sisa baris input
            
            // 2. Poin Object (Instansiasi objek kucing)
            daftarPet[0] = new PetShop(namaKucing, "Kucing", hargaKucing);

            System.out.println("--------------------------");

            // Input untuk Data 2: Menggunakan Subclass Anjing
            System.out.print("Masukkan nama anjing: ");
            String namaAnjing = input.nextLine();
            System.out.print("Masukkan harga anjing: ");
            double hargaAnjing = input.nextDouble();
            input.nextLine();
            System.out.print("Masukkan ras anjing: ");
            String rasAnjing = input.nextLine();
            
            // 2. Poin Object (Instansiasi objek anjing dari subclass)
            daftarPet[1] = new Anjing(namaAnjing, hargaAnjing, rasAnjing);

            System.out.println("\n--- TAMPILAN DATA PETSHOP ---");
            
            // 11. Poin Perulangan (Menggunakan loop untuk menampilkan isi array)
            for (int i = 0; i < daftarPet.length; i++) {
                System.out.println("Nama  : " + daftarPet[i].getNama());
                System.out.println("Jenis : " + daftarPet[i].getJenis());
                System.out.println("Harga : Rp " + daftarPet[i].getHarga());
                System.out.println("Diskon: Rp " + daftarPet[i].hitungDiskon());
                
                System.out.print("Suara : ");
                daftarPet[i].bersuara(); // Menunjukkan aksi polymorphism berjalan
                System.out.println("--------------------------");
            }
            
        } catch (Exception e) {
            // Menangkap error jika user salah memasukkan tipe data (misal input text di harga)
            System.out.println("Terjadi kesalahan input data: " + e.getMessage());
        } finally {
            System.out.println("Program Petshop Selesai.");
        }
    }
}