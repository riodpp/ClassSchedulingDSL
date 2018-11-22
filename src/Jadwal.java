public class Jadwal {

    private String day,kodeJam,preforw;
    private Ruangan ruangan;
    private MataKuliah matkul;
    private String[] waktu = new String[]{"","07-08","08-09","09-10","10-11","11-12","12-13","13-14","14-15","15-16","16-17","17-18"};

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

    public String getKodeJam() {
        return kodeJam;
    }

    public String getPreforw() {return preforw;}

    public Ruangan getRuangan() {return ruangan;}

    public MataKuliah getMatkul() {return matkul;}
    public String[] getWaktu() {return  waktu;}

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

    public String jadwalTanpaHari() {
        return getWaktu()[Integer.parseInt(getKodeJam())]+" -> "+getRuangan().toString()+" "+getMatkul().toString()+" "+getPreforw();
    }
    @Override
    public String toString() {
        return "Hari : " +getHari()+" "+getWaktu()[Integer.parseInt(getKodeJam())]+" -> "+getRuangan().toString()+" "+getMatkul().toString()+" "+getPreforw();
    }
}
