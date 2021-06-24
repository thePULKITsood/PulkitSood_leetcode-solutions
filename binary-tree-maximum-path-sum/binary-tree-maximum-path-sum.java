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

       // possible answers 
        // 1 . the ans is in the left subtree between any two nodes in the left subtree 
        // 2 .the ans is in the left subtree between any two nodes in the left subtree 
        
        // 3 the ans is root + leftnode to some node sum
        // 4 . the ans is root + rightnode to some node sum
        
        // 5 . the answer is the root only 
        // 6 the answer is  root +  maxpath from root.left  + maxpath from root.right
        

// return type of the function 

// apne ko include karte hue apne se kissi bhi node in your tree uska sum return karde jo ki maximum ho 

// then i will makse 3 4 5 6  and update the max and it already has 1 2 in it 

class Solution {
    int maxNTN = -(int) 1e9;
    public int maxPathSum(TreeNode root) {
          if (root == null)
            return 0;
        help (root);
        return maxNTN;
        
 
        
    }
    int help (TreeNode root){
        if (root== null ) return -(int)1e9;
        int leftToSomeNodeMaxPathSum = help(root.left);
        int rightToSomeNodeMaxPathSum = help(root.right);
        int maxsuumtillrootincludingit = Math.max(leftToSomeNodeMaxPathSum,rightToSomeNodeMaxPathSum) + root.val;
        //max of 4 things 
        maxNTN =  Math.max(Math.max(maxNTN ,maxsuumtillrootincludingit ) , Math.max(root.val , rightToSomeNodeMaxPathSum + leftToSomeNodeMaxPathSum +root.val) );
        return (Math.max(maxsuumtillrootincludingit,root.val));
        
        
    }
}







