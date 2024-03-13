# LP5DPBO2024C2

# Janji
Saya Ratu Syahirah Khairunnisa [2200978] 
mengerjakan Latihan Praktikum 5
dalam mata kuliah DPBO
untuk keberkahanNya maka saya tidak melakukan kecurangan 
seperti yang telah dispesifikasikan. 
Aamiin

# Desain Program :
## 1. Ketik ulang code di atas untuk melengkapi file Menu.java.
## 2. Tambahkan satu atribut baru di class Mahasiswa sekaligus component input-nya di form. (Usahakan setiap orang atribut barunya berbeda)
---
Pada program ini saya menambahkan atribut `Angkatan` pada class Mahasiswa dengan component input yang digunakan adalah JComboBox

Langkah untuk menambahkan atribut 'Angkatan` ini adalah :
- menambah atribut Angkatan di kelas Mahasiswa
  ```
  private String angkatan;

  public Mahasiswa(String nim, String nama, String jenisKelamin, String angkatan) {
      this.nim = nim;
      this.nama = nama;
      this.jenisKelamin = jenisKelamin;
      this.angkatan = angkatan;
  }
  
  public String getAngkatan() {
      return angkatan;
  }
  
  public void setAngkatan(String angkatan) {
      this.angkatan = angkatan;
  }

  ```
- menambah komponen JComboBox untuk memilih angkatan di dalam form:
  ```
  private JComboBox angkatanComboBox;
  ```
- menginisialisasikan komponen JComboBox dan tambahkan ke dalam panel:
  ```
  String[] angkatanData = {"", "2019", "2020", "2021", "2022", "2023"};
  angkatanComboBox.setModel(new DefaultComboBoxModel(angkatanData));
  mainPanel.add(angkatanComboBox);

  ```
- sintaks di dalam metode insertData(), updateData(), dan deleteData() akan berubah sedikit karena sekarang kita juga perlu mengambil dan menyimpan data angkatan.

## 3. Tambah confirmation prompt sebelum delete.
---
Penambahan confirmation prompt dengan cara menambahkan pada deleteData().
```
// Konfirmasi sebelum menghapus data
int choice = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin menghapus data ini?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
if (choice == JOptionPane.YES_OPTION) {
    // Hapus data dari list
    listMahasiswa.remove(selectedIndex);

    // Update tabel
    mahasiswaTable.setModel(setTable());

    // Bersihkan form
    clearForm();

    // Feedback
    JOptionPane.showMessageDialog(null, "Data berhasil dihapus!");
}

```

Pada program ini terdapat 3 file, yaitu :
1. `Menu.java`: Kelas utama yang berfungsi sebagai frame utama aplikasi.
2. `Mahasiswa.java`: Kelas yang merepresentasikan objek mahasiswa.
3. `Menu.form` : untuk mengubah tampilan dengan menambah atau mengubah component.
   
# Penjelasan Alur Program:

1. Saat program dijalankan, frame utama `Menu` akan ditampilkan.
2. Pengguna dapat menambah, mengedit, atau menghapus data mahasiswa menggunakan tombol yang disediakan.
3. Saat tombol "Add" ditekan, data mahasiswa baru akan dimasukkan ke dalam tabel.
4. Saat salah satu baris dalam tabel diklik, data mahasiswa akan ditampilkan di dalam form untuk diedit atau dihapus. Apabila tidak akan melakukan apa apa bisa menekan tombol "Cancel"
5. Saat tombol "Update" ditekan setelah baris dipilih, data mahasiswa akan diperbarui sesuai dengan perubahan yang dilakukan.
6. Saat tombol "Delete" ditekan setelah baris dipilih, data mahasiswa akan dihapus setelah konfirmasi hapus data.


# Dokumentasi
## 1. Add data
  ![1  ADD DATA](https://github.com/queenxhr/LP5DPBO2024C2/assets/135084798/5c4f3094-0f46-4873-b4fa-7d80901ba638)
  ![2  BERHASIL ADD DATA](https://github.com/queenxhr/LP5DPBO2024C2/assets/135084798/25171595-1a48-42d5-9668-25c53cd8ae5b)

## 2. Update data
  ![3  UPDATE DATA BEFORE](https://github.com/queenxhr/LP5DPBO2024C2/assets/135084798/e72e7e1b-0779-4376-a4d6-8d229f44db05)
  ![4  UPDATE DATA AFTER](https://github.com/queenxhr/LP5DPBO2024C2/assets/135084798/941d16e5-dd04-4c30-8e01-d3b0b1b2e385)
  ![5  BERHASIL UPDATE DATA](https://github.com/queenxhr/LP5DPBO2024C2/assets/135084798/20412227-ced9-4c21-8fba-1738d4c6560e)

## 3. Delete data
  ![6  DELETE DATA W KONFIRMASI](https://github.com/queenxhr/LP5DPBO2024C2/assets/135084798/af138649-b94e-49ea-8c6b-8a0e1c42e965)
  ![7  BERHASIL DELETE DATA](https://github.com/queenxhr/LP5DPBO2024C2/assets/135084798/56b4c67e-2fd4-4634-b62c-1eff41278abe)

