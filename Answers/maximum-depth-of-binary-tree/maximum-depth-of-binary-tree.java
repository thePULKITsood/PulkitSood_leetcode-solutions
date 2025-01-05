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

// depth in number of nodes apply bfs 

class Solution {
    public int maxDepth(TreeNode root) {
        
        int level = 0 ;
        if (root==null)return level;
        LinkedList<TreeNode> q = new LinkedList();
        q.addLast(root);
        
        while (q.size ()!=0){
            int size = q.size ();
            while (size -- > 0){
                TreeNode rem = q.removeFirst();
                if(rem.left!=null) q.addLast(rem.left);
                if(rem.right!=null) q.addLast(rem.right);
                
                
            }
            level++;
        }
        return level;
    }
}