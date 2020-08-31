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
                                          System.out.print("r:  ");
                                          int r = scn.nextInt();

                                          r = Math.min(n, r);
                                          n = Math.max(n, r);

                                          int the_Coefficient = get_binomial_coeff(n, r);
                                          System.out.println("Fucking Coefficient Is: " + the_Coefficient);
                            }
              }

              static int get_binomial_coeff(int n, int r) {
                            int arr[] = new int[r + 1];
                            arr[0] = 1;

                            for (int i = 1; i <= n; i++) {
                                          for (int j = Math.min(i, r); j > 0; j--) {
                                                        arr[j] = arr[j] + arr[j - 1];
                                          }
                            }
                            return arr[r];
              }
}
