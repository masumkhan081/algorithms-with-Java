/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Number_Theory;

import java.util.Scanner;

/**
 *
 * @author Masum_Khan
 */
public class Binomial_Coefficient_SpaceOptimized {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        while (true) {
            System.out.print("n:  ");
            int n = scn.nextInt();
            System.out.print("k:  ");
            int k = scn.nextInt();

            System.out.println("Fucking Coefficient Is: " + get_binomial_coeff(n, k));
        }
    }

    static int get_binomial_coeff(int n, int k) {
        int arr[] = new int[k + 1];
        arr[0] = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = Math.min(i, k); j > 0; j--) {
                arr[j] = arr[j] + arr[j - 1];
            }
        }
        return arr[k];
    }
}
