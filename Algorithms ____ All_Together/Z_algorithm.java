/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pattern_Matching;

/**
 *
 * @author Masum Khan
 */
public class Z_algorithm {

    static String text = "xabcabzabc";
    static String pattern = "abc";

    public static void main(String[] args) {  //   Study Source:     https://youtu.be/CpZh4eF8QBw

        int i, j, count;
        // adding special char between pattern + text .
        text = pattern + "$" + text;

        int z_arr[] = new int[text.length()];
        int len = text.length();

        for (i = 1; i < len; i++) {

            j = 0;
            count = 0;
            while (text.charAt(i + j) == text.charAt(j)) {
                count++;
                j++;
                if (i + j == len) {
                    break;
                }
            }
            z_arr[i] = count;
        }
        for (i = pattern.length() + 1; i < z_arr.length; i++) {
            if (z_arr[i] == pattern.length()) {
                System.out.println("Pattern Exist At : " + (i - (pattern.length() + 1)));
            }
        }

    }

}
