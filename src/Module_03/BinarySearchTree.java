package Module_03;

public class BinarySearchTree {

    // Node class
    static class Node {
        int value;
        Node left, right;
        Node(int value) { this.value = value; }
    }

    Node root;

    // Insert a value
    public void insert(int value) {
        root = insertRec(root, value);
    }

    private Node insertRec(Node node, int value) {
        if (node == null) return new Node(value);
        if (value < node.value) node.left = insertRec(node.left, value);
        else if (value > node.value) node.right = insertRec(node.right, value);
        return node;
    }

    // Search for a value
    public boolean search(int value) {
        return searchRec(root, value);
    }

    private boolean searchRec(Node node, int value) {
        if (node == null) return false;
        if (node.value == value) return true;
        if (value < node.value) return searchRec(node.left, value);
        return searchRec(node.right, value);
    }

    // Print in-order (sorted order)
    public void inOrder(Node node) {
        if (node == null) return;
        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }
}