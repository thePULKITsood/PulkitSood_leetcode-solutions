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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
    if (root == null )return ans    ;
     
        Stack <TreeNode> s = new Stack();
        helper(root,s);
        return ans;
    }
  public  void  helper (TreeNode root ,  Stack <TreeNode> s )
    {
        int level = 0 ;
        s.push(root);
      Stack <TreeNode> cs = new Stack();

        while (s.size()> 0 )
        {
             int size = s.size();
            List<Integer> minans = new ArrayList();
            
              while (size -- >0)
            {
                TreeNode temp = s.pop();
                minans.add(temp.val);
                
                if (level % 2 == 0)
                {
                    // add left to right in the stack 
                    
                    if (temp.left != null) cs.push(temp.left);
                     if (temp.right != null) cs.push(temp.right);
                }
                
                 if (level %2 == 1)
                    {
                    // add rightto left  in the stack                
                    if (temp.right != null) cs.push(temp.right);
                    if (temp.left != null) cs.push(temp.left); 
                }
            }
            s =cs;
            cs = new Stack();
            level ++ ;
            ans.add(minans);
        }
    }
}