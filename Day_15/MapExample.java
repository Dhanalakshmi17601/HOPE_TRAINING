import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> map = new HashMap<>();
        int[] nums = { 1, 2, 3, 4, 6, 8, 4, 3 };
        for (int i = 0; i < nums.length; i++) {
            map.put(i, nums[i]);
        }
        System.out.println(map.keySet());

        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            System.out.println(entry.getKey()+" ->"+entry.getValue());

        }
    }

}
