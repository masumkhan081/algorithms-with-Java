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
public class Longest_Common_Subsequence {

    public static void main(String[] args) {

        int len1, len2, i = 0, j = 0;
        Scanner scn = new Scanner(System.in);
        String str1;
        //  str1 = scn.next();
        String str2;
        // str2 = scn.next();
        str1 = "abcdaf";
        str2 = "acbcf";
        len1 = str1.length();
        len2 = str2.length();

        int[][] lcs = new int[len1 + 1][len2 + 1];

        for (i = 0; i <= len1; i++) {
            lcs[i][0] = 0;
            System.out.println("i: " + i);
        }
        for (i = 0; i <= len2; i++) {
            lcs[0][i] = 0;
        }

        for (i = 1; i <= len1; i++) {
            for (j = 1; j <= len2; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    lcs[i][j] = lcs[i - 1][j - 1] + 1;
                } else {
                    lcs[i][j] = Math.max(lcs[i - 1][j], lcs[i][j - 1]);
                }
            }
        }
//
//        for (i = 0; i <= len1; i++) {
//            System.out.println("");
//            for (j = 0; j <= len2; j++) {
//                System.out.print(": " + lcs[i][j]);
//            }
//        }

        i = len1;
        j = len2;
        System.out.println("\nLongest Common Subsequence: " + lcs[i][j]);

        String sequence = "";
        while (true) {
            if (i == 0 || j == 0) {
                break;
            }

            if (lcs[i][j] == lcs[i][j - 1]) {
                j = j - 1;
                continue;
            }
            if (lcs[i][j] == lcs[i - 1][j]) {
                i = i - 1;
                continue;
            }
            if (lcs[i][j] == lcs[i - 1][j - 1] + 1) {
                sequence = str1.charAt(i - 1) + sequence;
                i = i - 1;
                j = j - 1;
            }
        }
        System.out.println(sequence);

    }

}
