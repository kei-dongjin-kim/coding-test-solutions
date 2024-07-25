package leetcode;

import java.util.Arrays;

public class P0912 {
    public int[] sortArray(int[] nums) {
        mergeSort(nums);
        return nums;
    }

    public static void mergeSort(int[] arr) {
        if (arr.length > 1) {
            int mid = arr.length / 2;
            int[] left = Arrays.copyOfRange(arr, 0, mid);
            int[] right = Arrays.copyOfRange(arr, mid, arr.length);

            mergeSort(left);
            mergeSort(right);
            merge(arr, left, right);
        }
    }

    private static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        while (i < left.length) {
            arr[k++] = left[i++];
        }
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }

    //
    // quick sort solution has been failed due to time limit exceeded
    //

//     public int[] sortArray(int[] nums) {
//         quickSort(nums, 0, nums.length - 1);
//         return nums;
//     }

//    public void quickSort(int[] arr, int low, int high) {
//        if (low < high) {
//            int pi = partition(arr, low, high);
//            quickSort(arr, low, pi - 1);
//            quickSort(arr, pi + 1, high);
//        }
//    }

//    private static int partition(int[] arr, int low, int high) {
//        int pivot = arr[high];
//        int i = (low - 1);
//
//        for (int j=low ; j<high ; j++) {
//            if (arr[j] <= pivot) {
//                i++;
//                int temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
//            }
//        }
//
//        int temp = arr[i + 1];
//        arr[i + 1] = arr[high];
//        arr[high] = temp;
//
//        return i + 1;
//    }
}
