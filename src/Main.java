import Module_02.*;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        // RANDOM
        int[] a = {5, 2, 9, 1, 3};
        long bubbleTime = BubbleSort.bubbleSort(a);
        System.out.println(Arrays.toString(a) + " -> " + bubbleTime);
    }
}
