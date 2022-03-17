package Searching_And_Sorting;
import java.util.Scanner;
/**
 *
 * @author Masum Khan
 */
public class Linear_search {  // Uploaded, bug fixed and commented: 18.03.22

    public static void main(String[] args) {

        int i, key, arr[], num_of_elmnt;
        boolean sign;
        Scanner scn = new Scanner(System.in);
        //
        while (true) {
            System.out.print("\nEnter number of elements: ");
            num_of_elmnt = scn.nextInt();
            arr = new int[num_of_elmnt];

            for (i = 0; i < num_of_elmnt; i++) {
                arr[i] = scn.nextInt();
            }
            //
            System.out.print("Key: ");
            key = scn.nextInt(); // the value 
            sign = false;
            for (i = 0; i < arr.length; i++) {
                if (arr[i] == key) {
                    sign = true;
                    System.out.println("\tFound At Index: " + i);
                    break;
                }
            }
            if (sign == false) {
                System.out.println("No Such value");
            }
        }
    }
}
/*
        CASE-1:
7
1 3  7 8 9 -2 0
4
        CASE-2:
9
1 3 1234 4 8 925 -2 0 7
7
*/
