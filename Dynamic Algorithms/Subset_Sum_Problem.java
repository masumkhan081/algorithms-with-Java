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
public class Subset_Sum_Problem {

    public static void main(String[] args) {
        int arr_input[] = {2, 3, 7, 8, 10};
        int total = 11;
        int i, j;
        int len = arr_input.length;
        boolean arr[][] = new boolean[len][total + 1];
        for (i = 0; i < len; i++) {
            arr[i][0] = true;
        }

        arr[0][arr_input[0]] = true;

        for (i = 1; i < len; i++) {
            for (j = 1; j <= total; j++) {
                if (j < arr_input[i]) {
                    arr[i][j] = arr[i - 1][j];
                } else if (arr[i - 1][j] == true) {
                    arr[i][j] = true;
                } else {
                    arr[i][j] = arr[i - 1][j - arr_input[i]];
                }
            }
        }
//        for (i = 0; i < len; i++) {
//            System.out.println("");
//            for (j = 0; j <= total; j++) {
//                System.out.print(" " + arr[i][j]);
//            }
//        }
        String output = "";
        i = len - 1;
        j = total;
        if (arr[i][j] == true) {
            System.out.println("\nThere Is A Subset.");
            while (total > 0) {
                if (arr[i][j] == arr[i - 1][j]) {
                    i = i - 1;
                } else {
                    output += arr_input[i] + "  ";
                    total -= arr_input[i];
                    j = j - arr_input[i];
                    i = i - 1;
                }
            }
            System.out.println("Subset Consist Of: " + output);
        } else {
            System.out.println("\nThere Is No Subset.");
        }

    }

}
