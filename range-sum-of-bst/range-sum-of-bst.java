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
    public int rangeSumBST(TreeNode root, int low, int high) {
        return rangeSumBST_(root,low,high);
    }
    int rangeSumBST_(TreeNode root, int low, int high){
        int sum = 0;
        
        if (root==null) return sum;
        
        if( root.val >=low && root.val <= high )
            sum+=root.val;
        
        // means if the rootval > low only then we search the left subtree 
//             ass the values in the left subtree are smaller than this one and if root.val < low then there is no need to search the left tree 
    
         if(root.val > low)
             sum+= rangeSumBST_(root.left , low , high);
        
         if(root.val <high )
             sum+= rangeSumBST_(root.right , low , high);
            
        return sum;
    }
}