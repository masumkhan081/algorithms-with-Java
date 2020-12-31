/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Number_Theory;

import java.util.Scanner;

/**
 *
 * @author Masum_Khan
 */
public class Modular_multiplicative_inverse {

    public static void main(String[] args) {

        int multiplicative_1, divider, multiplicative_2;
        while (true) {
            multiplicative_2 = 0;
            Scanner scn = new Scanner(System.in);
            System.out.print("multiplicative-1: ");
            multiplicative_1 = scn.nextInt();
            System.out.print("divider: ");
            divider = scn.nextInt();

            for (int i = 1; i < divider; i++) {
                if (i * multiplicative_1 % divider == 1) {
                    multiplicative_2 = i;
                    break;
                }
            }
            System.out.println("multiplicative-2: " + multiplicative_2 + " ;  (" + multiplicative_1 + " * "
                    + multiplicative_2 + " % " + divider + " == 1 )");
        }

    }

}
