package src.Module_01;

import src.Module_01.Graph;
import src.Module_01.LocationBST;

import java.util.Scanner;

public class RoutePlanner {

    private LocationBST tree;
    private Graph graph;

    public RoutePlanner() {
        tree = new LocationBST();
        graph = new Graph();
    }

    public void start() {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n==== SMART CITY ROUTE PLANNER ====");
            System.out.println("1. Add Location");
            System.out.println("2. Remove Location");
            System.out.println("3. Add Road");
            System.out.println("4. Remove Road");
            System.out.println("5. Display Connections");
            System.out.println("6. BFS Traversal");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");

            while (!sc.hasNextInt()) {
                System.out.println("Invalid input. Enter number.");
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
                    graph.removeLocation(rloc);
                    System.out.println("Location removed.");
                    break;

                case 3:
                    System.out.print("Enter first location: ");
                    String l1 = sc.nextLine();
                    System.out.print("Enter second location: ");
                    String l2 = sc.nextLine();
                    graph.addRoad(l1, l2);
                    System.out.println("Road added.");
                    break;

                case 4:
                    System.out.print("Enter first location: ");
                    String rl1 = sc.nextLine();
                    System.out.print("Enter second location: ");
                    String rl2 = sc.nextLine();
                    graph.removeRoad(rl1, rl2);
                    System.out.println("Road removed.");
                    break;

                case 5:
                    graph.displayConnections();
                    break;

                case 6:
                    System.out.print("Enter starting location: ");
                    String start = sc.nextLine();
                    graph.bfs(start);
                    break;
            }

        } while (choice != 7);
    }
}