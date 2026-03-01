package Module_03;
l
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PerformanceAnalyzer {

    public static void runModule() {
        Scanner sc = new Scanner(System.in);
        int choice = -1;

        while (choice != 0) {
            System.out.println("\n--- Module 3: Performance Analyzer ---");
            System.out.println("1. Search Algorithm Analysis");
            System.out.println("2. Sort Algorithm Analysis");
            System.out.println("0. Back");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice == 1) searchAnalysis();
            else if (choice == 2) sortAnalysis();
        }
    }

    // Test searching on sizes 100, 500, 1000
    static void searchAnalysis() {
        int[] sizes = {100, 500, 1000};
        System.out.println("\nSize       | Linear Search (ns) | Binary Search (ns)");
        System.out.println("---------------------------------------------------");

        for (int size : sizes) {
            int[] arr = generateSorted(size);
            int target = arr[size - 1]; // worst case target

            long t1 = System.nanoTime();
            SearchingAlgorithms.linearSearch(arr, target);
            long linearTime = System.nanoTime() - t1;

            long t2 = System.nanoTime();
            SearchingAlgorithms.binarySearch(arr, target);
            long binaryTime = System.nanoTime() - t2;

            System.out.printf("%-10d | %-18d | %d%n", size, linearTime, binaryTime);
        }
    }

    // Test sorting on sizes 100, 500, 1000
    static void sortAnalysis() {
        int[] sizes = {100, 500, 1000};
        System.out.println("\nSize       | Bubble (ns) | Merge (ns)  | Quick (ns)");
        System.out.println("------------------------------------------------------");

        for (int size : sizes) {
            int[] arr = generateRandom(size);

            int[] a1 = arr.clone();
            long t1 = System.nanoTime();
            SortingAlgorithms.bubbleSort(a1);
            long bubbleTime = System.nanoTime() - t1;

            int[] a2 = arr.clone();
            long t2 = System.nanoTime();
            SortingAlgorithms.mergeSort(a2, 0, a2.length - 1);
            long mergeTime = System.nanoTime() - t2;

            int[] a3 = arr.clone();
            long t3 = System.nanoTime();
            SortingAlgorithms.quickSort(a3, 0, a3.length - 1);
            long quickTime = System.nanoTime() - t3;

            System.out.printf("%-10d | %-11d | %-11d | %d%n", size, bubbleTime, mergeTime, quickTime);
        }
    }

    static int[] generateRandom(int size) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) arr[i] = rand.nextInt(1000);
        return arr;
    }

    static int[] generateSorted(int size) {
        int[] arr = generateRandom(size);
        Arrays.sort(arr);
        return arr;
    }
}