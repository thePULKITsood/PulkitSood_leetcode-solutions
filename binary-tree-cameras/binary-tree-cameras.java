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
    // -1  ->  i need a camera
    //  0  -> i am covered 
    //  1  -> i have a camera  
    
    int camera=0;
    public int minCameraCover(TreeNode root) {
        
        if(func(root)==-1) return (camera + 1);
        
        return camera;
        
    }
  int   func(TreeNode root){
        if(root==null) return 0;
        
        int left = func(root.left);
        int right = func(root.right);
        
      if(left==-1 || right ==-1 ){
            camera++;
            return 1;
        }
        if(left==1 || right ==1)
            return 0;
        
        
        if(left==0 && right ==0)
            return -1;
        
        return -1; //->  just the base case say i need a camera thats it 
    }
}