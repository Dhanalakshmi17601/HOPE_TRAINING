import java.util.*;

public class Find_header {
    public static int[] Header(int[] nums) {
        int n = nums.length;
        int start = 0;
        int end = n - 1;
        int ind = 0;

        int first_index = n - 2;
        int second_index = n - 1;

        int[] result = new int[n];
        result[ind++] = nums[second_index];

        while (first_index >= 0) {
            if (nums[first_index] > nums[second_index]) 
            {
                result[ind++] = nums[first_index];
                second_index = first_index;
                
            } 
            first_index--;
            
        }
        int s=0,e=ind-1;
        while (s <=  e) {
            int temp = result[s];
            result[s] = result[e];
            result[e] = temp;

            s++;
            e--;
        }
        return Arrays.copyOf(result,ind);
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print(Arrays.toString(Header(arr)));
    }

}
