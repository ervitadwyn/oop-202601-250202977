# Catatan Minggu 02: Struktur OOP: Class, Object, Encapsulation

Salin berkas ini menjadi `catatan/minggu-NN.md` (NN dua digit, misalnya `minggu-07.md`).

## Yang saya kerjakan
Saya membuat field kode, nama status dan kondisi dengan skses private, menetapkan nilai awal sttaus menjadi tersedia dan kondisi menjadi baik, memvalidasi kode dan nama pada konstruktor agar tidak menerima nilai kosong, membuat getter untuk akses data aset dan setter untuk nama status dan kondisi dengan validasi

## Keputusan desain
Kode dan nama dinormalisasi menggunakan trim() sebelum di simpan, sehingga spasi awal dan akhir di hapus. Validasi menggunakan trim().isEmpty() untuk menolak teks yang hanya berisi spasi
Rujuk `docs/asumsi.md` saya menambahkan A03,A04, dan A05

## Kendala
Saat pengujian awal gagal karena validasi konstruktor belum menolak input yang hanya berisi spasi. saya menyelesaikan dengan mengganti pemeriksaan menjadi trim().isEmpty(). setelah perbaika seluruh tes berhasil

## Penggunaan AI
- Alat yang dipakai: Chatgpt
- Bagian yang dibantu AI: Meninjau validasi konstruktor dan analisis pesan kegagalan tes
- Prompt utama: Ini adalah pesan dari terminal setelah di jalankan, apa masalanya? (saya copy pastekan tulisan yang di terminal)
- Yang saya ubah atau tolak dari saran AI, dan alasannya: saya menggunakan saran AI untuk membantu menganalisis kesalahan pada pengujian, saya tetap memeriksa dan menjalankan pengujian untuk memastikan perbaikannya sesuai dengan kebutuhan tugas.
- Satu hal yang saya pahami lebih baik sekarang: saya lebih paham konsep enkapsulapsi. cara membatasi akases langsung ke atribut menggunakan private, menggunakan konstruktor untuk memberikan nilai awal objek, getter dan setter untuk mengakses/mengubah data. dan saya juga paham pentingnya validasi agar kode, nama status, dan konsisi aset memiliki nilai yang sesuai
