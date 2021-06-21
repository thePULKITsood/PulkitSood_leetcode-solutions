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
    
    List<List<Integer>> ans = new ArrayList();
    
    public List<List<Integer>> levelOrder(TreeNode root) 
    {
        if (root == null)return ans;
        
        LinkedList<TreeNode> q = new LinkedList<>();
        
        help(root , q);
        return ans;
    }
    
    public void help(TreeNode root ,LinkedList<TreeNode> q)
    {
        q.addLast(root);
        
        while (q.size()>0)
            
        { 
            List<Integer> minans = new ArrayList();
            int size = q.size() ;
     
            while (size -- >0)
            {
//             remove 
                TreeNode temp = q.removeFirst();
            
//             work
                minans.add(temp.val);
            
//             add Children  - we have to see they must not be null 
                if (temp.left != null)q.addLast(temp.left);
                if (temp.right != null)q.addLast(temp.right);
            
        }
            ans.add(minans);
    }
    }
    
}