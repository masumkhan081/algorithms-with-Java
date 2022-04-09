package Recursion;
/**
 *
 * @author Masum Khan
 */
public class Tail_Recursion {

    public static void main(String[] args) {  // checked and revised at 09 April 22
        int n = 3;
        haha(n);
    }
    static int haha(int n) {
        if (n == 0) {
            return 0;
        } else {
            System.out.println("--> " + n);
        }
      /* as recursive call is the last thing done by the function, so it's called tail recursion
          it's just an example to stand with the theory of it
      */
        return haha(n - 1);
    }
}
