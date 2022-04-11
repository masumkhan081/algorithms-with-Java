import java.util.Scanner;

/**
 *
 * @author Masum Khan
 */
public class Fibonacci {

    public static void main(String[] args) {        // checked and revised at 11 April 22
        Scanner scn = new Scanner(System.in);
        while (true) {
            System.out.print("n:  ");
            int n = scn.nextInt();
            System.out.println(n + "th Fibonacci number is: " + get_fibonacci(n));
        }
    }

    static int get_fibonacci(int n) {

        if (n <= 1) {
            return n;
        } else {
            return get_fibonacci(n - 1) + get_fibonacci(n - 2);
        }
    }
}
