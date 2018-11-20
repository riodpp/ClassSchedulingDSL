public class Kelas extends MataKuliah{
    private String nama, kode;
    private int kapasitas;
    private String ruangan;
    private String pengajar;
    private String day, kodeJam;

    public Kelas(){
        super();
    }

    public Kelas(String nama, String kode, int kapasitas, String ruangan, String pengajar, String day, String kodeJam){
        super(nama, kode);
        this.kapasitas = kapasitas;
        this.ruangan = ruangan;
        this.pengajar = pengajar;
        this.day = day;
        this.kodeJam= kodeJam;
    }

    @java.lang.Override
    public String getNama() {
        return nama;
    }

    @java.lang.Override
    public void setNama(String nama) {
        this.nama = nama;
    }

    @java.lang.Override
    public String getKode() {
        return kode;
    }

    @java.lang.Override
    public void setKode(String kode) {
        this.kode = kode;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    public String getRuangan() {
        return ruangan;
    }

    public void setRuangan(String ruangan) {
        this.ruangan = ruangan;
    }

    public String getPengajar() {
        return pengajar;
    }

    public void setPengajar(String pengajar) {
        this.pengajar = pengajar;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getKodeJam() {
        return kodeJam;
    }

    public void setKodeJam(String kodeJam) {
        this.kodeJam = kodeJam;
    }

}
