//Given a binary tree, determine if it is height-balanced.
//Height-Balanced: A height-balanced binary tree is a binary tree
// in which the depth of the two subtrees of every node never differs by more than one.

// time complexity: O(n), space complexity: O(1)

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

public class IsBalanced {
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        int dif;
        if(left > right){
            dif = left - right;
        } else{
            dif = right -left;
        }

        return dif <= 1 && isBalanced(root.left) && isBalanced(root.right);

    }

    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }

        if(root.left == null && root.right == null){
            return 1;
        }

        int left = 0;
        int right = 0;

        if (root.left != null){
            left = maxDepth(root.left);
        }

        if (root.right != null){
            right = maxDepth(root.right);
        }

        if(left > right){
            return left + 1;
        }

        return right + 1;
    }
}
