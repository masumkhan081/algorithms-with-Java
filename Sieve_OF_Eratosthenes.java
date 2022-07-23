/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Number_Theory;

import java.util.Scanner;

/**
 *
 * @author Masum Khan
 */
public class Sieve_OF_Eratosthenes {      // checked: 23.07.22

    /*  
        104729 is the 10000th prime
    	7919 is 1000 th prime
        541 is 100th prime
     */
    public static void main(String[] args) {

        int n, i, j;
        Scanner scn = new Scanner(System.in);
        while (true) {
            System.out.println("#. prime numbers untill 'n' to be listed"); // .
            System.out.print("n=? : ");
            n = scn.nextInt();

            boolean arr_bool[] = new boolean[n + 1];

            for (i = 2; i * i <= n; i++) {
                if (arr_bool[i] == false) {
                    for (j = i * i; j <= n; j += i) {
                        arr_bool[j] = true;
                    }
                }
            }
            int count = 1;
            for (i = 2; i <= n; i++) {
                if (arr_bool[i] == false) {
                    System.out.println(count + " th:  " + i);
                    count++;
                }
            }
        }
    }
}
