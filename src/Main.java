import java.io.IOException;
import java.io.InputStream;
import org.antlr.v4.runtime.*;
import  org.antlr.v4.runtime.tree.*;


public class Main {

    /*
    Schedule
    HariJam
    Ruangan
    Konfigurasi
    Matkul
    */
    public static void main(String[] args) throws IOException {
//        System.out.println("Hello World!");
        InputStream is =
                ClassLoader.getSystemResourceAsStream("resources/graph.gr");

        CharStream cs = new ANTLRInputStream(is);

        ScheduleLexer lexer = new ScheduleLexer(cs);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        ScheduleParser parser = new ScheduleParser(tokens);
    }
}
