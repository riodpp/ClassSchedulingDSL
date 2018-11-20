public class Ruangan {
    private String nama;
    private int kapasitas;
    private boolean laptop, papanTulis;

    public Ruangan(){
        nama = "Ruang Kelas";
        kapasitas = 50;
        laptop = true;
        papanTulis = true;
    }

    public Ruangan(String nama, int kapasitas, boolean laptop, boolean papanTulis){
        this.nama = nama;
        this.kapasitas = kapasitas;
        this.laptop = laptop;
        this.papanTulis = papanTulis;
    }

    public String getNama(){
        return nama;
    }

    public int getKapasitas(){
        return kapasitas;
    }

    public boolean getLaptop(){
        return laptop;
    }

    public boolean getPapanTulis(){
        return papanTulis;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setKapasitas(int kapasitas){
        this.kapasitas = kapasitas;
    }

    public void setLaptop(boolean laptop){
        this.laptop = laptop;
    }

    public void setPapanTulis(boolean papanTulis){
        this.papanTulis = papanTulis;
    }
}
