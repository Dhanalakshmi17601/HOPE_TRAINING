import java.util.*;

public class first_NonRepeating_charater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] count = new int[26];
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : str.toCharArray()) {
            if (ch != ' ') {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
        }
        for (char ch : str.toCharArray()) {
            if (map.get(ch)==1) {
                System.out.println(ch);
                break;
            }
        }

    }

}
