import Module_01.*;
import Module_02.SortManager;
import Module_03.PerformanceAnalyzer;
import java.util.Scanner;


public class  Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            //menu display (all 3)
            System.out.println("\n ================================");
            System.out.println("        Smart City Algorithms       ");
            System.out.println("===============================");
            System.out.println("1. Smart City Route Planner");
            System.out.println("2. Data Sorter");
            System.out.println("3. Performance Analyzer");
            System.out.println("4. Exit");
            System.out.println("===================================");
            System.out.println("Enter your choice: ");

            //inputs (p01)
            while (!sc.hasNextInt()) {
                System.out.println("Invalid choice.");
                sc.next();
            }

            choice = sc.nextInt();
        }

        //
        // so
        // System
        //
        //
        //
        //
        // Module 2
        // ...

        //---------------------------------------------------

        // Module 2
        SortManager.begin();

        //---------------------------------------------------

        // Module 03
        // ...
        Scanner sc = new Scanner(System.in);
        int choice = -1;

        System.out.println("=== Smart City Algorithms ===");

        while (choice != 0) {
            System.out.println("\n--- Main Menu ---");
            System.out.println("1. Module 1 - Route Planner");
            System.out.println("2. Module 2 - Data Sorter");
            System.out.println("3. Module 3 - Performance Analyzer");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice == 1) System.out.println("Module 1 - coming soon");
            else if (choice == 2) System.out.println("Module 2 - coming soon");
            else if (choice == 3) PerformanceAnalyzer.runModule();
            else if (choice != 0) System.out.println("Invalid choice!");
        }
    }
}
