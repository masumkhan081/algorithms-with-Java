/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Searching_And_Sorting;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Masum Khan
 */
public class Bubble_Sort {

    public static void main(String[] args) {

        int temp, num_of_elements;
        Scanner scn = new Scanner(System.in);

        while (true) {
            System.out.print("\nnumber of elements: ");
            num_of_elements = scn.nextInt();

            int arr[] = new int[num_of_elements];

            for (int i = 0; i < num_of_elements; i++) {
                arr[i] = scn.nextInt();
            }

            for (int i = 0; i < num_of_elements; i++) {
                for (int j = i + 1; j < num_of_elements; j++) {
                    if (arr[j] < arr[i]) {
                        temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                    }
                }
            }
            System.out.println("Sorted Values Are: ");
            for (int i = 0; i < num_of_elements; i++) {
                System.out.print(arr[i] + ", ");
            }
            System.out.println("\n");

        }
    }
}
