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
public class Factorial {

    static int result;

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        while (true) {
            int n = scn.nextInt();
            System.out.println("> " + factorial(n));
        }
    }

    static int factorial(int n) {
        if (n == 1) {
            return n;
        } else {
            return n * factorial(n - 1);
        }
    }

}
