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
    List<Integer> ans = new ArrayList ();
    
    public List<Integer> rightSideView(TreeNode root)
    {
//         simple bfs and we add the first  one for the level and we add from right ot left in the q 
         if (root == null) return ans;
        LinkedList <TreeNode > q = new LinkedList();
        
        helper (root , q);
        return ans;
        
        
    }
    
    public void helper (TreeNode root,LinkedList <TreeNode > q ){
        q.addLast(root);
        boolean flag = true;
        
        while (q.size() > 0 )
        {
            int size = q.size();
            
            // i will add the first elemnt from th eright side in the q and t
            // then i will mark the flag as false and i will make it true at the end of the size 
            
            while (size -- > 0 )
            {
                TreeNode temp = q.removeFirst();
                if (flag)
              {
                    flag = false ;
                    ans.add(temp.val);    
                }
                // if false then no need 
                
                if (temp.right!=null) q.addLast(temp.right);
                if (temp.left!=null) q.addLast(temp.left);
                
//                 
            }
            flag = true ;
            
        }
    }
}