import java.util.*;
public class K_pattern {
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int spaces=str.length()-2;
        for(int i=0;i<str.length();i++)
        {
            System.out.print(str.charAt(i));
            while(spaces>0)
            {
                System.out.print(' ');
                spaces--;
            }
            for(int j=str.length()-1;j>0;j--)
            {
                System.out.print(str.charAt(j));
            }
            System.out.println();
        }
    }
}
