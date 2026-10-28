# Catatan Minggu 05: Abstraction

Salin berkas ini menjadi `catatan/minggu-NN.md` (NN dua digit, misalnya `minggu-07.md`).

## Yang saya kerjakan
Saya mengubah class Aset menjadi abstract class yang tetap mengimplementasikan interface DapatPinjam, mengubah method hitungDenda() pada class Aset menjadi abstract method agar setiap subclass memilki perhitungan denda masing-masing, memastikan method bisaDipinjam() hanya mengembalikan true ketika status aset adalah TERSEDIA dan kondisi aset bukan RUSAK_BERAT, mengimplementasikan interface AturanDenda pada class DendaFlat dan DendaProgresif, dan menambahkan validasi untuk aset bernilai null dan jumlah hari keterlambatan negatif pada kedua aturan denda. 

## Keputusan desain
Rumus denda progresif yang saya gunakan:

- 0 hari: denda 0
- 1–7 hari: 1 kali denda flat.
- 8–14 hari: 2 kali denda flat.
- 15–29 hari: 3 kali denda flat.
- 30 hari atau lebih: 4 kali denda flat.

asumsi rumus dicatat dalam `docs/asumsi.md`

## Kendala
Saya perlu membedakan fungsi abstract class dan interface. Abstract class digunakan sebagai dasarbagi jenis-jenis aset, sedangkan interface menentukan kontrak perilaku yang harus diimplementasikan. saya juga perlu menentukan rumus denda progresif sendiri

## Penggunaan AI
- Alat yang dipakai: Chatgpt
- Bagian yang dibantu AI: Memahami perbedaan abstract class dan interface
- Prompt utama: Jelaskan perbedaan abstract class dan interface dalam Java dengan bahasa sederhana dan contoh yang mudah dipahami.
- Yang saya ubah atau tolak dari saran AI, dan alasannya: -
- Satu hal yang saya pahami lebih baik sekarang: Abstract class dapat digunakan sebagai dasar bagi beberapa class yang memiliki atribut dan perilaku umum, tetapi memungkinkan subclass membrikan implementasi yang berbeda. Interface digunakan untuk menetapkan kontrak perilaku yang harus dipenuhi oleh class yang mengimplementasikanya.
