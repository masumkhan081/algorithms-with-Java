package Searching_And_Sorting;
import java.util.Scanner;
/**
 *
 * @author Masum Khan
 */
public class Insertion_Sort { // // Uploaded, bug fixed and commented: 18.03.22

    public static void main(String[] args) {
        int arr[] = new int[10000];
        int i, j, k, temp, pol, dick, ass, pussy;
        int number_of_elements;
        Scanner scn = new Scanner(System.in);
        while (true) {
            System.out.print("How many elements: ");
            number_of_elements = scn.nextInt(); // followed by array elements
            for (i = 0; i < number_of_elements; i++) {
                arr[i] = scn.nextInt();// takes input of space seperatted array elements
            }
            for (i = 1; i < number_of_elements; i++) {
                pol = i; // index of the element which to be inserted at right position
                for (k = i - 1; k >= 0; k--) {
                    if (arr[k] > arr[pol]) {
                        temp = arr[k];
                        arr[k] = arr[pol];
                        arr[pol] = temp;
                        pol = k;
                    }
                }
            }
            System.out.println("Sorted Fucking elements Are: ");
            for (i = 0; i < number_of_elements; i++) {
                System.out.println(" ____ " + arr[i]);
            }
        }
    }
}
/*                              (Number of elements and elements)               
CASES-1:    7 5 3 7 0 1 0 6 
CASES-2:    7 3 5 0 1 0 6 7 
CASES-3:    5 3 4 5 1 2 
CASES-4:    5 5 4 3 1 2
*/
