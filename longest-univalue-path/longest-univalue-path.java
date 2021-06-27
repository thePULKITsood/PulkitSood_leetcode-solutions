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
    int ans ;
    public int longestUnivaluePath(TreeNode root) {
        ans =0;
        longestUnivaluePath_(root);
        return ans;
        
    }
    
    int longestUnivaluePath_(TreeNode root ){
// //     this function is returning 
//        max length path from it including it
// //      if the root is same as right child path = right path + 1 
            
// //       if the root is same as left child path = left path + 1
// //       we will return what ever is maximum from that 
            
//         and to update the global variable we check 3 things - 
//          left + root , right + root  - left + right + root 
//         to make it more simple we make two variable left check and right check and we use them for making calculation easier 
        
        if (root == null )return 0;
        
        int left = longestUnivaluePath_(root.left);
        int right = longestUnivaluePath_(root.right);
    
        int leftarrow=0,rightarrow=0;
        
        if (root.left != null && root.val == root.left.val){
            leftarrow = left + 1 ;
        }
        
         if (root.right != null && root.right.val == root.val) {
            rightarrow += right + 1;
        }
        ans = Math.max(ans, leftarrow+rightarrow);
//         this takes care of the three cases  if left = 0 then only right is considered and same for right ]
//         and if both of them are non zero we consider both to form a maz path 
        return Math.max(leftarrow,rightarrow);
        
    }
    
}