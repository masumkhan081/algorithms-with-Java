/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dynamic_Algorithm;

import java.util.Scanner;

/**
 *
 * @author Masum Khan
 */
public class Edit_Distance_Levenshtein {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        while (true) {
            String str1 = scn.next();
            String str2 = scn.next();
            System.out.println("\nMinimum Fucking Distance: " + get_Distance(str1, str2) + "\n");
        }
    }

    static int get_Distance(String str1, String str2) {

        int i, j, x, edit;
        int len1 = str1.length();
        int len2 = str2.length();
        int arr[][] = new int[len1 + 1][len2 + 1];
        x = 0;
        i = 0;
        for (j = 0; j <= len2; j++) {
            arr[i][j] = x;
            x++;
        }
        x = 0;
        j = 0;
        for (i = 0; i <= len1; i++) {
            arr[i][j] = x;
            x++;
        }
        edit = 0;
        for (i = 0; i < len1; i++) {
            for (j = 0; j < len2; j++) {
                edit = 1;
                if (str1.charAt(i) == str2.charAt(j)) {
                    edit = 0;
                }
                arr[i + 1][j + 1] = Math.min(Math.min(arr[i][j] + edit, arr[i][j + 1] + 1), arr[i + 1][j] + 1);
                edit = arr[i + 1][j + 1];
            }
        }
//        for (i = 0; i <= len1; i++) {
//            System.out.println("");
//            for (j = 0; j <= len2; j++) {
//                System.out.print(" " + arr[i][j]);
//            }
//        }
        return edit;
    }
}
