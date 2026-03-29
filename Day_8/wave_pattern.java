import java.util.*;

public class wave_pattern {
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder wave=new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            if(i%2==0)
            {
                wave.append(str.charAt(i));
            }
        }
        for(int i=0;i<str.length();i++)
        {
            if(i%2!=0)
            {
                wave.append(str.charAt(i));
            }
        }
        
        System.out.println(wave);
    }
}
