public class Jadwal {
    private String day,kodeJam,preforw;
    private Ruangan ruangan;
    private MataKuliah matkul;

    public Jadwal() {
    }

    public Jadwal(String day, String kodeJam, Ruangan ruangan, MataKuliah matkul, String preforw) {
        this.kodeJam = kodeJam;
        this.day = day;
        this.preforw = preforw;
        this.ruangan = ruangan;
        this.matkul = matkul;
    }

    public String getHari() {
        return day;
    }

    public String getJam() {
        return kodeJam;
    }

    public String getPreforw() {return preforw;}

    public Ruangan getRuangan() {return ruangan;}

    public MataKuliah getMatkul() {return matkul;}

    public void setHari(String day) {
        this.day = day;
    }

    public void setJam(String jam) {
        this.kodeJam = jam;
    }

    public void setPreforw(String preforw) {
        this.preforw = preforw;
    }

    public void setRuangan(Ruangan ruangan) {
        this.ruangan = ruangan;
    }

    public void setMatkul(MataKuliah matkul) {
        this.matkul = matkul;
    }

    @Override
    public String toString() {
        return getHari()+" "+getJam()+" -> "+getRuangan().getNama()+" "+getRuangan().toString()+" "+getMatkul().toString()+" "+getRuangan().toString()+" "+getPreforw();
    }
}
