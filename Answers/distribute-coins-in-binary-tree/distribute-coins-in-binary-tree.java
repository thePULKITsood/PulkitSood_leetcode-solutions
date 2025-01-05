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
    int count = 0;
    
    public int distributeCoins(TreeNode root) {
        distributeCoins_( root);
        return count ;
    }
// this will be post order and i will return the number of cois i have - 1 
   
//     if i have positive coins then good other wise i will return -ve coins and it will denote the transfer of coins from the  parent to child so in this way i need to traverse only from bottom to top and care about only onedirection 
    
    int distributeCoins_ (TreeNode root){
        if (root == null ) return 0;
        
        
        
        int left = distributeCoins_(root.left);
        int right = distributeCoins_(root.right);
        
        count +=Math.abs(left);
        
        count +=Math.abs(right);
        
        root.val = root.val + left + right ;
        
        return root.val - 1;
    }
}