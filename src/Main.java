import Module_01.*;
import Module_02.SortManager;
import Module_03.PerformanceAnalyzer;

import java.util.Scanner;
import java.util.SortedMap;


public class  Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            //menu display (all 3)
            System.out.println("\n ================================");
            System.out.println("        Smart City Algorithms       ");
            System.out.println("=====================================");
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

            //cases
            switch (choice) {
                case 1:
                    Module_01.RoutePlanner.start();     //person 1
                    break;

                case 2:
                    SortManager.begin();        //Person 2
                    break;

                case 3:
                    PerformanceAnalyzer.start();
                    break;


                case 4:
                    System.out.println("Good Bye!");            //Everyone
                    break;

                default:
                    System.out.println("Invalid choice.");         //everyone

            }
        } while (choice != 4);
        sc.close();

    }
}
