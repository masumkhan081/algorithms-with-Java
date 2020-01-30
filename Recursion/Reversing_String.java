/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

import java.util.Scanner;

/**
 *
 * @author Masum Khan
 */
public class Reversing_String {

    public static void main(String[] args) {

//      while(true){
//      Scanner scn = new Scanner(System.in);
//      String str = scn.next();
        String str = "Sandy";
        String reversed = reverseString(str);
        System.out.println("Reversed string: " + reversed);
//      }
    }

    public static String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}
