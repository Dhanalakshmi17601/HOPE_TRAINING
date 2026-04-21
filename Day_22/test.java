import java.util.*;
import java.util.Arrays;

// class test {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int[] nums = { 0, 1, 7, 4, 4, 5 };
//         int lower = sc.nextInt();
//         int upper = sc.nextInt();
//         int count = 0;

//         // for (int i = 0; i < nums.length; i++) {
//         // for (int j = i + 1; j < nums.length; j++) {
//         // int sum = nums[i] + nums[j];
//         // if (sum >= lower && sum <= upper) {
//         // count++;
//         // }
//         // }
//         // }

//         System.out.println(count);
//     }
// }

class test {

    public static long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);

        return countPairs(nums, upper) - countPairs(nums, lower - 1);
    }

    // count pairs with sum <= target
    private static long countPairs(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        long count = 0;

        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum <= target) {
                count += (right - left); // all pairs valid
                left++;
            } else {
                right--;
            }
        }
        return count;
    }

    // main method for testing
    public static void main(String[] args) {
        int[] nums = { 0, 1, 7, 4, 4, 5 };
        int lower = 3;
        int upper = 6;

        long result = countFairPairs(nums, lower, upper);
        System.out.println(result); // Output: 6
    }
}