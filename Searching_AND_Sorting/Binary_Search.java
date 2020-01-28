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
public class Binary_Search {

    public static void main(String[] args) {

        int init, end, mid, num_To_Find;
        int arr_inputs[] = {1, 3, 5, 7, 9, 11, 17, 78, 900, 2344, 4444, 5670, 10000, 10001, 10002, 10003, 10004};
        Scanner scn = new Scanner(System.in);
        while (true) {
            System.out.println("\nnumber to be found: ");
            num_To_Find = scn.nextInt();
            init = 0;
            end = arr_inputs.length;
            mid = (init + end) / 2;

            while (init <= end) {
                if (arr_inputs[mid] < num_To_Find) {
                    init = mid + 1;
                } else if (arr_inputs[mid] == num_To_Find) {
                    System.out.println("The Number Is Fucked Up At Index: " + mid);
                    break;
                } else {
                    end = mid - 1;
                }
                mid = (init + end) / 2;
            }
            if (init > end) {
                System.out.println("No Such Value.");
            }
        }

    }
}
