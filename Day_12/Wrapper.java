import java.util.*;

public class Wrapper {
    
    public static int test1(String s){
        return Integer.parseInt(s);
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Integer a=Integer.valueOf("1234");//return type -> object(Integer)
        Integer c=Integer.parseInt("0345");// return typeb-> int(int)
        System.err.println(a);
        System.err.println(c);

        // String s=sc.next();
        // System.err.println(test1(s));

        int val=a.intValue();// integer -> int
        System.err.println(val);
       
        Integer x=100;
        Integer y=100;
        System.err.println(x==y);
        Integer v1=200;                  
        Integer v2=200;
        System.err.println(v1==v2); //Integer value must be in -128 to 127




        
    }
    
}
