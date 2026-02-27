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

        System.out.println("\nSort on: " + Arrays.toString(array));

    }
}