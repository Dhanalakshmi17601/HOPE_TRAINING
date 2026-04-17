import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class Writer {
    public static void main(String[] args) {
        // try {
        //     FileWriter writer = new FileWriter("test.txt"); // slow method-each and every time it will open and write
        //     writer.write("Write using FileWriter1");
        //     writer.write("Write using FileWriter2");
        //     writer.write("Write using FileWriter3");
        //     writer.close();
        // } catch (IOException e) {
        //     System.out.println(e);
        // }


        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("test2.txt")); // first store in RAm ,then it will check if RAM is full and after closing the file it will writ.
            writer.write("Write using BufferedWriter1");
            writer.newLine();
            writer.write("Write using BufferedWriter2");
            writer.newLine();
            writer.write("Write using BufferedWriter3");
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            System.out.println(e);
        }

    }

}
