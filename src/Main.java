import Module_02.SortManager;
import Module_03.PerformanceAnalyzer;
import java.util.Scanner;
import Module_03.BinarySearchTree;

public class Main {

    public static void main(String[] args) {

        // Module 2
        // ...

        //---------------------------------------------------

        // Module 2
        SortManager.begin();

        //---------------------------------------------------

        // Module 03
        // ...//
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        System.out.println("=========================================");
        System.out.println("     SMART CITY ALGORITHMS SYSTEM        ");
        System.out.println("=========================================");

        while (running) {
            System.out.println("\n============= MAIN MENU =================");
            System.out.println("1. Smart City Route Planner  (Module 1)");
            System.out.println("2. Data Sorter               (Module 2)");
            System.out.println("3. Performance Analyzer      (Module 3)");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

        }
    }
}
