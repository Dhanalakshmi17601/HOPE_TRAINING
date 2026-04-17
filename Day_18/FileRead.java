import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class FileRead {
    public static void main(String[] args) {

        try {
            FileReader fr = new FileReader("test2.txt");
            int character;
            while ((character = fr.read()) != -1) {
                System.out.println((char) character);
            }
        } catch (IOException e) {
            System.out.println(e);

        }
        try {
            BufferedReader br = new BufferedReader(new FileReader("test2.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e);

        }
    }

}
