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
public class Selection_Sort {

    public static void main(String[] args) {
        int pol, min, i, j, ind = 0, temp, number_of_elements;
        int arr[] = new int[10000];
        Scanner scn = new Scanner(System.in);

        while (true) {
            System.out.println("Number Of Elements: ");
            number_of_elements = scn.nextInt();
            for (i = 0; i < number_of_elements; i++) {
                arr[i] = scn.nextInt();
            }

            for (i = 0; i < number_of_elements - 1; i++) {
                min = arr[i];
                ind = i;
                for (j = i + 1; j < number_of_elements; j++) {
                    if (arr[j] < min) {
                        min = arr[j];
                        ind = j;
                    }
                }
                temp = arr[i];
                arr[i] = min;
                arr[ind] = temp;
            }
            System.out.println("Fucked up Values Are: ");
            for (i = 0; i < number_of_elements; i++) {
                System.out.println(" ____ " + arr[i]);
            }
        }
    }
}
