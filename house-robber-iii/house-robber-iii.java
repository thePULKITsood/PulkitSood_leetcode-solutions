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
    class money {
        int yes = 0 ;
        int no = 0;
        
        money(){};
        
        money (int yes , int no ){
            this.yes = yes;
            this.no = no;
        }
    }
    public int rob(TreeNode root) {
//         include and exclude technique 
//         with robbery and withour robbery max amount 
        money ans = rob_(root);
        return Math.max(ans.yes, ans.no);
    }
    money rob_(TreeNode root){
        if (root == null) return new money();
        
       money left = rob_(root.left);
        money right = rob_(root.right);
        
        int yesrob = left.no + right.no + root.val;
        
        int norob = Math.max(left.yes,left.no) + Math.max(right.yes,right.no);
        
        return new money(yesrob,norob);
    } 
}