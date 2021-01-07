/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Number_Theory;

/**
 *
 * @author Masum_Khan
 */
public class Chinese_Remainder_inverse_mod_based {

    public static void main(String[] args) {
        int dividers[] = {5, 7, 8};
        int remainders[] = {3, 1, 6};
        int result = 0, temp;

        int product = 1;

        for (int i = 0; i < dividers.length; i++) {
            product *= dividers[i];
        }
        // System.out.println("product of divisers: " + product);
        //
        for (int i = 0; i < dividers.length; i++) {
            temp = 0;
            temp = product / dividers[i];

            if ((product / dividers[i]) % dividers[i] == 1) {
                temp = temp * remainders[i];
            } else {
                temp = temp * remainders[i] * get_modulo_inverse(temp, dividers[i]);
            }
            //System.out.println("temp: " + i + " " + temp);
            result += temp;
        }
        //
        System.out.println("final output: " + result % product);
    }

    static int get_modulo_inverse(int n_i, int mod_value) {

        //  System.out.println(n_i + "  ..  " + mod_value);
        int i = 1;

        while (true) {
            if (((n_i % mod_value) * i) % mod_value == 1) {
                return i;
            }
            i++;
        }
    }
}
