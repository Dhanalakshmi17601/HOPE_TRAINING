import java.util.*;

public class ShortestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int min_length = Integer.MAX_VALUE;
        StringBuilder shortest = new StringBuilder();
        StringBuilder shortest_word = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                if (i == 0 || str.charAt(i - 1) == ' ') {
                    shortest.setLength(0);
                }
                shortest.append(str.charAt(i));
            } else {
                if (shortest.length() < min_length) {
                    min_length = shortest.length();
                    shortest_word = new StringBuilder(shortest);
                }
            }
        }
        if (shortest.length() < min_length) {
            min_length = shortest.length();
            shortest_word = new StringBuilder(shortest);
        }
        System.out.println(shortest_word);
    }

}
