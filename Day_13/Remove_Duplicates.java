
import java.util.ArrayList;
import java.util.Arrays;

public class Remove_Duplicates {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,9,2,4,4,5,6));
        for(int i=0;i<list.size();i++)
        {
            for(int j=i+1;j<list.size();j++)
            {
                if(list.get(i)==list.get(j))
                {
                    list.remove(list.get(j));
                 
                }
            }
            
        }
        System.out.println(list);
    }
    
}
