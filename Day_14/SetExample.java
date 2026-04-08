import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        Set<Integer> LinkedList = new LinkedHashSet<>();
        Set<Integer> Hset = new HashSet<>();
        int[] arr = { 5, 46, 3,716, 75, 2 };

        for (int i : arr) {
            LinkedList.add(i);
            Hset.add(i);
        }
        System.out.println(LinkedList);
        System.out.println(Hset);
    }

}
