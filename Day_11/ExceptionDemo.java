import java.util.*;

public class ExceptionDemo {
    public static void main(String[] args)
    {
        try{
            // int a=8;
            // int b=0;
            // int c=a/b;
            // System.out.println(c);

            String s=null;
            System.out.println(s);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Number is divided by zero");
        }
        catch(NullPointerException e)
        {
            System.out.println("String value is null");
        }
        finally{
            System.out.println("Finally block is always excecute");
        }

    }
    
}
