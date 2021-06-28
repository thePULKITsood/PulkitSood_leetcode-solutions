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
    
    public boolean isBalanced(TreeNode root) {
       int ans []= isBalanced_(root);
        if (ans[0]==0) return false;
        return true;
        
    }
    // int [0] = balanced or not 
    // int [1] = height ;
  public   int [] isBalanced_(TreeNode root ){
      
      if (root == null ) return new int []{1,0};
      
      int []left = isBalanced_(root.left);
      int []right = isBalanced_(root.right);
      
      if (left[0] == 0 || right [0]==0) return new int []{0,0};
      
//       now i have checked if left and right  subtree is balnced or not 
//       now calculate the difference in the heights 
      if (Math.abs(left[1] - right [1]) >1) return new int [] {0,0};
      
      int myheight = Math.max(left[1] , right[1]) + 1 ;
      return new int []{1, myheight};
      
    }
    
}