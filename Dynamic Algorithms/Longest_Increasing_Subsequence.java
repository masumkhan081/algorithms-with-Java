/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dynamic_Algorithm;

import java.util.ArrayList;

/**
 *
 * @author Masum Khan
 */
public class Longest_Increasing_Subsequence {

    public static void main(String[] args) {

        // int arr_inputs[] = {10, 9, 2, 5, 3, 7, 101, 6};
        int arr_inputs[] = {1, 6, 2, 4, 5, 0};
        //  int arr_inputs[] = {3, 4, -1, 0, 6, 2, 3};
        int num_of_input = arr_inputs.length;
        int lis[] = new int[num_of_input];
        //
        for (int i = 0; i < num_of_input; i++) {
            lis[i] = 1;
        }
        for (int i = 1; i < num_of_input; i++) {
            for (int j = 0; j < i; j++) {
                if (arr_inputs[j] < arr_inputs[i]) {
                    lis[i] = Math.max(lis[i], lis[j] + 1);
                }
            }
        }
//        for (int i = 0; i < num_of_input; i++) {
//            System.out.print(lis[i] + "  ");
//        }
        int len = 0;
        int ind = 0;
        for (int i = 0; i < num_of_input; i++) {
            if (len < lis[i]) {
                len = lis[i];
                ind = i;
            }
        }
        System.out.println("Length: " + len);
        //
        String sequence;
        // To retrieve what's constitute that length/sequence after all.

        sequence = "" + arr_inputs[ind];
        for (int i = ind; i > 0; i--) {
            if (lis[i] == 1) {
                break;
            }
            if (lis[i] > lis[i - 1]) {
                sequence = arr_inputs[i - 1] + "  " + sequence;
            }
        }
        System.out.println("Sequence: " + sequence);
    }

}
