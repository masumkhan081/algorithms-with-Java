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
public class Indirect_Recursion {

    static int n = 1;

    public static void main(String[] args) {

        new Indirect_Recursion().odd();
    }

    public void odd() {
        if (n <= 10) {
            System.out.println(" __ " + (n + 1));
            n++;
            even();
        }
        return;
    }

    public void even() {
        if (n <= 10) {
            System.out.println(" __ " + (n - 1));
            n++;
            odd();
        }
        return;
    }
}
