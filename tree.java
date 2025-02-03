import java.util.ArrayList;
import java.util.List;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

class Binarytree {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorder(root, result);
        return result;
    }

    private void inorder(TreeNode node, List<Integer> result) {
        if (node != null) {
            inorder(node.left, result); 
            result.add(node.val);      
            inorder(node.right, result); 
        }
    }
}

class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        Binarytree tree = new Binarytree();
        List<Integer> result = tree.inorderTraversal(root);

        System.out.println("In-order Traversal: " + result); 
    }
}

