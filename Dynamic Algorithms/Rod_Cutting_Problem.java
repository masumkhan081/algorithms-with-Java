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
public class Rod_Cutting_Problem {

    public static void main(String[] args) {
        int i, j, len_total = 5;
        int len_Value[][] = {{1, 2}, {2, 5}, {3, 7}, {4, 8}};
        int arr[][] = new int[len_Value.length][len_total + 1];

        for (i = 0; i <= len_total; i++) {
            if (i >= len_Value[0][0]) {
                arr[0][i] = len_Value[0][1] * (i / len_Value[0][0]);
            }
        }
        for (i = 1; i < len_Value.length; i++) {
            for (j = 1; j <= len_total; j++) {
                if (j >= len_Value[i][0]) {
//                    System.out.println(i + "  " + j + " ???   " + arr[i][j - len_Value[0][0]]);
                    arr[i][j] = Math.max(len_Value[i][1] + arr[i][j - len_Value[i][0]], arr[i - 1][j]);
                } else {
                    arr[i][j] = arr[i - 1][j];
                }
            }
        }
//        for (i = 0; i < len_Value.length; i++) {
//            System.out.println();
//            for (j = 0; j <= len_total; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//        }
        i = len_Value.length - 1;
        j = len_total;
        System.out.println("The best Possible: " + arr[i][j]);

        String output = "";
        while (true) {
            if (arr[i][j] == 0) {
                break;
            }
            if (i != 0 && arr[i][j] == arr[i - 1][j]) {
                i = i - 1;
                continue;
            }
            if (arr[i][j] == arr[i][j - len_Value[i][0]] + len_Value[i][1]) {
                output += len_Value[i][0] + "   ";
                j = j - len_Value[i][0];
                continue;
            }
        }
        System.out.println("Cut Pieces: " + output);
    }
}
