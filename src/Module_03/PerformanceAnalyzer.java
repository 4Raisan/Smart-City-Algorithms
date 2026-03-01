import java.util.Random;

public class PerformanceAnalyzer {

    public static int[] generateArray(int size) {
        Random rand = new Random();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(10000);
        }

        return arr;
    }

    public static int[] copyArray(int[] original) {
        int[] copy = new int[original.length];
        System.arraycopy(original, 0, copy, 0, original.length);
        return copy;
    }

    public static void main(String[] args) {

        int[] sizes = {100, 500, 1000};

        System.out.println("==============================================================");
        System.out.println("Size\tLinear Search (ns)\tBubble Sort (ns)");
        System.out.println("==============================================================");

        for (int size : sizes) {

            int[] arr = generateArray(size);
            int[] arrForSort = copyArray(arr);

            int key = arr[size - 1]; // Worst case for linear search

            // Measure Linear Search
            long startSearch = System.nanoTime();
            SearchingAlgorithms.linearSearch(arr, key);
            long endSearch = System.nanoTime();
            long searchTime = endSearch - startSearch;

            // Measure Bubble Sort
            long startSort = System.nanoTime();
            SortingAlgorithms.bubbleSort(arrForSort);
            long endSort = System.nanoTime();
            long sortTime = endSort - startSort;

            System.out.println(size + "\t" + searchTime + "\t\t\t" + sortTime);
        }

        System.out.println("==============================================================");
    }
}