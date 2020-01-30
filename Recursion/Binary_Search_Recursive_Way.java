/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

import java.util.Scanner;

/**
 *
 * @author Masum Khan
 */
public class Binary_Search_Recursive_Way {

    public static void main(String[] args) {

        int arr_inputs[] = {1, 3, 5, 7, 9, 11, 17, 78, 900, 2344, 4444, 5670, 10000, 10001, 10002, 10003, 10004};
        Scanner scn = new Scanner(System.in);
        int len = arr_inputs.length;
        while (true) {
            System.out.println("number to be found: ");
            int num_To_Find = scn.nextInt();
            int the_Index = finder(arr_inputs, 0, len - 1, num_To_Find);
            if (the_Index == -1) {
                System.out.println("No Such Element ");
            } else {
                System.out.println("Index: " + the_Index + "\n\n");
            }
        }
    }

    static int finder(int arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x) {
                return mid;
            }
            if (arr[mid] > x) {

                return finder(arr, l, mid - 1, x);
            }
            return finder(arr, mid + 1, r, x);
        }
        return -1;
    }
}
