package Module_02;

public class BubbleSort {

    public static long bubbleSort(int[] arr) {
        long startTime = System.nanoTime();
        boolean swap = false;
        for (int i=0; i<arr.length-1; i++) {
            for (int k=0; k<arr.length-1; k++) {
                if (arr[k] > arr[k+1]) {
                        int temp = arr[k];
                        arr[k] = arr[k+1];
                        arr[k+1] = temp;
                        swap = true;
                 }
            }
            if (!swap) {break;}
        }
        long bsTime = System.nanoTime() - startTime;
        return bsTime;
    }
}