package Day_3;
import java.util.*;
public class StringTest {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] str1=str.trim().split("\\s+");
        int count=0;
        for(String s:str1)
        {
            count++;
        }
        System.out.println(count);
    }
    
}
