/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dynamic_Algorithm;

import java.util.Scanner;

/**
 *
 * @author Masum_Khan
 */
public class Binomial_Coefficient_Using_DynamicProgramming {

              public static void main(String args[]) {
                            Scanner scn = new Scanner(System.in);
                            while (true) {
                                          System.out.print("n:  ");
                                          int n = scn.nextInt();
                                          System.out.print("r:  ");
                                          int r = scn.nextInt();

                                          r = Math.min(n, r);
                                          n = Math.max(n, r);

                                          int the_Coefficient = get_binomial_coeff(n, r);
                                          System.out.println("Coefficient Is: " + the_Coefficient + "\n");
                            }
              }

              static int get_binomial_coeff(int n, int r) {
                            int[][] arr = new int[n + 1][r + 1];
                            int i, j;

                            for (i = 0; i <= n; i++) {
                                          for (j = 0; j <= Math.min(i, r); j++) {
                                                        if (j == 0 || j == i) {
                                                                      arr[i][j] = 1;
                                                        } else {
                                                                      arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                                                        }
                                          }
                            }
                            for (i = 0; i <= n; i++) {
                                          System.out.println("");
                                          for (j = 0; j <= r; j++) {
                                                        System.out.print("  " + arr[i][j]);
                                          }
                            }
                            System.out.println("");
                            return arr[n][r];
              }
}
