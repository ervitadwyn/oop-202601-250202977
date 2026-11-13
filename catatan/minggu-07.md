# Catatan Minggu 07: Koleksi

Salin berkas ini menjadi `catatan/minggu-NN.md` (NN dua digit, misalnya `minggu-07.md`).

## Yang saya kerjakan
Saya mengimplementasikan beberapa operasi pada jadwal peminjaman, yaitu memeriksa bentrok waktu, mengurutkan peminjaman berdasarkan waktu mulai, mengelompokkan peminjaman berdasarkan kode aset, dan menghapus peminjaman berdasarkan ID. saya juga membuat lima pengujian tambahan untuk memeriksa batas waktu bentrok.

## Keputusan desain
saya menggunakan `List<Peminjaman>` sebagai tempat penyimpanan utama karena data peminjaman perlu ditambahkan, ditelusuri, dan diurutkan. Untuk pengelompokan peminjaman berdasarkan kode aset, saya menggunakan `Map<String, List<Peminjaman>>` dengan implementasi `LinkedHashMap` agar data dikelompokkan berdasarkan kode aset dan urutan kemunculan kode tetap terjaga.
Pengurutan dilakukan menggunakan `Comparator.comparing(Peminjaman::getMulai)`. Untuk pemeriksaan bentrok, dua peminjaman pada aset yang sama tidak dianggap bentrok apabila waktu selesai peminjaman pertama sama dengan waktu mulai peminjaman berikutnya.

## Kendala
Kendala yang saya temui adalah menentukan kondisi bentrok agar dapat menangani berbagai bentuk tumpang tindih waktu. saya memperbaikinya dengan membandingkan waktu mulai dan waktu selesai dari kedua peminjaman. saya juga menambahkan tes khusus untuk memastikan peminjaman yang waktunya bersinggungan tepat pada batas akhir dan awal tidak dianggap bentrok

## Penggunaan AI
- Alat yang dipakai: Chatgpt
- Bagian yang dibantu AI: pemeriksaan logika metode `bentrok()`
- Prompt utama: bantu periksa logika bentrok peminjaman berdasarkan waktu mulai dan waktu selesai
- Yang saya ubah atau tolak dari saran AI, dan alasannya: saya menyesuaikan kode dengan struktur package, helper pengujian, dan nama getter yang tersedia di proyek
- Satu hal yang saya pahami lebih baik sekarang: dua interval waktu dianggap tumpang tindih jika waktu mulai salah satu peminjaman lebih awal dari waktu selesai peminjaman lainnya dan waktu selesai peminjaman tersebut lebih akhir dari waktu mulai peminjaman lainnya

## Quiz
Kapan memilih Set daripada List?
Set dipilih ketika kita ingin menyimpan data yang unik atau tidak boleh memiliki duplikat. Set secara otomatis mencegah elemen yang sama dimasukkan berulang kali. Sedangkan List digunakan ketika kita membutuhkan data yang bisa memiliki duplikat dan urutannya perlu dipertahankan
2. Mengapa daftar internal dikembalikan sebagai salinan?
Daftar internal dikembalikan sebagai salinan agar data asli di dalam objek tidak dapat diubah secara langsung oleh pihak luar. Jika daftar internal dikembalikan langsung, pengguna bisa menambah, menghapus, atau mengubah isi daftar tanpa melalui metode yang sudah disediakan
3. Apa beda Comparable dan Comparator?
Comparable digunakan untuk menentukan urutan alami suatu objek dan di implementasikan langsung pada class objek, sedangkan Comparator digunakan untuk menentukan urutan berdasarkan kebutuhan tertentu dan dibuat terpisah dari class objek
