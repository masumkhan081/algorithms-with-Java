/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Searching_And_Sorting;

/**
 *
 * @author Masum Khan
 */
public class Merge_Sort {

    public static void main(String[] args) {

        int arr[] = {6, 2, 3, 1, 9, 10, 15, 13, 12, 17};

        merge_sort(arr, arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("_____ " + arr[i]);
        }
    }

    static void merge_sort(int arr[], int len) {
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
        merge_sort(l, mid);
        merge_sort(r, len - mid);
        the_merger(arr, l, r, mid, len - mid);
    }

    public static void the_merger(int[] arr, int[] arr_left, int[] arr_right, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (arr_left[i] <= arr_right[j]) {

                arr[k++] = arr_left[i++];

            } else {
                arr[k++] = arr_right[j++];
            }
        }
        while (i < left) {
            arr[k++] = arr_left[i++];
        }
        while (j < right) {
            arr[k++] = arr_right[j++];
        }
    }

}
