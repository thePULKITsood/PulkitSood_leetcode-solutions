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
    public void flatten(TreeNode root) {
        dfs(root);
    }
    
   TreeNode  dfs (TreeNode root ){
     if (root == null) return root;
       //        if root ==leaf return root 
       
       if (root.left == null &&  root.right == null)return root;
       
       TreeNode leftend = dfs(root.left);
       TreeNode rightend = dfs(root.right);
      if (leftend!=null)
      { 
     leftend.right = root.right;
       leftend.left=null;
        root.right =root.left;
           root.left =null;
      }
       if (rightend!=null)
       {
       rightend.left =null;
       rightend.right =null;
       }
       
      
        
      
       
       return rightend==null ? leftend : rightend ;
   }
}
// basic dfs preorder travesal root - left - right 
// we will do it recursively 

// say to the left tree get linear and return me your end pointer 
// say to right tree get linear and return me your end pointer and i will join the right top to the left end 
// like we did in the pep coding narray tree 