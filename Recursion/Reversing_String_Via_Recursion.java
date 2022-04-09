package Recursion;
import java.util.Scanner;
/**
 *
 * @author Masum Khan
 */
public class Reversing_String_Via_Recursion { // checked and revised at 09 April 22

    public static void main(String[] args) {
        
        String str;
        // .......  TEST CASEs
        str = "Sandy";
        str = "abcd";
        str = "banana";
        str = "level";
        //
        String reversed = reverseString(str);
        System.out.println("Reversed string: " + reversed);
    }
    public static String reverseString(String str) {

        if (str.isEmpty()) {  // base cndition
            return str;
        }
        /*
        str keeps shrinking by 1 untill empty and every time 1st char of str is added to the end of the 
        returned value of per method call. 
         */
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}
