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
    class pair {
        int forw = -1 ; 
        int back = -1 ;
        int maxbelowme = 0 ;
        pair(){
            
        };
        pair (int a , int b , int c ){
            forw = a;
            back = b ; 
            maxbelowme = c;
        }
    }
    public int longestZigZag(TreeNode root) {
        pair ans= longestZigZag_(root);
        return ans.maxbelowme;
    }
    public pair longestZigZag_(TreeNode root){
        if (root == null) return new pair();
        pair left = longestZigZag_( root.left);
        
        pair right = longestZigZag_(root.right);
        
        int incme =Math.max (left.back , right.forw ) + 1 ;
        
        int maxbelowme = Math.max(Math.max(left.maxbelowme , right.maxbelowme) , incme)
;        return new pair (left.back + 1 , right.forw + 1 , maxbelowme);
    }
}