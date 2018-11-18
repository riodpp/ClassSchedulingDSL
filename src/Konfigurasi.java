import java.util.List;

public class Konfigurasi {
    private int jumlahKapasitas;
    private List<String> fasilitas;

    public Konfigurasi(int jumlahKapasitas){
        this.jumlahKapasitas = jumlahKapasitas;
        this.fasilitas = null;
    }

    public Konfigurasi(int jumlahKapasitas, List<String> fasilitas) {
        this.jumlahKapasitas = jumlahKapasitas;
        this.fasilitas = fasilitas;
    }

    public int getJumlahKapasitas() {
        return jumlahKapasitas;
    }

    public List<String> getFasilitas() {
        return fasilitas;
    }

    public void setJumlahKapasitas(int kapasitas){
        this.jumlahKapasitas = kapasitas;
    }

    public void addfasilitas(String fasilitas) {
        this.fasilitas.add(fasilitas);
    }
}
