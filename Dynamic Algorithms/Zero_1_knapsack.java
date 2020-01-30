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
public class Zero_1_knapsack {

    public static void main(String[] args) {
        int total_wt = 7, i, j;

        int items[][] = {{1, 1}, {3, 4}, {4, 5}, {5, 7}}; //weight & values
        int arr[][] = new int[items.length][total_wt + 1];

        for (i = 0; i <= total_wt; i++) {
            if (i >= items[0][0]) {
                arr[0][i] = items[0][1];
            }
        }
        for (i = 1; i < items.length; i++) {

            for (j = 0; j <= total_wt; j++) {
                if (j >= items[i][0]) {
                    arr[i][j] = Math.max(items[i][1] + arr[i - 1][j - items[i][0]], arr[i - 1][j]);
                } else {
                    arr[i][j] = arr[i - 1][j];
                }
            }
        }
        i = items.length - 1;
        j = total_wt;
        System.out.println("Maximum Possible: " + arr[i][j]);

//         for (i = 0; i < items.length; i++) {
//            System.out.println();
//            for (j = 0; j <= total_wt; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//        }
//               SOME CODE LEFT TO BE DONE !
    }

}
