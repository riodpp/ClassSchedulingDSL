import java.util.ArrayList;

public class Ruangan {
    private String nama;
    private Konfigurasi konfigurasi;

    public Ruangan(){
        nama = "Ruang Kelas";
        ArrayList<String> list = new ArrayList<>();
        list.add("");
        Konfigurasi konfigurasi = new Konfigurasi(100, list);
   }

    public Ruangan(String nama, Konfigurasi konfigurasi){
        this.nama = nama;
        this.konfigurasi = konfigurasi;
    }


    public String getNama(){
        return nama;
    }

    public Konfigurasi getKonfigurasi(){
        return konfigurasi;
    }


    public void setNama(String nama){
        this.nama = nama;
    }

    public void setKonfigurasi(Konfigurasi konfigurasi){
        this.konfigurasi = konfigurasi;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<konfigurasi.getFasilitas().size(); ++i){
            sb.append(konfigurasi.getFasilitas().get(i)+" ");
        }
        return "("+konfigurasi.getJumlahKapasitas() + " " + sb.toString()+")";
    }

    //
//    public static void main(String[] args){
//        Ruangan room = new Ruangan("7602", 50, 3);
//    }
}
