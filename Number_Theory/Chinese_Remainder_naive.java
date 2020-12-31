/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Number_Theory;

/**
 *
 * @author Masum Khan
 */
public class Chinese_Remainder_Theorem {

    // Naive Approach 
    public static void main(String args[]) {
        int dividers[] = {5, 7, 8};
        int remainders[] = {3, 1, 6};
        int count;

        int divisible = 1;
        while (true) {

            int i;
            count = dividers.length;
            for (i = 0; i < count; i++) {
                if (divisible % dividers[i] != remainders[i]) {
                    break;
                }
            }
            if (i == count) {
                System.out.println("Result:  " + divisible);
                break;
            }
            divisible++;
        }
    }
}
