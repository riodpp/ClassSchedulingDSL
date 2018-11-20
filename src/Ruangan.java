import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ruangan {
    private String nama;
    private int kapasitas;
    private List<String> fasilitas;

    public Ruangan(){
        nama = "Ruang Kelas";
        kapasitas = 50;
        List<String> fasilitas = new ArrayList<String>();
    }

    public Ruangan(String nama, int kapasitas, List<String> fasilitas){
        this.nama = nama;
        this.kapasitas = kapasitas;
        this.fasilitas = fasilitas;
    }

    public Ruangan(String nama, int kapasitas, int jumlah_fasilitas){
        List<String> fasilitas = new ArrayList<String>();
        this.nama = nama;
        this.kapasitas = kapasitas;
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < jumlah_fasilitas; ++i){
            String item = sc.nextLine();
            fasilitas.add(item);
        }
    }

    public String getNama(){
        return nama;
    }

    public int getKapasitas(){
        return kapasitas;
    }

    public List<String> getFasilitas() {
        return fasilitas;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setKapasitas(int kapasitas){
        this.kapasitas = kapasitas;
    }

    public void setJumlahKapasitas(int kapasitas){
        this.kapasitas = kapasitas;
    }

    public void addfasilitas(String fasilitas) {
        this.fasilitas.add(fasilitas);
    }

    @Override
    public String toString() {
        return "("+kapasitas + " " + fasilitas+")";
    }

    //
//    public static void main(String[] args){
//        Ruangan room = new Ruangan("7602", 50, 3);
//    }
}
