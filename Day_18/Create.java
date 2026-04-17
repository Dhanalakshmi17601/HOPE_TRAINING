import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Create {
    public static void main(String[] args) {
        {
            try{
                File newFile=new File("test1.txt");
                if(newFile.createNewFile())
                {
                    System.out.println("File Created");
                }
                else{
                    System.out.println("Not able to create file");
                }
            }
            catch(IOException e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
    
}
