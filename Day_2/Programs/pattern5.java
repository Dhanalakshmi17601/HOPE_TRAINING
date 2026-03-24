package Day_2;
import java.util.*;

public class pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p=2*n-1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <i; j++) {
                    System.out.print("  ");
            }
            for(int k=0; k<p;k++){
                System.out.print("* ");
            }
            System.out.println();
            p-=2;
            
        }
    }
}

// 5
// * * * * * * * * * 
//   * * * * * * *
//     * * * * *
//       * * *
//         *