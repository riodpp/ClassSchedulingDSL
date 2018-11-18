public class Jadwal {
    private String day,kodeJam;

    public Jadwal() {
    }

    public Jadwal(String day, String kodeJam) {
        this.kodeJam = kodeJam;
        this.day = day;
    }

    public String getHari() {
        return day;
    }

    public String getJam() {
        return kodeJam;
    }

    public void setHari(String day) {
        this.day = day;
    }

    public void setJam(String jam) {
        this.kodeJam = jam;
    }
}
