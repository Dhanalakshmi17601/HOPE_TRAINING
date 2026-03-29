import java.util.*;

public class even_word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len=0;
        StringBuilder even=new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=' ')
            {
                if(i==0||str.charAt(i-1)==' ')
                {
                    len=0;
                    even.setLength(0);
                }
                len++;
                even.append(str.charAt(i));
            }
            else{
                if(len%2==0)
                {
                    System.out.print(even.toString());
                    System.out.print(' ');
                    
                }
            }
        }
            //handles Last word
            if(len%2==0)
            {
                System.out.print(even.toString());
            }
    }
}


