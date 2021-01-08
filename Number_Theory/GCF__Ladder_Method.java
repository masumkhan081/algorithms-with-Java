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
public class GCF__Ladder_Method {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int num1, num2, smaller_one, divisor, gcf;

        while (true) {
            System.out.print("num-1: ");
            num1 = scn.nextInt();
            System.out.print("num-2: ");
            num2 = scn.nextInt();
            if (num1 < num2) {
                divisor = num1;
            } else {
                divisor = num2;
            }
            divisor = (int) Math.sqrt(divisor) + 1;
            gcf = 1;
            while (divisor > 1) {
                if (num1 % divisor == 0 && num2 % divisor == 0) {
                    gcf *= divisor;
                    num1 = num1 / divisor;
                    num2 = num2 / divisor;
                } else {
                    divisor--;
                }
            }
            System.out.println("GCF: " + gcf + "\n\n");

        }
    }
}
