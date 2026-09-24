import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Write your solution here.
        // Print F(n).
        System.out.println(Main.fib(n));
    }

    public static int fib(int n) {
            if (n<=1) {
                return n;
            }
            return fib(n-1) + fib(n-2);
        }
}
