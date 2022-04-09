package Recursion;

/**
 *
 * @author Masum Khan
 */
public class Non_Tail_Recursion {

    public static void main(String[] args) { // checked and revised at 09 April 22
        int n = 3;
        haha(n);
    }

    static void haha(int n) {
        if (n == 0) {
            return;
        }
        haha(n - 1);  // this function call is not the last thing done by the function itself. 
        System.out.println("--> " + n);  // here's something to be evaluated after recursive call.
    }
}
