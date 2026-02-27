package Module_02;

public class MergeSort {

    public static int[] mergeSort(int[] arr) {

        if (arr.length <= 1) { return arr; }    // return one element

        int mid = arr.length / 2;  // find mid

        // devided left & right as smaller parts
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];
        for (int i = 0; i < mid; i++)
            left[i] = arr[i];
        for (int i = mid; i < arr.length; i++)
            right[i - mid] = arr[i];

        // recursion
        left = mergeSort(left);  // devided until get single elements
        right = mergeSort(right);

        merge(arr, left, right);  // returned elements sending to sort

        return arr;
    }

    private static void merge(int[] arr, int[] left, int[] right) {

        int l = 0, r = 0, s = 0;  // s for mark the final sorted position

        // compare and merge until all sides ended
        while (l < left.length && r < right.length) {
            if (left[l] <= right[r])
                arr[s++] = left[l++];
            else
                arr[s++] = right[r++];
        }

        // add remaining elements
        while (l < left.length)
            arr[s++] = left[l++];
        while (r < right.length)
            arr[s++] = right[r++];
    }
}