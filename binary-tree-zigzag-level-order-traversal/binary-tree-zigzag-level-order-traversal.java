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
        // when level is /2 then left to right other wise go from right ot left 
        
        // here we will not use queue we will use stack because it will hamper our order and we do not want a mixed bag 
          // now in stack if level /2 --> i will add  left to right so that my choldren comes out right to left 
          // for level 1 i will add from right ot left and when i will pop then the order will be the exact ewhich i want 
            // dry run bitch 
        
        LinkedList<TreeNode> s = new LinkedList();
        helper(root,s);
        return ans;
    }
  public  void  helper (TreeNode root ,  LinkedList<TreeNode> s )
    {
        int level = 0 ;
        s.addFirst(root);
      LinkedList<TreeNode> cs = new LinkedList();
//       i have to keep a child stack dry run and know why 
//       beacuse when i remove one value and ad its children then its sibling is left below 
        
        
        
        // now i will begin 
        
        while (s.size()> 0 )
        {
             int size = s.size();
            List<Integer> minans = new ArrayList();
            
              while (size -- >0)
            {
                
                TreeNode temp = s.removeFirst();
                  
                minans.add(temp.val);
                
                if (level % 2 == 0)
                {
                    // add left to right in the stack 
                    
                    if (temp.left != null) cs.addFirst(temp.left);
                     if (temp.right != null) cs.addFirst(temp.right);
                }
                
                 if (level %2 == 1)
                    {
                    // add rightto left  in the stack                
                    if (temp.right != null) cs.addFirst(temp.right);
                    if (temp.left != null) cs.addFirst(temp.left); 
                }
            }
            s =cs;
            cs = new LinkedList();
            level ++ ;
            ans.add(minans);
        }
    }
}