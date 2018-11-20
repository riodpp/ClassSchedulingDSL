import java.util.List;

public class Ruangan {
    private String nama;
    private int kapasitas;
    private List<String> fasilitas;

    public Ruangan(){
        nama = "Ruang Kelas";
        kapasitas = 50;
        this.fasilitas = null;
    }

    public Ruangan(String nama, int kapasitas, boolean laptop, boolean papanTulis){
        this.nama = nama;
        this.kapasitas = kapasitas;
        this.fasilitas = fasilitas;
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
}
