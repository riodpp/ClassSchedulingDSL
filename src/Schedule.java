import java.util.ArrayList;
import java.util.List;



public class Schedule {
    private List<Jadwal> schedule;

    public Schedule(){
        schedule = new ArrayList<>();
    }

    public void addJadwal(Jadwal jadwal){
        schedule.add(jadwal);
    }

    public List<Jadwal> getJadwal(){
        return schedule;
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

    public static void prinScheduleperHari(Schedule schedule) {
        schedule.sortJadwal();
        if (schedule.getJadwal().size() == 0) {
            System.out.println("Tidak ada Jadwal Kuliah yang didaftarkan");
        } else {
            System.out.println("Jadwal : ");
            String curday = schedule.getJadwal().get(0).getHari();
            System.out.println("Hari "+curday+":");
            for(int i=0; i<schedule.schedule.size(); i++){
                if (!curday.equals(schedule.schedule.get(i).getHari())) {
                    curday = schedule.schedule.get(i).getHari();
                    System.out.println(("Hari "+curday+":"));
                }
                System.out.println(schedule.schedule.get(i).getWaktu()[Integer.parseInt(schedule.schedule.get(i).getKodeJam())]+
                                    " ->" + schedule.schedule.get(i).getRuangan().toString()+
                                    "\n\t\t"+schedule.schedule.get(i).getMatkul().toString()+
                                    "\n\t\tPreferensi Matakuliah : "+schedule.schedule.get(i).getPreforw() +
                                    "\n"

                );
            }
        }

    }

    public static void printSchedule(Schedule schedule){
        System.out.println("Jadwal...");
        schedule.sortJadwal();
        System.out.println("Ukuran Jadwal : "+schedule.schedule.size());
        for(int i=0; i<schedule.schedule.size(); i++){
            System.out.println(schedule.schedule.get(i).toString());
        }
    }
}