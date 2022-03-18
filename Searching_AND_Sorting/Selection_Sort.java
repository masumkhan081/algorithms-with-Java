package Searching_And_Sorting;
import java.util.Scanner;
/**
 *
 * @author Masum Khan
 */
public class Selection_Sort { // Uploaded, bug fixed and commented: 18.03.22

    public static void main(String[] args) {
        int pol, min, i, j, ind = 0, temp, number_of_elements;
        int arr[] = new int[10000];
        Scanner scn = new Scanner(System.in);

        while (true) {
            System.out.println("Number Of Elements: ");
            number_of_elements = scn.nextInt();
            for (i = 0; i < number_of_elements; i++) {
                arr[i] = scn.nextInt();
            }
            /*
            i < number_of_elements - 1: because all smaller value get to it's position,
            for sure the last one would be biggest among them
             */
            for (i = 0; i < number_of_elements - 1; i++) {
                min = arr[i];
                ind = i;
                for (j = i + 1; j < number_of_elements; j++) {
                    if (arr[j] < min) {
                        min = arr[j];
                        ind = j;
                    }
                }
                temp = arr[i];
                arr[i] = min;
                arr[ind] = temp;
            }
            System.out.println("Fucked up Values Are: ");
            for (i = 0; i < number_of_elements; i++) {
                System.out.println(" ___ " + arr[i]);
            }
        }
    }
}
/* 
        CASES-1  (Num of values and values)
7 5 3 7 0 1 0 6
        CASES-2
7 3 5 0 1 0 6 7
        CASES-3
5 3 4 5 1 2
        CASES-4
5 5 4 3 1 2
 */
