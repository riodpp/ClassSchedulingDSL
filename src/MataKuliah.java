import java.util.ArrayList;

public class MataKuliah {
    private String kodeMatakuliah;
    private String judulMatakuliah;
    private Konfigurasi konfigurasi;

    public MataKuliah() {
        this.kodeMatakuliah ="-";
        this.judulMatakuliah ="-";
        ArrayList<String> list = new ArrayList<>();
        list.add("");
        this.konfigurasi = new Konfigurasi(100, list);
    }

    public MataKuliah(String kodeMatakuliah, Konfigurasi konfigurasi,String judulMatakuliah) {
        this.judulMatakuliah = judulMatakuliah;
        this.kodeMatakuliah = kodeMatakuliah;
        this.konfigurasi = konfigurasi;
    }

    public MataKuliah(String kodeMatakuliah, Konfigurasi konfigurasi) {
        this.judulMatakuliah = "";
        this.kodeMatakuliah = kodeMatakuliah;
        this.konfigurasi = konfigurasi;
    }



    public String getKodeMatakuliah() {
        return kodeMatakuliah;
    }

    public Konfigurasi getKonfigurasi() {
        return konfigurasi;
    }

    public void setKodeMatakuliah(String kodeMatakuliah) {
        this.kodeMatakuliah = kodeMatakuliah;
    }

    public void setKonfigurasi(Konfigurasi konfigurasi){this.konfigurasi = konfigurasi;}

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<konfigurasi.getFasilitas().size(); ++i){
            sb.append(konfigurasi.getFasilitas().get(i)+" ");
        }
        return "[Matakuliah "+kodeMatakuliah+"] "+ "Requirement -> "+konfigurasi.toString()+"]";
    }
}
