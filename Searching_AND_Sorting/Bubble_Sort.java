import java.util.Scanner;

/**
 *
 * @author Masum Khan
 */
class Bubble_Sort { // uploaded, bug checked, test case added : 18.03.22

    public static void main(String[] args) {

        int temp, num_of_elements;
        Scanner scn = new Scanner(System.in);

        while (true) {
            System.out.print("Number of elements: ");
            num_of_elements = scn.nextInt();

            int arr[] = new int[num_of_elements];

            for (int i = 0; i < num_of_elements; i++) {
                arr[i] = scn.nextInt();
            }

            for (int i = 0; i < num_of_elements; i++) {
                for (int j = i + 1; j < num_of_elements; j++) {
                    if (arr[j] < arr[i]) {
                        temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                    }
                }
            }
            System.out.println("Sorted Values Are: ");
            for (int i = 0; i < num_of_elements; i++) {
                System.out.print(arr[i] + ", ");
            }
            System.out.println("\n");
        }
    }
}
/*
Case-1:    8 1 6 9 8 3 -1 0 1
Case-2:    3 3 2 1
Case-3:    1
 */
