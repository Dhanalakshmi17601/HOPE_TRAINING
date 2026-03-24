package Day_2;
import java.util.*;

public class pattern2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
        System.out.print(j+" ");
        }
        System.out.println();
        }
    }
}


// 5
// 1 
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5
