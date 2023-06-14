# App.java
Di dalam "App.java" terdapat method main yang ketika dijalankan maka akan memanggil method showMenu() dari class Menu.

## com
Terdapat beberapa package yaitu:
1. config
2. controllers
3. layouts
4. models

## 1. config
DbConnect: Di dalam "DbConnect.java" terdapat method "connection" yang digunakan untuk membuka/menghubungkan koneksi ke database.

## 2. controllers
DbController: Di dalam "DbController.java" terdapat beberapa method yang dapat digunakan. Saat method dipanggil, maka akan melakukan koneksi ke database terlebih dahulu.
- getDatabase() : berfungsi untuk menampilkan item/data dari tabel pada database.
- inserData(): berfungsi untuk menambahkan data baru ke dalam tabel pada database.
- editData(): berfungsi untuk mengedit data yang ada pada tabel dalam database.
- deleteData(): berfungsi untuk menghapus data dari tabel pada database.


## 3. layouts
- Di dalam "DeleteData.java" terdapat method yang meminta inputan ID dari data yang akan dihapus kemudian menghapus semua data dari ID yang telah diinput.
- Di dalam "EditData.java" terdapat method yang meminta inputan ID dari data yang akan diedit lalu meminta data baru yang kemudian mengganti data sebelumya.
- Di dalam "InsertData.java" terdapat method yang meminta inputan data-data baru yang kemudian akan ditambahkan ke dalam database.
- Di dalam "Menu.java" terdapat method yang menampilkan opsi yang dapat dilakukan dengan meminta inputan kemudian akan menjalankan perintah sesuai inputan yang diberikan.
- Di dalam "ReadData.java" terdapat method yang memanggil method getDataBase() dari class DbController

## 4. models
Produk : Di Dalam "Produk.java" terdapat attribute, constructor dan getter dari masing-masing attribute.