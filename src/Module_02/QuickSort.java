package Module_02;

public class QuickSort {

    public static void quicksort(int[] arr) {
        Sort(arr, 0, arr.length-1);
    }

    private static void Sort(int[] arr, int low, int high) {

        // recursively divide and sort subarrays
        if (low < high) {   // stop recursion
            int pivotIndex = qSort(arr, low, high);
            Sort(arr, low, pivotIndex - 1);
            Sort(arr, pivotIndex + 1, high);
        }
    }

    private static int qSort(int[] arr, int start, int end) {

        // choose pivot and place it correctly
        int pivot = arr[end];
        int i = start - 1;

        // smaller elements move to left
        for (int j = start; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // move pivot to middle
        int temp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = temp;
        return i + 1;
    }
}