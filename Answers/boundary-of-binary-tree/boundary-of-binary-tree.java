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
    public List<Integer> boundaryOfBinaryTree(TreeNode root) {
        
       ArrayList <Integer> res = new ArrayList<>();  
    
        ArrayList <Integer> rightB = new ArrayList<>(); 
        
        if (root == null) return res;
        
        
//         1. add root 
        
        if (!isLeaf(root)) res.add(root.val);
        
        // 2. add the left boundry -if the  root.left exist 
        TreeNode left = root.left;
        
        while (left!=null){
            if (! isLeaf(left ) ) res.add(left.val);
            
            //updating left 
            if (left.left !=null) left = left.left;
            
            else  left = left.right;
            
        }
        
        
        // 3. add leaves 
        addLeaves(root,res);
        
//         4. add right boundry it must be reversed and then added 
        TreeNode right = root.right;
        while (right != null){
            if (!isLeaf(right )) rightB.add(right.val);
            
            if (right.right  !=null) right = right.right;
            
            else right = right.left;
        }
        
        for (int i = rightB.size() - 1 ; i>=0;i--){
            res.add(rightB.get(i));
        }
        return res;        

    }


public boolean isLeaf(TreeNode root){
    
    if (root.left ==null && root.right == null) return true;
    return false;
}
void addLeaves (TreeNode root , ArrayList <Integer> res ){
    if (root == null ) return;
    if (isLeaf(root)) res.add(root.val);
    
//     make call to left and right
    addLeaves(root.left,res);
    addLeaves(root.right,res);
    
    
}}




//  the traversal is preorder traversal and we are taking the boundaray nodes 
// the approach of left view and right view is wrong the correct approach is - left boundary + right boundary + leaf nodes 

// print the left boundry of the tree then print the leaf nodes and then print the right boundary 
// pass root in the left boundary and dont print the leaf nodes  -- check left - go left check right go right 
// print the leaf nodes  - pass the root 
// pass root.right in the right boundary and do not print the leafs  - check right - go right check left - go left 