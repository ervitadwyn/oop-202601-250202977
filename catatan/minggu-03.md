# Catatan Minggu 03: Inheritance

Salin berkas ini menjadi `catatan/minggu-NN.md` (NN dua digit, misalnya `minggu-07.md`).

## Yang saya kerjakan
Saya mempelajari dan menerapkan konsep inheritance kemudian mengerjakan kelas ruang, laptop dan alatlab sebagai subclass dari kelas aset. Ketiga kelas tersebut menggunakan konstruktor super(kode,nama) untuk memanfaatkan konstruktor kelas induk, serta memiliki atribut dan validasi sesuai jenis asetnya, saya juga mengimplementasikan metode getJenis() agar setiap subclass dapat mengambalikan jenis aset yang sesuai

## Keputusan desain

Saya memutuskan atribut kode, nama, status dan kondisi dietakkan pada kelas induk aset karena di gunakan oleh semua aset. Sementara, atribut khusus seperti kapasitas, spesifikasi, nomerInventaris, laboratorium, dan tingkat resiko diletakkan pada subclass masing-masing. saya menggunakan extends aset dan super(kode, nama) agar kode umum dapat diwariskan dan tidak perlu di tulis ulang.

## Kendala
Kendala yang saya temui adalah memahami penempatan atribut pada kelas induk dan subclass serta memastikan setiap konstruktor menggunakan super() dengan benar. saya mengatasi dengan memeriksa kembali struktur kelas dan menyesuaikan validasi setiap atribut dengan aturan yang di tentukan.

## Penggunaan AI
- Alat yang dipakai: Chatgpt
- Bagian yang dibantu AI: Pemeriksaan struktur ruang, laptop dan alatlab, penempatan atribut, konstruktor, dan validasi.
- Prompt utama: Periksa kode Ruang.java, Laptop.java, dan AlatLab.java apakah sudah sesuai dengan instruksi Minggu 3 tentang inheritance
- Yang saya ubah atau tolak dari saran AI, dan alasannya: saya mengikuti saran untuk memeriksa dan memastikan deklarasi fild pada setiap subclass, saya juga memeriksa kembali hasil pengujian sebelum melanjutkan pekerjaan agar perubaan yang saya buat sesuai dengan instruksi tugas
- Satu hal yang saya pahami lebih baik sekarang: saya lebih memahami bahwa inheritance memungkinkan subclass menggunakan stribut dan perilaku umum dari kelas induk, sedangkan atribut yang hanya relevan untuk jenis tertentu sebaiknya tetap berada di subclass

## Catatan

Inheritance kurang tepat dibandingkan komposisi apabila suatu objek hanya membutuhkan fungsi dari objek lain, tetapi bukan merupakan jenis dari objek tersebut