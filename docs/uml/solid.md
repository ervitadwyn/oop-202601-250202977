# Analisis Prinsip SOLID

## 1. Single Responsibility Principle (SRP)

Kelas `KatalogAset` bertanggung jawab mengelola kumpulan aset, seperti menambahkan aset, menampilkan seluruh aset, dan mencari aset berdasarkan kode atau jenis. Tanggung jawab tersebut berfokus pada pengelolaan katalog aset, sehingga lebih mudah dipahami dan dikembangkan tanpa mencampurkan tanggung jawab lain, seperti penyimpanan data ke database.

## 2. Dependency Inversion Principle (DIP)

Interface `AsetDAO` dan `PeminjamanDAO` menjadi abstraksi untuk operasi penyimpanan data. Kelas `JdbcAsetDAO` dan `JdbcPeminjamanDAO` mengimplementasikan interface tersebut. Dengan adanya interface, kode yang membutuhkan operasi penyimpanan dapat dirancang agar tidak bergantung langsung pada detail implementasi JDBC. Hal ini mempermudah pengujian dan memungkinkan implementasi penyimpanan diganti tanpa harus mengubah seluruh kode pemanggil.