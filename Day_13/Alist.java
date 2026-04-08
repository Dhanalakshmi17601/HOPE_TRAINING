package Day_13;
import java.util.ArrayList;
import java.util.Arrays;

public class Alist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2,4,2,3, 4, 5, 6, 7));

        for(int i=0;i<list.size();i++)
        {
            if(list.get(i)%2==0)
            {
                list.remove(list.get(i));
                i--;

            }
        }
        System.out.println(list);

    }

}
