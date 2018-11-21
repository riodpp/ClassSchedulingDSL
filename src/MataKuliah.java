public class MataKuliah {
    private String kode;
    private Konfigurasi konfigurasi;

    public MataKuliah() {

    }

    public MataKuliah(String kode, Konfigurasi konfigurasi) {
        this.kode = kode;
        this.konfigurasi = konfigurasi;
    }


    public String getKode() {
        return kode;
    }

    public Konfigurasi getKonfigurasi() {
        return konfigurasi;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public void setKonfigurasi(Konfigurasi konfigurasi){this.konfigurasi = konfigurasi;}

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<konfigurasi.getFasilitas().size(); ++i){
            sb.append(konfigurasi.getFasilitas().get(i)+" ");
        }
        return "("+konfigurasi.getJumlahKapasitas() + " " + sb.toString()+")";
    }
}
