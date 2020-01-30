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
public class Direct_Recursion {

    public static void main(String[] args) {
        int n = 2;
        System.out.println(" Even Numbers Below 100: ");
        haha(n);
    }

    static int haha(int n) {
        System.out.println(".." + n);
        if (n == 100) {
            return 100;
        } else {
            return haha(n + 2);
        }
    }
}
