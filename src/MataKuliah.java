public class MataKuliah {
    private String nama,kode;

    public MataKuliah() {

    }

    public MataKuliah(String nama, String kode) {
        this.kode = kode;
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public String getKode() {
        return kode;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

}
