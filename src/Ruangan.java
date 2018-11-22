import java.util.ArrayList;

public class Ruangan {
    private String kodeRuangan;
    private Konfigurasi konfigurasi;

    public Ruangan(){
        kodeRuangan = "0000";
        ArrayList<String> list = new ArrayList<>();
        list.add("");
        konfigurasi = new Konfigurasi(100, list);
   }

    public Ruangan(String kodeRuangan, Konfigurasi konfigurasi){
        this.kodeRuangan = kodeRuangan;
        this.konfigurasi = konfigurasi;
    }


    // Getter and Setter
    public String getKodeRuangan(){
        return kodeRuangan;
    }
    public Konfigurasi getKonfigurasi(){
        return konfigurasi;
    }
    public void setKodeRuangan(String kodeRuangan){
        this.kodeRuangan = kodeRuangan;
    }
    public void setKonfigurasi(Konfigurasi konfigurasi){
        this.konfigurasi = konfigurasi;
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[Ruang "+ this.getKodeRuangan() + "] ( " );
        sb.append("Kapasitas : "+ this.getKonfigurasi().getJumlahKapasitas()+ " Fasilitas : [");
        for (int i=0; i<konfigurasi.getFasilitas().size(); ++i){
            sb.append(konfigurasi.getFasilitas().get(i)+" ");
        }
        sb.append("])");

        return sb.toString();
    }

    public void printRuangan() {
        StringBuilder sb = new StringBuilder();
        sb.append("[Ruang "+ this.getKodeRuangan() + "] : " );
        sb.append("Konfigurasi-Ruangan : "+konfigurasi.toString());

        System.out.println(sb);
    }

}
