package Module_02;

public class MergeSort {

    public static void devide(int[] arr) {

        if (arr.length <= 1) { return; }    // return one element

        int mid = arr.length / 2;  // find mid

        // devided left & right as smaller parts
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];
        for (int i = 0; i < mid; i++)
            left[i] = arr[i];
        for (int i = mid; i < arr.length; i++)
            right[i - mid] = arr[i];

        // recursion
        devide(left);  // devided until get single elements
        devide(right);

        merge(arr, left, right);  // returned elements sending to sort
    }

    private static void merge(int[] arr, int[] left, int[] right) {

    }
}