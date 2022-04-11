import java.util.Scanner;

/**
 *
 * @author Masum Khan
 */
public class Factorial {          // checked and revised at 11 April 22

    static int result;

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        while (true) {
            int n = scn.nextInt();
            System.out.println("Factorial: " + factorial(n));
        }
    }

    static int factorial(int n) {
        if (n == 1) {
            return n;
        } else {
            return n * factorial(n - 1);
        }
    }
}
