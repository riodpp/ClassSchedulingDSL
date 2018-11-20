import java.util.ArrayList;
import java.util.List;

public class Schedule {
    private List<Jadwal> schedule;

    public Schedule(){
        schedule = new ArrayList<>();
    }

    public void addJadwal(Jadwal jadwal){
        getJadwal().add(jadwal);
    }

    public List<Jadwal> getJadwal(){
        return schedule;
    }

    public static void printSchedule(Schedule jadwal){
        System.out.println("Jadwal...");
        for (Jadwal e : jadwal.getJadwal()) {
            System.out.println(e);
        }
    }
}