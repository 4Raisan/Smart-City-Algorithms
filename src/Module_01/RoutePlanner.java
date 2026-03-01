package Module_01;

import Module_01.Graph;
import Module_01.LocationBST;

import java.util.Scanner;

public class RoutePlanner {                    //

    public static void start() {              //

        LocationBST tree = new LocationBST();
        Graph graph = new Graph();

        Scanner sc = new Scanner(System.in);
        int choice;

        do {                                  // ← open do

            System.out.println("\n==================================");
            System.out.println("      SMART CITY ROUTE PLANNER    ");
            System.out.println("==================================");
            System.out.println("1. Add Location");
            System.out.println("2. Remove Location");
            System.out.println("3. Add Road");
            System.out.println("4. Remove Road");
            System.out.println("5. Display Connections");
            System.out.println("6. BFS Traversal");
            System.out.println("7. Back to Main Menu");
            System.out.println("==================================");
            System.out.print("Enter choice: ");

            while (!sc.hasNextInt()) {
                System.out.println("Invalid input. Enter a number.");
                sc.next();
            }

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter location: ");
                    String loc = sc.nextLine();
                    tree.insert(loc);
                    graph.addLocation(loc);
                    System.out.println("Location added.");
                    break;

                case 2:
                    System.out.print("Enter location: ");
                    String rloc = sc.nextLine();
                    tree.delete(rloc);
                    graph.removeLocation(rloc);
                    System.out.println("Location removed.");
                    break;

                case 3:
                    System.out.print("Enter first location: ");
                    String l1 = sc.nextLine();
                    System.out.print("Enter second location: ");
                    String l2 = sc.nextLine();
                    graph.addRoad(l1, l2);
                    break;

                case 4:
                    System.out.print("Enter first location: ");
                    String rl1 = sc.nextLine();
                    System.out.print("Enter second location: ");
                    String rl2 = sc.nextLine();
                    graph.removeRoad(rl1, rl2);
                    break;

                case 5:
                    System.out.println("\n--- All Connections ---");
                    graph.displayConnections();
                    System.out.println("\n--- Locations A to Z ---");
                    tree.inorder();
                    break;

                case 6:
                    System.out.print("Enter starting location: ");
                    String start = sc.nextLine();
                    graph.bfs(start);
                    break;

                case 7:
                    System.out.println("Returning to main menu...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");

            }
        } while (choice != 7);
    }
}
