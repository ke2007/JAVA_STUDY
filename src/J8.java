import java.io.FileWriter;
import java.io.IOException;

public class J8 {


    public static void main(String[]/*문자열배열*/ args) throws IOException {

//        writeFileTwoTimes("a", "*");
        System.out.println(twoTimes("a", "-"));
        FileWriter fw = new FileWriter("out.txt");
        fw.write(twoTimes("a", "*"));
        fw.close();

    }
    public static String twoTimes(String text, String delimiter) {
        String out = "a";
        out = out + delimiter + "\n"; // out -> a-\n
        out = out + text + "\n";      // out -> a-\na\n
        out = out + text + "\n";      // out -> a-\na\na\n
        return out;
    }
}
