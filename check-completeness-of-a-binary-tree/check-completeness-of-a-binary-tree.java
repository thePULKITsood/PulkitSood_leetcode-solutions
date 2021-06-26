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
    public boolean isCompleteTree(TreeNode root) {
        // it is quite a simple problem here we just do a tree bfs and we see if we encounter a null node that must be the last null node and if we encounter any node after that null node we will return false
        
        
LinkedList <TreeNode > q = new LinkedList();
        
        q.addLast(root);
        boolean end = false;
        
        while (q.size()!=0){
            
            int size = q.size();
            
            while (size -- > 0 ){
                
                TreeNode rem = q.removeFirst();
                
                if (rem == null)
                {
                    end = true;
                }  
                else
                {
                    //then we se some other value which is not null 
                    if(end) return false;
                
                q.addLast(rem.left);
                q.addLast(rem.right);
                
                }
            }
        }
        return true;
    }
}