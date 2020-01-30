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
public class Longest_Common_Substring {

    static int[][] LCS;

    public static void main(String[] args) {
        String str1;
        str1 = "somefuckersdonotchange";
        String str2;
        str2 = "forfucksake";

        /*
        Scanner scn = new Scanner(System.in);
        System.out.print("input 1st string: ");
        str1 = scn.next();
        System.out.print("input 2nd string: ");
        str2 = scn.next();
         */
        if (str1.length() == 0 || str2.length() == 0) {
            System.out.println("LCS Bwtween Both String: " + 0);
        } else {
            get_LCS(str1, str2);

        }

    }

    static void get_LCS(String str1, String str2) {
        int lcs_len = 0;

        int len1 = str1.length();
        int len2 = str2.length();
        LCS = new int[len1 + 1][len2 + 1];

        char char_str1[] = str1.toCharArray();
        char char_str2[] = str2.toCharArray();

        for (int i = 1; i <= len1; i++) {
            for (int j = 1; j <= len2; j++) {
                if (char_str1[i - 1] == char_str2[j - 1]) {
                    LCS[i][j] = LCS[i - 1][j - 1] + 1;
                } else {
                    LCS[i][j] = 0;
                }
            }
        }
        int i_ind = 0;
        for (int i = 0; i <= char_str1.length; i++) {
            for (int j = 0; j <= char_str2.length; j++) {
                if (lcs_len < LCS[i][j]) {
                    lcs_len = LCS[i][j];
                    i_ind = i;

                }
            }
        }
        System.out.println("LCS Length: " + lcs_len);
        System.out.println("LCS: " + str1.substring(i_ind - lcs_len, i_ind));
    }

}
