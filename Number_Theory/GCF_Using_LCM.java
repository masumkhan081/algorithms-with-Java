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
public class GCF_Using_LCM {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int num1, num2, lcm, bigger_One;
        while (true) {
            System.out.print("num-1: ");
            num1 = scn.nextInt();
            System.out.print("num-2: ");
            num2 = scn.nextInt();

            if (num1 == 0 || num2 == 0) {
                continue;
            }
            if (num1 > num2) {
                bigger_One = num1;
            } else {
                bigger_One = num2;
            }
            lcm = bigger_One;
            while (true) {
                if (lcm % num1 == 0 && lcm % num2 == 0) {
                    break;
                }
                lcm += bigger_One;
            }
            System.out.println("GCF: " + (num1 * num2) / lcm + " \n\n");
        }
    }
}
