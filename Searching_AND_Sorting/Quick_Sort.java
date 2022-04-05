
import java.util.Scanner;

/**
 *
 * @author Masum Khan
 */
public class Quick_Sort { // uploaded in github at 5 April

    /*
    Following the geeksforgeeks youtube algorithm tutorial. there are multiple way partition can be done.
     */
    public static void main(String[] args) {
        int left, right, number_of_elements;

        Scanner scn = new Scanner(System.in);

        while (true) {
            System.out.println("Number Of Elements: ");
            number_of_elements = scn.nextInt();
            int arr[] = new int[number_of_elements];
            System.out.println(number_of_elements + " Elements are: ");
            for (int i = 0; i < number_of_elements; i++) {
                arr[i] = scn.nextInt();
            }
            right = arr.length - 1;
            left = 0;
            //
            quickSort(arr, left, right);
            //
            System.out.println("Sorted Array: ");
            for (int i = 0; i <= right; i++) {
                System.out.print(arr[i] + "  ");
            }
        }
    }

    static void quickSort(int arr[], int left, int right) {
        if (left < right) {
            int part_ind = get_partition_ind(arr, left, right);
            quickSort(arr, left, part_ind - 1);
            quickSort(arr, part_ind + 1, right);
        }
    }

    static int get_partition_ind(int arr[], int left, int right) {
        int pivot = arr[right], temp;
        // not -1 because left doesn't always start from 0
        int partition_index = left - 1;

        for (int i = left; i <= right; i++) {
            if (arr[i] <= pivot) {
                partition_index++;
                temp = arr[partition_index];
                arr[partition_index] = arr[i];
                arr[i] = temp;
            }
            // System.out.println(partition_index);// assuming partition index
        }
        return partition_index;
    }
}
/*                          (Num of values and values)
CASE-0   6 5 2 6 1 3 4
CASES-1  7 5 3 7 0 1 0 6 
CASES-2  7 3 5 0 1 0 6 7 
CASES-3  5 3 4 5 1 2 
CASES-4  5 5 4 3 1 2
CASE-5  7 10 80 30 90 40 50 70
 */
