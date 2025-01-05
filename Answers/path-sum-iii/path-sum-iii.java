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
    ArrayList<Integer> list = new ArrayList<>();
    
    public int pathSum(TreeNode root, int targetSum) {
    
        getsum(root,targetSum);
        return count ;
        
    }
    public void getsum (TreeNode root, int targetSum) {
        if (root == null)return ;
        
        // preorder left side keep adding the digit 
        list.add(root.val);
        
//         make a call
        getsum(root.left,targetSum);
        
        getsum(root.right,targetSum);
        
//         in order 
        // check from this node to the upper node if they from a sum == target and as we know they must go only down in a straight line so we can do this 
        
        int temp = 0;
        for (int i = list.size()-1 ; i>=0 ; i--){
            temp+= list.get(i);
            if (temp==targetSum)
                count++;
        }
        list.remove(list.size()-1);
        
        
    }
}

