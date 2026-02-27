package src.Module_01;
import java.util.*;

public class Graph {
    private Map < String, List< String > > adjList;

    public Graph() {
        adjList = new HashMap<>();
    }

    public void addLocation(String location) {
        adjList.putIfAbsent(location, new ArrayList<>());
    }

    public void removeLocation(String location){
        adjList.remove(location);
        for (List<String> neighbors : adjList.values()){
            neighbors.remove(location);
        }
    }

    public void addEdge(String from, String to) {
    }


}
