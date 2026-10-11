# Catatan Minggu 01: Paradigma Pemrograman dan Setup

Salin berkas ini menjadi `catatan/minggu-01.md` (NN dua digit, misalnya `minggu-07.md`).

## Yang saya kerjakan
Pertama tama saya menginstal JDK21 dan Maven, kemudian Saya mengerjakan 3 paradigma pemrograman, dan saya melengkapi fungsi sapaan, membuat atribut private dan konstruktor pada OOP, lambda pada fungsional pada code TODO di HelloFungsional, helloOOP, dan HelloProsedural sendiri. Saya sudah mengisi nama dan nim dan sudah menjalankan pengujian otomatis hingga seluruh tes berhasil tanpa eror

## Keputusan desain
Menggunakan 3 paradigma pemrograman menunjukan bahwa kebutuhan yang sama dapat di implementasikan dengan pendekatan yang berbeda. pada prosedural saya menggunakan fungsi static, pada OOP saya menggunakan stribut private dan konstruktor untuk mengelola data, sedangkan pada fungsional saya menggunakan lambda melalui function<String, String>. saya memilih format sapaan yang sama agar hasil ketiga pendekatan mudah dibandingkan dan dapat di verivikasi melalui pengujian otomatis

## Kendala
Awalnya saya masih kesusahan untuk mengerti alur pengerjaan tugasnya dan bingung, dan saya juga sempat melakukan kesalahan dalam pengetikan kata sapaan, pada HelloProsedural saya menulis kata sapaannya secara berbeda dengan yang lain dan menimbulkan hasil pengujian di anggap berbeda, tetapi sudah saya betulkan.

## Penggunaan AI
- Alat yang dipakai: chatgpt
- Bagian yang dibantu AI: saya meminta bantuan untuk memberikan langkah langkah cara pengerjaan tugasnya dan bagaimana cara untuk melakukan pengujiannya
- Prompt utama: 1. minggu 1 di suruh ngapain? (saya tempelkan minggu01.md), 2. masalah apa yang terjadi? kenapa hasil pengujiannya eror? (saya pastekan terminal erornya)
- Yang saya ubah atau tolak dari saran AI, dan alasannya: Ai menawarkan untuk membantu saya dalam pengerjaan kodenya, namun saya tolak, karena untuk kodenya saya paham, saya lebih kesulitan masalah langkah pengerjaannya saja dan eror pada saat pengujian
- Satu hal yang saya pahami lebih baik sekarang: saya lebih memahami bahwa satu kebutuhan program dapat dibuat mengunakan paradigma yang berbeda, dan dengan cara kerja yang berbeda tetapi menghasilkan keluaran yang sama

## Kelebihan dan Keterbatasan tiap gaya peminjaman aset
- Prosedural, kelebihannya sederhana dan mudah di pahami untuk tugas kecil, sedangkan keterbatasannya ketika program semakin besar pengelolaan data dan fungsi bisa menjadi kurang terstruktur
- OOP, kelebihannya data dan perilaku lebih terorganisasi dan mudah di kembangkan, sedangkan keterbatasannya membutuhkan pemahaman kelas, objek, konstruktor, dan akses atribut
- Fungsional, kelebihannya fungsi dapat digunakan sebagai nilai dan membantu membuat proses yang lebih fokus, sedangkan keterbatasannya penggunaan lambda dan fungsi sebagai nilai mungkin terasa lebih sulit bagi pemula