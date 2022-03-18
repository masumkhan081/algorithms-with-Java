package Searching_And_Sorting;

/**
 *
 * @author Masum Khan
 */
class Merge_Sort { // uploaded, bug checked : 18.03.22

    public static void main(String[] args) {

// Case-1:  {3,2};
// Case-2:  {6, 2, 3, 1, 9, 10, 15, 13, 12, 17};
// Case-3:  {2};
// Case-3:  {38, 27, 43, 3, 9, 82, 10};
//
        int arr[] = {3,2};

        divide_and_merge(arr, arr.length);
        System.out.println("Sorted as you would like!");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(" " + arr[i]);
        }
    }

    static void divide_and_merge(int arr[], int len) {
        if (len < 2) {
            return;
        }
        int mid = len / 2;
        int[] l = new int[mid];
        int[] r = new int[len - mid];
        for (int i = 0; i < mid; i++) {
            l[i] = arr[i];
        }
        for (int i = mid; i < len; i++) {
            r[i - mid] = arr[i];
        }
        divide_and_merge(l, mid);
        divide_and_merge(r, len - mid);
        the_merger(arr, l, r, mid, len - mid);
    }

    public static void the_merger(int[] arr, int[] left_part, int[] right_part, int len_left_part, int len_right_part) {
        int i = 0, j = 0, k = 0;

        while (i < len_left_part && j < len_right_part) {
            if (left_part[i] <= right_part[j]) {

                arr[k++] = left_part[i++];

            } else {
                arr[k++] = right_part[j++];
            }
        }
        while (i < len_left_part) {
            arr[k++] = left_part[i++];
        }
        while (j < len_right_part) {
            arr[k++] = right_part[j++];
        }
    }
}
