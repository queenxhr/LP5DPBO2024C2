public class Mahasiswa {
    private String nim;
    private String nama;
    private String jenisKelamin;
    private String angkatan;

    public Mahasiswa(String nim, String nama, String jenisKelamin, String angkatan) {
        this.nim = nim;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.angkatan = angkatan;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getAngkatan() {
        return angkatan;
    }

    public void setAngkatan(String angkatan) {
        this.angkatan = angkatan;
    }
}
