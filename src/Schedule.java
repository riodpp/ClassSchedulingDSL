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

    public static void printSchedule(Schedule schedule){
        System.out.println("Jadwal...");
        System.out.println("Ukuran Jadwal : "+schedule.getJadwal().size());
        for(int i=0; i<schedule.schedule.size(); i++){
            System.out.println(schedule.schedule.get(i).toString());
        }
    }
}