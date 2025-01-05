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
    public boolean isCousins(TreeNode root, int x, int y) {
        if (root == null)return false;
        
        LinkedList<TreeNode > q = new LinkedList();
        q.addLast(root);
        
        while(q.size() != 0){
            
            int size = q.size();
            
            boolean foundx = false;
            boolean foundy = false;
            
            while (size -- > 0)
            {
            TreeNode rem = q.removeFirst();
                
            if (rem.val == x )foundx = true;
            if (rem.val == y) foundy = true;
                
//                 checking siblings  - same parent then false 
                
                if (rem.left != null && rem.right != null)
                {
                    if (rem.left.val == x && rem.right.val == y) return false;
                    if (rem.left.val == y && rem.right.val == x) return false;
                }
                
//                 adding the children
                if (rem.left  != null)q.addLast(rem.left);
                if (rem.right != null)q.addLast(rem.right);
                
            }
            
            if (foundx && foundy) return true;
            // if(foundx || foundy )return false;
            
        }
        return false;
    }
}
// bfs chalao and for each level check if i have found x and y and before filling the q check if the root.left and root.y are not equal to x and y as they must have different parents 