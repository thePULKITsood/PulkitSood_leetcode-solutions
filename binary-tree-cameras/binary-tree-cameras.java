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

//              either have camera       
//           /
//     node / 
//          |--  or i have no camera  
//                                     \
//                                      \ 1. i am covered    - my child has camera 
//                                       \
//                                        \ 2. i am not covered - either give me a camera or cover me 
//                                         |                                                       
                 
//                  not talking about the parent as i am going from bottom to top 
    
    
 // -- greedy  solution 
    
//     if you need a camera  = -1 
//         if you have a camers = 0 
//             if you are covered = 1 
    int camera = 0;
    public int minCameraCover(TreeNode root) {
        
        int ans = minCameraCover_(root);
        if (ans == -1) return camera + 1;
        return camera;
        
    }
   int  minCameraCover_ (TreeNode root ){
       
        if (root == null ) return 1;
       
        int left = minCameraCover_(root.left);
        int right = minCameraCover_(root.right);
        
        
        if (left == -1 || right == -1 ){
            camera ++;
            
            // i will have to place a camera as my child needs it and i will pass i have camera 
            
            return 0;
        }
        
        if (left == 0 || right == 0 ){
            // if my left has camera or my right has camera 
//             i am covered 
            return 1;
        }
        if (left == 1  && right == 1 ){
            
            // my left is covered and my right is covered
            // then i must not put a camera on me i must return -1 so that my parent can know i need a camera 
            
                return -1 ;
        }
        return -1 ;
        
    }
    
    
    
    
    
}