package Recursion;

/**
 *
 * @author Masum Khan
 */
public class Indirect_Recursion {       // checked and revised at 09 April 22

    /*
    Problem is simply to print numbers 1 to 10 in a way that when number is odd, add 1 to it
    and when even subtract 1 from it. 
     */
    public static void main(String[] args) {
        odd(1);
    }

    static void odd(int n) {
        if (n <= 10) {
            System.out.println("--> " + (n + 1));
            n++;
            even(n);  // odd func doesn't call itself but that happens indirectly via even function
        }
        return;
    }

    static void even(int n) {
        if (n <= 10) {
            System.out.println("--> " + (n - 1));
            n++;
            odd(n);
        }
        return;
    }
}
