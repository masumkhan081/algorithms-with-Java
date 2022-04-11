import java.util.*;

/**
 *
 * @author Masum Khan
 */
public class Binomial_Coefficient_RecursionApproach {          // checked and revised at 11 April 22
// src:   https://youtu.be/R6HHjzElTUM
    public static void main(String[] args) {

        int n = 5, r = 2; 
       
        int the_coefficient = get_binomial_coeff(n, r);
        System.out.println("Binomial Coefficient: " + the_coefficient);
    }

    static int get_binomial_coeff(int n, int r) {

        if (r == 0 || r == n) {
            return 1;
        }
        return get_binomial_coeff(n - 1, r - 1)
                + get_binomial_coeff(n - 1, r);
    }
}
 /*  TEST CASE
                 n=3 ; r=2;  
                 n= 7; r=3; 
*/
