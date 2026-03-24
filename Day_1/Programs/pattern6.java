package Day_2;
import java.util.*;

public class pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "");
            }
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            System.out.print(" ");
            for (int j = i; j >= 1; j--) {
                System.out.print(j + "");
            }
            System.out.println();
        }

    }

}
