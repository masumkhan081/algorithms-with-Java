/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backtracking;

import java.util.ArrayList;

/**
 *
 * @author Masum Khan
 */
public class The_Word_Break_Problem {

    static String str_result = "";

    public static void main(String[] args) {

        ArrayList<String> arr_dict = new ArrayList();
        arr_dict.add("once");
        arr_dict.add("upon");
        arr_dict.add("a");
        arr_dict.add("time");
        arr_dict.add("in");
        arr_dict.add("mumbai");
        arr_dict.add("holywood");
        String str_Main = "onceuponatimeinholywood";

        if (new The_Word_Break_Problem().break_Or_Not(arr_dict, str_Main)) {
            System.out.println("Result String: " + str_result);
        }
    }

    public boolean break_Or_Not(ArrayList arr_dict, String str_Main) {
        String temp = "";
        if (str_Main.length() == 0) {
            return true;
        }
        for (int i = 0; i < str_Main.length(); i++) {
            temp += str_Main.charAt(i);
            if (arr_dict.contains(temp)) {
                str_result += temp + " ";
                str_Main = str_Main.substring(i + 1);
                if (break_Or_Not(arr_dict, str_Main)) {
                    return true;
                }
            }
        }
        return false;
    }
}
