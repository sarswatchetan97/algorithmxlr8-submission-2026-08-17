import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        // Write your solution here.
        // Print s with only its vowels reversed in place.
        char[] words = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;

        String vowels = "aeiouAEIOU";

        while (start < end) {

            while (start < end && vowels.indexOf(words[start]) == -1) {
                start++;
            }

            while (start < end && vowels.indexOf(words[end]) == -1) {
                end--;
            }

            char temp = words[start];
            words[start] = words[end];
            words[end] = temp;

            start++;
            end--;
        }

        String ans = new String(words);
        System.out.println(ans);
    }
}
