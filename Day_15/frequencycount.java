import java.util.*;

public class frequencycount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = { 1, 3, 4, 2, 2, 2, 1, 3, 4, 5 };
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        // for (int i = 0; i < nums.length; i++) {
        // if (map.containsKey(nums[i])) {
        // map.put(nums[i], map.get(nums[i]) + 1);
        // } else {
        // map.put(nums[i], 1);
        // }
        // }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "->" + entry.getValue());

        }
    }

}
