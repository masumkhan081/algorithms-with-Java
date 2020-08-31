
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

import java.util.*;

/**
 *
 * @author Masum Khan
 */
public class Binomial_Coefficient_RecursionApproach {

              public static void main(String[] args) {

                            int n = 5, r = 2;
//                       n=3 ; r=2;          // test case-2
//                         n= 7; r=3;       //  test case-3

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
