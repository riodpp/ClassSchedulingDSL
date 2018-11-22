import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Schedule {
    private List<Jadwal> schedule;
    private List<Integer> jadwalBentrok;

    public Schedule(){
        jadwalBentrok = new ArrayList<>();
        schedule = new ArrayList<>();
    }

    public void addJadwal(Jadwal jadwal){
        schedule.add(jadwal);
        jadwalBentrok.add(-1);
    }

    public List<Jadwal> getJadwal(){
        return schedule;
    }

    public int isBentrok(Jadwal j1, Jadwal j2) {
        String[] hari = new String[]{"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};


        int loc_hari_1 = 0;
        int loc_hari_2 = 0;
        for(int i=0; i < hari.length; ++i){
            if(hari[i].equals(j1.getHari())){
                loc_hari_1 = i;
            }
            if(hari[i].equals(j2.getHari())){
                loc_hari_2 = i;
            }
        }
        if(loc_hari_1 != loc_hari_2){
            return -1;
        } else if(loc_hari_1 == loc_hari_2){
            if(Integer.parseInt(j1.getKodeJam()) != Integer.parseInt(j2.getKodeJam())){
                return -1;
            } else if(Integer.parseInt(j1.getKodeJam()) == Integer.parseInt(j2.getKodeJam())){
                if(j1.getRuangan().getKodeRuangan().compareTo(j2.getRuangan().getKodeRuangan())==0){
                    return 1;
                } else {
                    return -1;
                }
            } else {
                return -1;
            }
        } else {
            return -1;
        }
    }

    public boolean isSmaller(Jadwal j1, Jadwal j2){
        String[] hari = new String[]{"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};


        int loc_hari_1 = 0;
        int loc_hari_2 = 0;
        for(int i=0; i < hari.length; ++i){
            if(hari[i].equals(j1.getHari())){
                loc_hari_1 = i;
            }
            if(hari[i].equals(j2.getHari())){
                loc_hari_2 = i;
            }
        }
        if(loc_hari_1 < loc_hari_2){
            return true;
        } else if(loc_hari_1 == loc_hari_2){
            if(Integer.parseInt(j1.getKodeJam()) < Integer.parseInt(j2.getKodeJam())){
                return true;
            } else if(Integer.parseInt(j1.getKodeJam()) == Integer.parseInt(j2.getKodeJam())){
                if(j1.getRuangan().getKodeRuangan().compareTo(j2.getRuangan().getKodeRuangan())<0){
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public List<Jadwal> sortJadwal(Schedule schedule){
        List<Jadwal> jadwalBaru = schedule.schedule;
        for(int i=0; i<jadwalBaru.size()-1; ++i){
            for(int j=0; j<jadwalBaru.size()-i-1; ++j){
                if(isSmaller(jadwalBaru.get(j+1), jadwalBaru.get(j))){
                    Jadwal temp = jadwalBaru.get(j);
                    jadwalBaru.set(j, jadwalBaru.get(j+1));
                    jadwalBaru.set(j+1, temp);
                }
            }
        }
        return jadwalBaru;
    }

    public void sortJadwal(){
        List<Jadwal> jadwalBaru = schedule;
        for(int i=0; i<jadwalBaru.size()-1; ++i){
            for(int j=0; j<jadwalBaru.size()-i-1; ++j){
                if(isSmaller(jadwalBaru.get(j+1), jadwalBaru.get(j))){
                    Jadwal temp = jadwalBaru.get(j);
                    jadwalBaru.set(j, jadwalBaru.get(j+1));
                    jadwalBaru.set(j+1, temp);
                }
            }
        }
        this.schedule =  jadwalBaru;
    }

    public void setJadwalBentrok() {
        for (int i = 0; i < schedule.size(); ++i) {
            if (indexBentrok(i) != -1) {
                jadwalBentrok.set(i,1);
            }
        }
    }

    public int indexBentrok(int index) {
        for(int i=0; i<schedule.size(); ++i){
            if (index != i) {
                if ((isBentrok(schedule.get(index), schedule.get(i)) == 1)) {
                    return i;
                }
            }
        }
        return -1;
    }

    private List<Integer> shouldRemoveIndex() {
        List<Integer> shouldremoveindex = new ArrayList<>();
        for (int i = 0; i < schedule.size(); ++i) {
            if (indexBentrok(i) != -1) {
                if (schedule.get(i).getPreforw().equals("W") && schedule.get(indexBentrok(i)).getPreforw().equals("P")  ) {
                    shouldremoveindex.add(indexBentrok(i));
                } else if (schedule.get(i).getPreforw().equals("P") && schedule.get(indexBentrok(i)).getPreforw().equals("W")) {
                    shouldremoveindex.add(i);
                } else if (schedule.get(i).getPreforw().equals("W") && schedule.get(indexBentrok(i)).getPreforw().equals("W")) {
                    jadwalBentrok.set(i,1);
                }
            }
        }
        return shouldremoveindex;


    }



    public static void prinScheduleperHari(Schedule schedule) {
        schedule.sortJadwal();
        schedule.setJadwalBentrok();
        String statusBentrok;
        String preferensiMatakuliah;
        if (schedule.getJadwal().size() == 0) {
            System.out.println("Tidak ada Jadwal Kuliah yang didaftarkan");
        } else {
            System.out.println("Jadwal : ");
            String curday = schedule.getJadwal().get(0).getHari();
            System.out.println("Hari "+curday+":");
            for(int i=0; i<schedule.schedule.size(); i++){
                if (!curday.equals(schedule.schedule.get(i).getHari())) {
                    curday = schedule.schedule.get(i).getHari();
                    System.out.println(("\nHari "+curday+":"));
                }
                if (schedule.indexBentrok(i) != -1) {
                    statusBentrok = " Terdapat Bentrok pada Jadwal ini";
                } else {
                    statusBentrok = " Tidak Terdapat Bentrok pada Jadwal ini";
                }

                if (schedule.schedule.get(i).getPreforw().equals("P")) {
                    preferensiMatakuliah = "Kelas Preferensi";
                } else {
                    preferensiMatakuliah ="Kelas Wajib";
                }

                System.out.println(schedule.schedule.get(i).getWaktu()[Integer.parseInt(schedule.schedule.get(i).getKodeJam())]+
                                    " ->" + schedule.schedule.get(i).getRuangan().toString()+
                                    "\n\t\t"+schedule.schedule.get(i).getMatkul().toString()+
                                    "\n\t\tJenis Kelas : "+ preferensiMatakuliah +
                                    "\n\t\tStatus Bentrok :" + statusBentrok
                );
            }
            System.out.println(schedule.shouldRemoveIndex().toString());
        }
    }

    public static void printSchedule(Schedule schedule){
        System.out.println("Jadwal...");
        schedule.sortJadwal();
        schedule.setJadwalBentrok();
        System.out.println("Ukuran Jadwal : "+schedule.schedule.size());
        for(int i=0; i<schedule.schedule.size(); i++){
            System.out.println(schedule.schedule.get(i).toString());
        }
    }
}