package src.Module_01;

import java.util.*;

public class Graph {

    private Map<String, List<String>> adjList;

    public Graph() {
        adjList = new HashMap<>();
    }

    // Add location
    public void addLocation(String location) {
        adjList.putIfAbsent(location, new ArrayList<>());
    }

    // Remove location
    public void removeLocation(String location) {
        adjList.remove(location);

        for (List<String> neighbors : adjList.values()) {
            neighbors.remove(location);
        }
    }

    // Add road (Undirected Graph)
    public void addRoad(String loc1, String loc2) {

        if (!adjList.containsKey(loc1) || !adjList.containsKey(loc2)) {
            System.out.println("Location not found");
            return;
        }

        adjList.get(loc1).add(loc2);
        adjList.get(loc2).add(loc1);
    }

    // Remove road
    public void removeRoad(String loc1, String loc2) {

        if (adjList.containsKey(loc1)) {
            adjList.get(loc1).remove(loc2);

        if (adjList.containsKey(loc2)) {
            adjList.get(loc2).remove(loc1);
        }
    }

    //display connections
    public void displayConnections() {

        for (String location : adjList.keySet()) {
            System.out.println(location + " -> " + adjList.get(location));
        }
    }

    //BFS traversal using Queue
    public void bfs(String start) {

        if (!adjList.containsKey(start)) {
            System.out.println("Location not found");
            return;
        }

        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();

        visited.add(start);
        queue.add(start);

        System.out.println("BFS Traversal:");

        while (!queue.isEmpty()) {

            String current = queue.poll();
            System.out.print(current + " ");

            for (String neighbor : adjList.get(current)) {

                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }

        System.out.println();
    }
}