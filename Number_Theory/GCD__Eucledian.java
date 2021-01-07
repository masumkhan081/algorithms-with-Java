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
public class GCD__Eucledian {

    //  Implemented Based on : https://youtu.be/b1ZV2VzNqAo
    //
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        while (true) {
            System.out.print("1st number:  ");
            int a = scn.nextInt();
            System.out.print("2nd number:  ");
            int b = scn.nextInt();

            int q, r1, r2, r = 1;

            if (a > b) {
                r1 = a;
                r2 = b;
            } else {
                r1 = b;
                r2 = a;
            }
            // if smaller value is zero or both zero gcd remains r1
            if (r2 == 0) {
                System.out.println("GCD: " + r1);
            } else {
                while (r >= 1) {
                    q = r1 / r2;
                    r = r1 % r2;
                    r1 = r2;
                    r2 = r;
                }
                // the moment r is 0 , r1 value is the gcd 
                System.out.println("GCD: " + r1);
            }
            System.out.println("");
        }

    }

}
