# Smart-City-Algorithms

### CCS2300 – Data Structures and Algorithms

## Assignment 1 – Group Project

---

## 📌 Project Overview

This project is a **menu-driven Java console application** developed for the CCS2300 module.
It integrates three core algorithmic modules:

1. Smart City Route Planner (Graphs & Trees)
2. Data Sorter – Sorting Algorithm Comparison Tool
3. Algorithm Performance Analyzer (Time Complexity Analysis)

The application demonstrates practical implementation of data structures and algorithm performance measurement.

---

## 👥 Group Members

* CIT-24-02-0052 – Imesh Kaushalya – Graph Implementation & Route Management
* CIT-24-02-0051 – Rashen Anupama – Sorting Algorithms & Performance Comparison
* CIT-24-02-0233 – Hasitha Lakshan – Searching Algorithms, Tree Structure & System Integration

---

## 🛠 Technologies Used

* Java
* Git & GitHub
* Console-Based Interface

---

## 📦 Module Descriptions

### 🔹 Module 1 – Smart City Route Planner

* Graph implementation (Adjacency List)
* Add and remove locations
* Add and remove roads (edges)
* Display connections between locations
* Binary Search Tree (BST) for location storage
* Breadth-first search (BFS) using a queue
* Input validation and menu-driven system

---

### 🔹 Module 2 – Sorting Algorithm Comparison Tool

* Bubble Sort
* Merge Sort
* Quick Sort
* Manual input or random dataset generation
* Execution time measurement using `System.nanoTime()`
* Performance comparison table display

---

### 🔹 Module 3 – Algorithm Performance Analyzer

* Linear Search and Binary Search
* Sorting algorithm analysis
* Performance testing on different input sizes (100, 500, 1000 elements)
* Execution time measurement
* Tabular result display

---

## ▶ How to Run

1. Clone this repository
2. Open the project in any Java IDE (IntelliJ / Eclipse / VS Code)
3. Select a JDK and run `src/Main.java`

---

## 📊 Key Features

* Fully menu-driven interface
* Proper input validation
* Modular code structure
* Performance measurement and comparison
* Team collaboration with version control

---

## 📁 Repository Structure

```
Smart-City-Algorithms/
│
├── src/
    ├── Main.java
    │
    ├── Module_01/
    │   ├── Graph.java
    │   ├── LocationBST.java
    │   └── RoutePlanner.java
    │
    ├── Module_02/
    │   ├── BubbleSort.java
    │   ├── MergeSort.java
    │   ├── QuickSort.java
    │   └── SortManager.java
    │
    └── Module_03/
        ├── BinarySearchTree.java
        ├── SearchingAlgorithms.java
        ├── SortingAlgorithms.java
        └── PerformanceAnalyzer.java
```

## Requirements and Command-Line Setup

Use **JDK 8 or newer**, with `java` and `javac` available in your terminal.
No external libraries are required. The source was compiled with Java 8 compatibility using JDK 24.

From the repository root, compile and run:

```sh
javac -d out src/Main.java src/Module_01/*.java src/Module_02/*.java src/Module_03/*.java
java -cp out Main
```

If PowerShell does not expand the source wildcards, use:

```powershell
$sources = Get-ChildItem src -Recurse -Filter *.java | ForEach-Object FullName
javac -d out $sources
java -cp out Main
```

