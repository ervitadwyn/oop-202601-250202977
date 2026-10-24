# Asumsi dan Keputusan Desain

Isi bagian ini sendiri. Satu entri per keputusan. Dinilai dari kejelasan alasan dan konsistensi dengan kode dan tes Anda,
bukan dari jawaban "benar".

Format tiap entri:

## A-01: Kesamaan keluaran tiga paradigma
- Pertanyaan: Apa ketiga paradigma ini harus menghasilkan keluaran yang sama?
- Keputusan: Ketiga Paradigma menggunakan format sapaan yang sama agar hasilnya konsisten
- Alasan: Membandingkan pendekatan prosedural, OOP, dan fungsional dalam menyelesaikkan kebutuhan yang sama
- Dampak ke kode : HelloProsedural, HelloOOP, dan HelloFungsional
- Tes yang membuktikan: `core/src/test/java/id/ac/upb/asetpinjam/Minggu01Test.java`

## A-02: Pengelolaan data pada pendekatan OOP
- Pertanyaan: Bagaimana data nama dan NIM dikelola dalam pendekatan OOP?
- Keputusan: Atribut dibuat private dan nilainya diberikan melalui konstruktor
- Alasan: Enkapsulasi membantu membatasi akses langsung terhadap data objek
- Dampak ke kode : Class HelloOOP
- Tes yang membuktikan: `core/src/test/java/id/ac/upb/asetpinjam/Minggu01/HelloOOP.java`

## A-03: Kode aset tidak dapat diubah
- Pertanyaan: Apa kode aset boleh diubah setelah objek dibuat?
- Keputusan: Kode ditetapkan melalui konstruktor dan tidak memiliki setter
- Alasan: Kode digunakan sebagai identitas aset sehingga perlu dihindari perubahan
- Dampak ke kode : Konstruktor dan getter pada class aset
- Tes yang membuktikan: `core/src/main/java/id/ac/upb/asetpinjam/model/Aset.java`

## A-04: Validasi dan normalisasi data aset
- Pertanyaan: Bagaimana jika kode atau nama aset bernilai kosong atau spasi?
- Keputusan: Ditolak menggunakan IllegalArgumentException. spasi awal dan akhir kode serta nama di hapus menggunakan trim(), tetapi huruf besar kecil tetap di pertahankan 
- Alasan: Data aset harus menimiliki nilai yang valid dan tersimpan dengan lebih rapih
- Dampak ke kode : Konstruktor aset dan setter setNama
- Tes yang membuktikan: `core/src/main/java/id/ac/upb/asetpinjam/model/Aset.java`

## A-05: Nilai awal dan validasi status aset
- Pertanyaan: Bagaimana status dan kondisi awal aset di tentukan, dan apakah keduanya boleh bernilai kosong?
- Keputusan: Status awal adalah tersedia, konsisi awal adala baik, dan setter menolak nilai kosong
- Alasan: setiap aset perlu memilki status dan konsiis yang jelas sejak objek dibuat
- Dampak ke kode : Konstruktor aset dan setter setNama
- Tes yang membuktikan: `core/src/main/java/id/ac/upb/asetpinjam/model/Aset.java`


## Aturan ambigu dari docs/aturan-bisnis.md

Salin setiap pertanyaan ambigu (nomor 1 sampai 7) ke sini dan jawab. Contoh:

## A-01: batas waktu bentrok
- Pertanyaan: 09:00-11:00 dan 11:00-13:00 pada aset yang sama bentrok atau tidak?
- Keputusan: (isi)
- Alasan: (isi)
- Dampak ke kode: (isi)
- Tes yang membuktikan: (isi)

## Asumsi lain

Tambahkan di sini keputusan lain yang Anda ambil: rumus denda progresif, perubahan skema database, format error API, dan seterusnya.
