package Module_02;

public class BubbleSort {

    public static long bubbleSort(int[] arr) {
        long startTime = System.nanoTime();   // get current time
        boolean swap = false;  //  detect to finish sorting

        for (int i=0; i<arr.length-1; i++) {    // outer loops
            for (int k=0; k<arr.length-1; k++) {       // inner loops
                if (arr[k] > arr[k+1]) {
                        int temp = arr[k];   // hold current index
                        arr[k] = arr[k+1];  // swap values on given array
                        arr[k+1] = temp;
                        swap = true;
                 }
            }
            if (!swap) {break;}
        }
        return System.nanoTime() - startTime;   // calculate and return time
    }
}