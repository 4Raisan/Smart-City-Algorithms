package Module_01;

import Module_01.Graph;
import Module_01.LocationBST;

import java.util.Scanner;

public class RoutePlanner {

    private static LocationBST tree = new LocationBST();
    private static Graph graph = new Graph();

    public static void start() {
        start(new Scanner(System.in));
    }

    public static void start(Scanner sc) {

        int choice;

        do {
            System.out.println("\n      SMART CITY ROUTE PLANNER      ");
            System.out.println("1. Add Location: ");
            System.out.println("2. Remove Location: ");
            System.out.println("3. Add Road: ");
            System.out.println("4. Remove Road: ");
            System.out.println("5. Display Connections: ");
            System.out.println("6. BFS Traversal: ");
            System.out.println("7. Exit: ");
            System.out.print("Enter choice: ");

            while (!sc.hasNextInt()) {
                if (!sc.hasNext()) return;
                System.out.println("Invalid input. Enter number.");
                sc.next();
            }
            //read users choice
            choice = sc.nextInt();
            if (sc.hasNextLine()) sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter location: ");
                    if (!sc.hasNextLine()) return;
                    String loc = sc.nextLine().trim();
                    if (graph.addLocation(loc)) {     //add to graph
                        tree.insert(loc);           //add to bst
                        System.out.println("Location added.");
                    }
                    break;

                case 2:
                    System.out.print("Enter location: ");
                    if (!sc.hasNextLine()) return;
                    String rloc = sc.nextLine().trim();
                    if (graph.removeLocation(rloc)) {
                        tree.delete(rloc);
                        System.out.println("Location removed. ");
                    }
                    break;

                case 3:
                    System.out.print("Enter first location: ");
                    if (!sc.hasNextLine()) return;
                    String l1 = sc.nextLine().trim();
                    System.out.print("Enter second location: ");
                    if (!sc.hasNextLine()) return;
                    String l2 = sc.nextLine().trim();
                    if (graph.addRoad(l1, l2))
                        System.out.println("Road added.");
                    break;

                case 4:
                    System.out.print("Enter first location: ");
                    if (!sc.hasNextLine()) return;
                    String rl1 = sc.nextLine().trim();
                    System.out.print("Enter second location: ");
                    if (!sc.hasNextLine()) return;
                    String rl2 = sc.nextLine().trim();
                    if (graph.removeRoad(rl1, rl2))
                        System.out.println("Road removed.");
                    break;

                case 5:
                    graph.displayConnections();
                    break;

                case 6:
                    System.out.print("Enter starting location: ");
                    if (!sc.hasNextLine()) return;
                    String start = sc.nextLine().trim();
                    graph.bfs(start);
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 7);
    }
}
