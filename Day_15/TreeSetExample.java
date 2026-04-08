import java.util.*;

public class TreeSetExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> set = new TreeSet<>();

        int arr[] = { 10, 15, 20, 25, 40, 60 };
        int target = sc.nextInt();
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        Integer low = set.lower(target);
        Integer high = set.higher(target);
        if (low == null) {
            result = high;
        } else if (high == null) {
            result = low;
        } else {
            result = (target - low) >= (high - target) ? high : low;

        }

        System.out.println(result);
    }

}
