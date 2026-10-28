# Catatan Minggu 04: Polymorphism

Salin berkas ini menjadi `catatan/minggu-NN.md` (NN dua digit, misalnya `minggu-07.md`).

## Yang saya kerjakan
Saya mengimplementasikan polymorphism melalui method overriding pada kelas Aset, Ruang, Laptop dan AlatLab. Saya juga melengkapi dua metode cari() pada KatalogAset untuk mencari aset berdasarkan nama dan berdasarkan nama beserta jenis aset, tanpa membedakan huruf besar dan kecil.

## Keputusan desain
-

## Kendala
Saya sempat bingung menentukan kondisi jumlah hari keterlambatan, terutama saat membedakan nilai nol dan negatif. saya memahami bahwa keterlambatan nol hari harus menghasilkan denda nol, sedangkan jumlah hari negatif harus ditolak. saya kemudian memeriksa kembali kondsi pada metode hitungDenda() dan menjalankan pengujian kembali

## Penggunaan AI
- Alat yang dipakai: Chatgpt
- Bagian yang dibantu AI: Pengecekan hasil pengujian
- Prompt utama: Bantu periksa hasil pengujian dan perubahan kode minggu 4
- Yang saya ubah atau tolak dari saran AI, dan alasannya: Saya tidak mengubah metode lain yang tidak termasuk dalam pekerjaan minggu 4
- Satu hal yang saya pahami lebih baik sekarang: Metode overriding memungkinkan beberapa subclass memiliki implementasi metode yang berbeda, sedangkan method overloading memungkinkan beberapa metode memiliki nama sama dengan parameter berbeda
