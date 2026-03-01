package Module_02;

public class QuickSort {

    private static void quickSort(int[] arr) {

        int low = 0;
        int high = arr.length-1;

        if (low < high) {   // continue only if more than 1 element

            int pivotIndex = partition(arr, low, high);  // place pivot in correct position

            quickSort(arr, low, pivotIndex - 1);   // sort left side of pivot
            quickSort(arr, pivotIndex + 1, high);  // sort right side of pivot
        }
    }

    // Partition method - arranges elements around pivot
    private static int partition(int[] arr, int low, int high) {

        int pivot = arr[high/2];   // choose last element as pivot

        int i = low - 1;   // index for smaller elements

        for (int j = low; j < high; j++) {   // loop through elements before pivot

            if (arr[j] <= pivot) {   // if current element is smaller than pivot
                i++;                 // move boundary of smaller elements

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // place pivot in correct sorted position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;   // return pivot index
    }
}