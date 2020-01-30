/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

/**
 *
 * @author Masum Khan
 */
public class Non_Tail_Recursion_2 {

    public static void main(String[] args) {
        int n = 8;
        System.out.println("_ " + haha(n));
    }

    static int haha(int n) {
        if (n == 1) {
            return 0;
        } else {
            return 1 + haha(n / 2);
        }
    }

}
