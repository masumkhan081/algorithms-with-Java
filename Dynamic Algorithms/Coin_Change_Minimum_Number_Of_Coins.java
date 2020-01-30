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
public class Coin_Change_Minimum_Number_Of_Coins {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // int coins[] = {1, 5, 6, 8};
        int coins[] = {7, 3, 2, 6};
        // int coins[] = {2,3};
        int i, j, temp, amount = 7;
        amount = 13;
        // amount = 5;
        // amount = 11;

        int arr[][] = new int[coins.length][amount + 1];

        // Sorting Coins
        for (i = 0; i < coins.length; i++) {
            for (j = i + 1; j < coins.length; j++) {
                if (coins[j] < coins[i]) {
                    temp = coins[j];
                    coins[j] = coins[i];
                    coins[i] = temp;
                }
            }
        }

        if (coins.length > 1) {

            //
            for (i = 0; i <= amount; i++) {
                arr[0][i] = i / coins[0];
            }
            // main process
            for (i = 1; i < coins.length; i++) {
                for (j = 0; j <= amount; j++) {
                    if (j < coins[i]) {
                        arr[i][j] = arr[i - 1][j];
                    } else {
                        arr[i][j] = Math.min(arr[i - 1][j], arr[i][j - coins[i]] + 1);
                    }
                }
            }

            for (i = 0; i < coins.length; i++) {
                System.out.println("");
                for (j = 0; j <= amount; j++) {
                    System.out.print("  " + arr[i][j]);
                }
            }
            String the_Coins = "Coins: ";
            i = arr.length - 1;
            j = amount;
            System.out.println("\nNumber Of Coins: " + arr[i][j]);

            //   still left some to be done , wht are the coins ?
            if (arr[i][j] != 0) {
                while (j != 0) {

                    if (i == 0) {
                        the_Coins += coins[i] + "  ";
                        break;
                    }
                    if (j < coins[i]) {
                        i = i - 1;
                        continue;
                    }
                    if (arr[i][j] != (arr[i][j - coins[i]] + 1)) {
                        i = i - 1;
                        continue;
                    }
                    if (arr[i][j] == (arr[i][j - coins[i]] + 1)) {
                        the_Coins += coins[i] + "  ";
                        j = j - coins[i];
                    }
                }
            }
            System.out.println(the_Coins);
        }
    }
}
