/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Searching_And_Sorting;

import java.util.Scanner;

/**
 *
 * @author Masum Khan
 */
public class Linear_search {

    public static void main(String[] args) {

        int i, key, arr[], num_of_elmnt;
        boolean sign;
        Scanner scn = new Scanner(System.in);
        //
        while (true) {
            System.out.print("\nEnter number of elements: ");
            num_of_elmnt = scn.nextInt();
            arr = new int[num_of_elmnt];

            for (i = 0; i < num_of_elmnt; i++) {
                arr[i] = scn.nextInt();
            }
            //
            System.out.print("Key: ");
            key = scn.nextInt();
            sign = false;
            for (i = 0; i < arr.length; i++) {
                if (arr[i] == key) {
                    sign = true;
                    System.out.println("\tFound At Index: " + i);
                    break;
                }
            }
            if (sign == false) {
                System.out.println("No Such value");
            }

        }

    }
}
