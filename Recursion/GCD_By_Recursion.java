/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

import java.util.Scanner;

/**
 *
 * @author Masum Khan
 */
public class GCD_By_Recursion {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("1st number: ");
        int a = scn.nextInt();
        System.out.println("2nd number: ");
        int b = scn.nextInt();
        int temp;

        if (a < b) {
            a = a + b - (b = a);
        }
        int gcd = new GCD_By_Recursion().get_GCD(a, b);
        System.out.println("Greatest : " + gcd);
    }

    int get_GCD(int r1, int r2) {
        if (r2 == 0) {
            return r1;
        } else {
            return get_GCD(r2, r1 % r2);
        }

    }
}
