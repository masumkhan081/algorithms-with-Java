package Recursion;

/**
 *
 * @author Masum Khan
 */
public class Non_Tail_Recursion {

    public static void main(String[] args) {        // checked and revised at 09 April 22
        int n;

        example_1(3);
        // 
        System.out.println("\n\n Number of division by 2: " + example_2(16));
        System.out.println("\n\n Number of division by 2: " + example_2(8));
    }

    static int example_2(int n) { // counts how much division by 2 is possile untill n is equal 1.
        if (n == 1) {
            return 0;
        } else {
            return 1 + example_2(n / 2);  // addition of 1 is after recursive call.
        }
    }

    static void example_1(int n) {
        if (n == 0) {
            return;
        }
        example_1(n - 1);  // this function call is not the last thing done by the function itself. 
        System.out.println("--> " + n);  // here's something to be evaluated after recursive call.
    }
}
