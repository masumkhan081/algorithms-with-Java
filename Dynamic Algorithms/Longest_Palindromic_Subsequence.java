/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dynamic_Algorithm;

/**
 *
 * @author Masum Khan
 */
public class Longest_Palindromic_Subsequence {

    public static void main(String[] args) {

        String str_Main = "0202 2020";
        str_Main = "agbdba";
        char char_Arr[] = str_Main.toCharArray();
        int len = str_Main.length();
        int jumper = 1, i, j;
        int arr[][] = new int[len][len];

        for (i = 0; i < len; i++) {
            arr[i][i] = 1;
        }
        while (jumper < len) {

            for (i = 0; i + jumper < len; i++) {
                if (char_Arr[i] == char_Arr[i + jumper]) {
                    arr[i][i + jumper] = 2 + arr[i + 1][i + jumper - 1];
                } else {
                    arr[i][i + jumper] = Math.max(arr[i][i + jumper - 1], arr[i + 1][i + jumper]);
                }
            }
            jumper += 1;
        }
//        for (i = 0; i < len; i++) {
//            System.out.println("");
//            for (j = 0; j < len; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//        }
        System.out.println("Longest Palindromic Subsequence: " + arr[0][len - 1]);

    }
}
