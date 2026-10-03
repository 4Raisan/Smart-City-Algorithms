package Module_01;
import java.util.*;

public class Graph {

    private final Map<String, List<String>> adjList;

    public Graph() {
        adjList = new LinkedHashMap<>();
    }

    // Add location
    public boolean addLocation(String location) {
        if (location.trim().isEmpty() || adjList.containsKey(location)) {
            System.out.println("Location is empty or already exists.");
            return false;
        }
        adjList.putIfAbsent(location, new ArrayList<>());
        return true;
    }

    // Remove location
    public boolean removeLocation(String location) {
        if (!adjList.containsKey(location)) {
            System.out.println("Location not found");
            return false;
        }
        adjList.remove(location);

        for (List<String> neighbors : adjList.values()) {
            neighbors.remove(location);
        }
        return true;
    }

    // Add road (Undirected Graph)
    public boolean addRoad(String loc1, String loc2) {

        if (!adjList.containsKey(loc1) || !adjList.containsKey(loc2)) {
            System.out.println("Location not found");
            return false;
        }

        if (loc1.equals(loc2) || adjList.get(loc1).contains(loc2)) {
            System.out.println("Road already exists or locations are the same.");
            return false;
        }

        adjList.get(loc1).add(loc2);
        adjList.get(loc2).add(loc1);
        return true;
    }

    // Remove road
    public boolean removeRoad(String loc1, String loc2) {

        if (!adjList.containsKey(loc1) || !adjList.get(loc1).contains(loc2)) {
            System.out.println("Road not found");
            return false;
        }

        if (adjList.containsKey(loc1)) {
            adjList.get(loc1).remove(loc2);
        }
        if (adjList.containsKey(loc2)) {
            adjList.get(loc2).remove(loc1);
        }
        return true;
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
