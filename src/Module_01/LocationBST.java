package Module_01;

public class LocationBST {

    static class TreeNode {
        String name;
        TreeNode left;
        TreeNode right;

        TreeNode(String name) {
            this.name = name;
            left = right = null;
        }

    }

    private  TreeNode root;

    public void insert (String name){
        root = insertRec (root, name);
    }

    private TreeNode insertRec(TreeNode root, String name){

        if (root == null)
            return new TreeNode(name);

        if (name.compareTo(root.name) < 0)
            root.left = insertRec(root.left, name);
        else if (name.compareTo(root.name) > 0)
            root.right = insertRec(root.right, name);

        return root;
    }

    public void delete(String name){
        root = deleteRec(root, name);
    }

    private TreeNode deleteRec(TreeNode root, String name){

        //if there is empty, just return null
        if (root == null)
            return null;

        //search left or right
        if (name.compareTo(root.name) < 0) {
            root.left = deleteRec(root.left, name);
        }
        else if (name.compareTo(root.name) > 0)
            root.right = deleteRec(root.right, name);

        else {
            if (root.left == null)
                return root.right;

            else if (root.right == null)
                return root.left;

            TreeNode smallest = root.right;
            while (smallest.left != null)
                smallest = smallest.left;

            //replace the current node
            root.name = smallest.name;

            //delet that smallest node from right
            root.right = deleteRec(root.right, smallest.name);

        }
        return root;
    }
        public void inorder(){
            inorder(root);
            System.out.println();
    }
    private void inorder (TreeNode root){
            if (root != null) {
                inorder(root.left);
                System.out.print(root.name + " ");
                inorder(root.right);
            }
        }
}

