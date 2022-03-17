package Searching_And_Sorting;
import java.util.Scanner;
/**
 *
 * @author Masum Khan
 */
public class Binary_Search { // Uploaded, bug fixed and commented: 17.03.22

    public static void main(String[] args) {

        int init, end, mid, num_To_Find;
        // an already sorted array
        int arr_inputs[] = {1, 3, 5, 7, 9, 11, 17, 78, 900, 2344, 4444, 5670, 10000, 10001, 10002, 10003, 10004};
        Scanner scn = new Scanner(System.in);
        while (true) {
            System.out.println("\nNumber to be found? : ");
            num_To_Find = scn.nextInt();
            init = 0;
            // as at some point init, end, and mid can be same, and i'm checking arr[mid] so end has to be len-1 (the bug fixed)
            end = arr_inputs.length - 1;
            mid = (init + end) / 2;

            while (init <= end) {
                if (arr_inputs[mid] < num_To_Find) {
                    init = mid + 1;
                } else if (arr_inputs[mid] == num_To_Find) {
                    System.out.println("The Number Is Fucked Up At Index: " + mid);
                    break;
                } else {
                    end = mid - 1;
                }
                mid = (init + end) / 2;
            }
            if (init > end) {
                System.out.println("No Such Item.");
            }
        }
        // note: tricky input: value at primary mid index, lowest, highest, bigger than highest , smaller than lowest. 
    }
}
