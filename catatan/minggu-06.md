# Catatan Minggu 06: UML dan SOLID

Salin berkas ini menjadi `catatan/minggu-NN.md` (NN dua digit, misalnya `minggu-07.md`).

## Yang saya kerjakan
Saya membuat class diagram berdasarkan struktur kelas dan relasi pada proyek Aset-Pinjam, saya juga membuat sequence diagram untuk menggambarkan skenario pengajuan peminjaman dan kemungkinan terjadinya bentrok, saya menulis analisis prinsip SOLID yang berkaitan dengan struktur kode proyek

## Keputusan desain
saya menunjukkan 2 prinsip SOLID:
1. Single Responsibility Principle (SRP) pada kelas KatalogAset, kelas ini berfokus pada pengelolaan katalog aset seperti menambahkan, menampilkan, dan mencari
2. Dependency Inversion Principle(DIP) pada interface AsetDAO dan PeminamanDAO, yang di implementasikan oleh kelas JdbcAsetDAO dan JdbcPeminjamanDAO, penggunaan interface membantu memisahkan kontrak operasi penyimpangan dari implementasi JDBC, sehingga implementasi dapat diganti dan pengujian lebih mudah dilakukan.

## Kendala
- saya mengalami kendala dalam memnampilkan hasil uml dalam format .png, gambar class-diagram.png hanya terlihat setengah, namun sudah di atasi dengan membuat versi SVG agar keseluruhan diagram dapat terlihat dengan lebih jelas.

## Quiz
Perbedaan Agregation dan Compostion
- Agregation yaitu hubungan antarkelas ketika suatu objek memiliki objek lain, tetapi objek yang dimiliki tetap bisa berdiri sendiri meski objek pemiliknya di hapus
- Composition yaitu hubungan antarkelas ketika suatu objek memiliki objek lain yang keberadaannya bergantung pada objek pemiliknya, jika objek pemilik di hapus maka objek yang dimliki juga hilang.

Mengapa OCP memudahkan pengembangan?
Karena kita bisa menambah fitur atau fungsi baru tanpa harus mengubah kode yang sudah ada, ini mengurangi risiko kesalahan pada fitur lama dan memudahkan pengembangan

Mengapa DIP meningkatkan Testability
Karena kita bisa mengganti implementasi asli dengan objek tiruan saat melakukan pengujian, tanpa harus selalu terhubung ke database sungguhan

## Penggunaan AI
- Alat yang dipakai: Chatgpt
- Bagian yang dibantu AI: Penjelasan prinsip solid, penyusunan dokumentasi UML, memunculkan gambar UML .png dan .svg
- Prompt utama: Bantu aku menyusun diagram UML dan analisis hasil tes, Bagaimana cara menambahkan versi gambarnya tanpa terpotong?
- Yang saya ubah atau tolak dari saran AI, dan alasannya: Diagram perlu diperiksa kembali agar sesuai dengan implementasi kode yang sebenarnya, terutama karena beberapa metode masih berupa TODO.
- Satu hal yang saya pahami lebih baik sekarang: Class diagram menggambarkan struktur kelas dan relasinya, sedangkan sequence diagram menggambarkan urutan interaksi. Prinsip SOLID membantu membuat kode lebih terstruktur dan mudah diuji.
