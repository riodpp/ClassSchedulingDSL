import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Main {

    /*
    Schedule
    HariJam
    Ruangan
    Konfigurasi
    Matkul
    */

    private static String getStringFromInputStream(InputStream is) {

        BufferedReader br = null;
        StringBuilder sb = new StringBuilder();

        String line;
        try {

            br = new BufferedReader(new InputStreamReader(is));
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return sb.toString();

    }

    public static void main(String[] args) throws IOException {
//        System.out.println("Hello World!");

        CharStream cs = CharStreams.fromFileName("D:\\tugas\\sem7\\rpsld\\ClassSchedulingDSL\\src\\resource\\schedule.gr");
        ScheduleLexer lexer = new ScheduleLexer(cs);
//
        CommonTokenStream tokens = new CommonTokenStream(lexer);
//
        ScheduleParser parser = new ScheduleParser(tokens);

        Schedule s = new Schedule();

        parser.addParseListener(new MyScheduleBaseListener((s)));

        parser.jadwal();

        Schedule.printSchedule(s);
        // coba2
//        String result = getStringFromInputStream(is);
//        System.out.println(result);
//        System.out.println(cs.toString());
//        System.out.println(lexer.toString());
//        System.out.println(tokens.getText());


    }

    static class MyScheduleBaseListener extends ScheduleBaseListener {

        Schedule s;

        public MyScheduleBaseListener(Schedule s){
            this.s = s;
        }

        @Override
        public void exitJadwal(ScheduleParser.JadwalContext ctx) {
            List<String> kelasList = new ArrayList<>();

            for (int i=0; i<ctx.konfigurasi(0).fasilitas().ALPHA().size(); ++i){
                kelasList.add(ctx.konfigurasi(0).fasilitas().ALPHA(i).getText());
            }
            List<String> matkulList = new ArrayList<>();

            for (int i=0; i<ctx.konfigurasi(1).fasilitas().ALPHA().size(); ++i){
                matkulList.add(ctx.konfigurasi(1).fasilitas().ALPHA(i).getText());
            }
            Konfigurasi konfigurasiRuangan = new Konfigurasi(Integer.parseInt(ctx.konfigurasi(0).kapasitas().getText()), kelasList);
            Ruangan ruangan = new Ruangan(ctx.ruangan().getText(), konfigurasiRuangan);

            Konfigurasi konfigurasiMatkul = new Konfigurasi(Integer.parseInt(ctx.konfigurasi(1).kapasitas().getText()), matkulList);
            MataKuliah matkul = new MataKuliah(ctx.matkul().getText(), konfigurasiMatkul);

            String jam = ctx.jam().getText();
            String hari = ctx.hari().getText();

            String preforw = ctx.preforw().getText();
            Jadwal j = new Jadwal(hari, jam, ruangan, matkul, preforw);

            s.addJadwal(j);
        }
    }
}
