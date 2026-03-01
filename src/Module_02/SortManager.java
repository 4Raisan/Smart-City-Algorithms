package Module_02;
import java.util.*;

public class SortManager {
    public static void begin() {

        Scanner sc = new Scanner(System.in);
        System.out.println("1 - Random Dataset");
        System.out.println("2 - Manual Input");
        System.out.print("Choose option: ");
        int choice = sc.nextInt();

        int[] array;
        if (choice == 1) {
            array = new int[10];
            Random rand = new Random();
            for (int i = 0; i < 10; i++)
                array[i] = rand.nextInt(100);
        } else {
            System.out.print("Enter dataset size: ");
            int size = sc.nextInt();
            array = new int[size];
            System.out.println("Enter elements: ");
            for (int i = 0; i < size; i++)
                array[i] = sc.nextInt();
        }

        System.out.println("\nSort on: " + Arrays.toString(array) + "\nSize of the random dataset: 10");
        runSorts(array);
    }

    private static void runSorts(int[] array) {

        // Bubble sort
        int[] bArr = array.clone();
        long bStart = System.nanoTime();
        Module_02.BubbleSort.bubbleSort(bArr);
        long bTime = System.nanoTime() - bStart;

        // Merge sort
        int[] mArr = array.clone();
        long mStart = System.nanoTime();
        Module_02.MergeSort.mergeSort(mArr);
        long mTime = System.nanoTime() - mStart;

        // Quick sort
        int[] qArr = array.clone();
        long qStart = System.nanoTime();
        Module_02.QuickSort.quicksort(qArr);
        long qTime = System.nanoTime() - qStart;

        System.out.println("\n1. Bubble Sorted: " + Arrays.toString(bArr));
        System.out.println("   Execution time: " + bTime + " ns");
        System.out.println("\n2. Merge Sorted: " + Arrays.toString(mArr));
        System.out.println("   Execution time: " + mTime + " ns");
        System.out.println("\n3. Quick Sorted: " + Arrays.toString(qArr));
        System.out.println("   Execution time: " + qTime + " ns");

        System.out.println("\n-----------------------------------");
        System.out.printf("%-11s | %-10s\n", "Algorithm", "Time (ns)");
        System.out.println("-----------------------------------");
        System.out.printf("%-11s | %-10d\n", "Bubble Sort", bTime);
        System.out.printf("%-11s | %-10d\n", "Merge Sort", mTime);
        System.out.printf("%-11s | %-10d\n", "Quick Sort", qTime);
        System.out.println("-----------------------------------");
    }
}