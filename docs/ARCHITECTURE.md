# Module structure

[Back to the README](../README.md)

![Three independent Java modules](architecture.svg)

The application has one entry point and three module menus. `Main` owns the shared `Scanner`, dispatches the selected module, and closes input on exit. There is no server, database or external dependency.

| Entry point | Supporting classes | Responsibility |
| --- | --- | --- |
| `src/Module_01/RoutePlanner.java` | `Graph`, `LocationBST` | Keep locations in a graph and BST; manage undirected roads and traverse the graph with BFS |
| `src/Module_02/SortManager.java` | `BubbleSort`, `MergeSort`, `QuickSort` | Clone one dataset for each algorithm, then display sorted arrays and elapsed nanoseconds |
| `src/Module_03/PerformanceAnalyzer.java` | `SearchingAlgorithms`, `SortingAlgorithms` | Generate datasets and time searching/sorting at fixed input sizes |

## Design details

- Route-planner state survives returning to the main menu, but is lost when the process ends. The BST tracks location insertions and deletions; road connectivity and BFS use the graph.
- Modules 2 and 3 contain separate sorting implementations. They do not share a common sorting service.
- `Module_03/BinarySearchTree.java` is an additional integer BST implementation. The current analyzer menu does not call it.
- Binary Search runs on sorted input. Dataset preparation and sorting for the search comparison happen before the timed search.

## Possible next steps

These are improvements, not current features: automated algorithm tests, repeated timing runs with JVM warm-up, shared sorting implementations, and a visible BST demonstration. Shortest-path routing or saved city data would be separate feature additions.
