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
public class Fibonacci {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        while (true) {
            System.out.println("n: ");
            int n = scn.nextInt();
            System.out.println(n + " th Fibonacci number is: " + new Fibonacci().get_fibonacci(n));
        }
    }

    int get_fibonacci(int n) {

        if (n <= 1) {
            return n;
        } else {
            return get_fibonacci(n - 1) + get_fibonacci(n - 2);
        }
    }

}
