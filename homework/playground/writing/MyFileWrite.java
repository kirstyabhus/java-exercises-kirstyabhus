import java.io.BufferedWriter;
import java.io.FileWriter;

public class MyFileWrite {
    public static void main(String[] args) {

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("hello.txt"));
            writer.write("hi there its kirsty");
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
