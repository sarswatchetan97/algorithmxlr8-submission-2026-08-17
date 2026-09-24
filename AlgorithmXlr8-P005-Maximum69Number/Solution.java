import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();

        // Write your solution here.
        // Print the maximum number after changing at most one digit 6 to 9.
        char[] arr = num.toCharArray();

        for (int i=0; i<arr.length; i++) {
            if (arr[i] == '6') {
                arr[i] = '9';
                break;
            }
        }

        int result = Integer.parseInt(new String(arr));
        System.out.println(result);
    }
}
