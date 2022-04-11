import java.util.Scanner;

/**
 *
 * @author Masum Khan
 */
public class GCD_By_Recursion {        // checked and revised at 11 April 22

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("1st number: ");
        int a = scn.nextInt();
        System.out.println("2nd number: ");
        int b = scn.nextInt();

        if (a < b) {
            a = a + b - (b = a);    // if a is smaller, swapping a and b
        }
        System.out.println("Greatest Common Devisor: " + get_GCD(a, b));
    }

    static int get_GCD(int r1, int r2) {
        if (r2 == 0) {
            return r1;
        } else {
            return get_GCD(r2, r1 % r2);
        }

    }
}
