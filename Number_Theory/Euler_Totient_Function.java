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
public class Euler_Totient_Function {

    // implemented based on:  https://youtu.be/ZBkpYKGPHUs
    //
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n, num_phi;
        while (true) {

            System.out.print("n:  ");
            n = scn.nextInt();
            num_phi = 1;
            for (int i = 2; i < n; i++) {
                if (get_gcd(i, n) == 1) {
                    num_phi++;
                }
            }
            System.out.println("phi(" + n + "):  " + num_phi);
        }
    }

    static int get_gcd(int i, int n) {

        int q, r1 = n, r2 = i, r = 1;

        while (r >= 1) {
            q = r1 / r2;
            r = r1 % r2;
            r1 = r2;
            r2 = r;
        }
        // the moment r is 0 , r1 value is the gcd 

        return r1;
    }
}
