# Post test 2

# Tema

Tema yang digunakan masih sama, yaitu Sistem Pencatatan Hasil Panen Kebun. Perbedaan mendasar dari Posttest 1 adalah struktur program yang telah ditingkatkan dengan penerapan tiga kelas yang masing-masing memiliki properti, constructor, serta access modifier untuk menjaga enkapsulasi data. Program ini juga dikelola menggunakan packages yang dipisahkan berdasarkan fungsinya sesuai pola MVC (Model-View-Controller) sehingga kode menjadi lebih rapi, terorganisir, dan mudah dikembangkan.

Selain itu, pada Posttest 2 ini ditambahkan fitur pencarian (search) yang memudahkan pengguna untuk menemukan data hasil panen tertentu secara cepat. Interaksi dengan program dilakukan melalui input berbasis indeks yang dimasukkan oleh pengguna. Jika terdapat kesalahan dalam input, sistem akan menampilkan validasi berupa peringatan sehingga dapat meminimalisasi kesalahan penggunaan. Penjelasan dalam dokumentasi ini akan difokuskan pada aspek-aspek baru yang membedakan implementasi program dari Posttest sebelumnya.


# Penjelasan Kode

Program ini dibagi ke dalam tiga kelas sesuai dengan packages masing-masing. Pada packages model, terdapat class ItemPanen yang berfungsi sebagai struktur data untuk menyimpan informasi hasil panen. Pada package service, terdapat class PanenService yang berisi logika CRUD dan fitur tambahan pencarian/search. Lalu pada package main terdapat class MainProgram yang menjadi entry point dari program.

**1. Class ItemPanen**

<img width="1097" height="775" alt="image" src="https://github.com/user-attachments/assets/80f3c726-b10f-475c-99b4-56df07a10ece" />


Class ItemPanen merupakan representasi satu entri data hasil panen. semua atribut dibuat private untuk menerapkan enkapsulasi, dan diakses lewat getter/setter.
Getter & setter, setiap atribut punya method getX() dan setX() untuk membaca/ubah nilainya. Ini menjaga data tidak diakses langsung dari luar class.

**2. Class PanenService**

<img width="956" height="776" alt="image" src="https://github.com/user-attachments/assets/9e081c4e-e99c-4fdd-afd4-5e1a7af4ba34" />


Class PanenService mengimplementasikan logika bisnis CRUD lengkap dengan fitur search. Class ini memisahkan semua operasi data dari tampilan/menu sehinggga MainProgram hanya berperan sebagai pengendali menu. Method utama nya adalah tambahItem(), tampilkanItem(), editItem(), dan hapusItem(), serta cariItem()

**3. Class MainProgram**

<img width="926" height="779" alt="image" src="https://github.com/user-attachments/assets/327c3b00-2108-4c5c-aa04-35588c62e542" />


Class MainProgram adalah entry point program, menampilkan menu, membaca pilihan user, dan mendelegasikan tindakan ke PanenService.

# Pejelasan Alur Program (Output)

**1. Menu Utama**

<img width="326" height="201" alt="image" src="https://github.com/user-attachments/assets/61ab938a-20d5-410a-8693-b66c4105c01e" />

Ketika program dijalankan, pengguna akan langsung melihat menu utama yang berisi pilihan untuk menambah, melihat, mengedit, menghapus, mencari data, serta keluar dari program.

**2. Menu Tambah Item**

<img width="409" height="158" alt="image" src="https://github.com/user-attachments/assets/f7d02233-2e50-4f75-89c2-d0756969b620" />

Jika pengguna memilih tambah item, maka pengguna diminta memasukkan data kategori, nama, berat, dan kualitas, kemudian data baru ditambahkan ke dalam daftar.

**3. Menu Lihat Item**

<img width="364" height="84" alt="image" src="https://github.com/user-attachments/assets/6307823b-7974-4807-9999-d0e52500cf59" />

Jika  pengguna memilih lihat item pada nomor 2, program akan menampilkan seluruh hasil panen yang sudah diinput.

**4. Menu Edit Item**

<img width="407" height="236" alt="image" src="https://github.com/user-attachments/assets/b5ed503c-c1a6-4470-9451-99751a759760" />

Pada menu edit item, pengguna diminta memilih nomor data yang ingin diubah, lalu dimasukkan data baru untuk mengganti yang lama.

5. Menu Hapus Item

<img width="411" height="131" alt="image" src="https://github.com/user-attachments/assets/9b85a855-e020-48a9-9fdb-13bb66c1044f" />


Menu hapus item bekerja serupa, yaitu meminta nomor data yang akan dihapus, lalu semua data pada nomor tersebut dihapus dari daftar.

6. Menu Cari Item

<img width="488" height="82" alt="image" src="https://github.com/user-attachments/assets/060d52fe-007e-4fe8-aefd-899c3474026f" />

Sedangkan pada menu cari item, pengguna bisa memasukkan nama kategori dari sayur/buah, dan program akan menampilkan data yang sesuai dengan pencarian pengguna.

7. Menu Keluar

<img width="196" height="49" alt="image" src="https://github.com/user-attachments/assets/019cb750-ddb4-4d25-b91e-d4c07fb8c1b1" />

Proses ini terus berulang sampai pengguna memilih menu keluar, dimana program menampilkan pesan penutup sebelum benar-benar berhenti.
