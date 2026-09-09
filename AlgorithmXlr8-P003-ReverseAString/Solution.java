import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        // Write your solution here.
        // Print s reversed.
        char[] charArr = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;

        while (start <= end) {
            char temp = charArr[start];
            charArr[start] = charArr[end];
            charArr[end] = temp;

            start++;
            end--;
        }

        String answer = new String(charArr);
        System.out.println(answer);
    }
}
