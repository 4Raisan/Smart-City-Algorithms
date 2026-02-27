package src.Module_01;

public class LocationBST {

    class TreeNode {
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

    public  void inorder(){
        inorder(root);
    }
    private void inorder(TreeNode root){
        if (root == null){
            inorderRec(root.left);
            System.out.print(root.name );
            inorder(root.right);
        }
    }




}
