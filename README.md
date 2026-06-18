# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi petshop untuk pembelian kucing atau anjing menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama, harga dan ras, dan memberikan output berupa nama, jenis, harga, diskon dan suara.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `PetShop`, `Anjing`, dan `Kucing` adalah contoh dari class.

```bash
public class PetShop {
    ...
}

public class Anjing extends PetShop {
    ...
}

public class Kucing {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `daftarPet[0] = new PetShop(namaKucing, "Kucing", hargaKucing);` , dan `daftarPet[1] = new Anjing(namaAnjing, hargaAnjing, rasAnjing);` adalah contoh pembuatan object.

```bash

daftarPet[0] = new PetShop(namaKucing, "Kucing", hargaKucing);

daftarPet[1] = new Anjing(namaAnjing, hargaAnjing, rasAnjing);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama`, `jenis`, `harga`, dan `ras` adalah contoh atribut.

```bash
private String nama;
private String jenis;
private double harga;
private String ras;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `PetShop` dan `Anjing`.

```bash
public PetShop(String nama, String jenis, double harga) {,
    this.nama = nama;
    this.jenis = jenis;
    this.harga = harga;
}

public Anjing(String nama, double harga, String ras) {
    super(nama, "Anjing", harga); // Memanggil constructor superclass
    this.ras = ras;
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama` adalah contoh method mutator.

```bash
public void setNama(String nama) {
    this.nama = nama;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getjenis`, `getharga`, dan `getras` adalah contoh method accessor.

```bash
public String getNama() {
    return nama;
}

public String getHarga() {
    return harga;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama`, `jenis`, dan `harga` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String nama;
private String jenis;
private double harga;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `Anjing` mewarisi `PetShop` dengan sintaks `extends`.

```bash
public class Anjing extends PetShop {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `bersuara` di `PetShop` merupakan overloading method `bersuara` di `Anjing` merupakan override dari method `Bersuara` di `Petshop`.

```bash
// Di dalam class PetShop (Induk)
public void bersuara() {
    System.out.println("Meong Meong");
}

// Di dalam class Anjing (Anak)
@Override
public void bersuara() {
    System.out.println("Guk.. Guk..!!");
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `HitungDiskon`.

```bash
public double hitungDiskon() {
    if (jenis.equalsIgnoreCase("Kucing")) {
        return harga * 0.10; // Diskon 10% untuk kucing
    } else {
        return 0; // Tidak ada diskon untuk hewan lain
    }
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < daftarPet.length; i++) {
    System.out.println("Nama  : " + daftarPet[i].getNama());
    ...
    daftarPet[i].bersuara(); 
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner input = new Scanner(System.in);
System.out.print("Masukkan nama kucing: ");
String namaKucing = input.nextLine();
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `PetShop[] daftarPet = new PetShop[2];` adalah contoh penggunaan array.

```bash
PetShop[] daftarPet = new PetShop[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try (Scanner input = new Scanner(System.in)) {
    // Proses input data
} catch (Exception e) {
    System.out.println("Terjadi kesalahan input data: " + e.getMessage());
} finally {
    System.out.println("Program Petshop Selesai.");
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Aditya Effendi
NPM: 2410010479
