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
class Solution {
     TreeNode x = null, y = null, prev = null;

    public void  recoverTree_(TreeNode root) {

        if (root == null)
            return ;

        recoverTree_(root.left);
            

        if (prev != null && prev.val > root.val) {
            y = root; // ik lata lag gya 
            
            if (x == null) // if a bhi nahi pta then a==prev ho jana as prev and root me panga hai
                x = prev;
           
        }

        prev = root;
        
        recoverTree_(root.right);
           


    }

    public void recoverTree(TreeNode root) {
        recoverTree_(root);
        int temp = x.val;
        x.val = y.val;
        y.val = temp;
    }
}