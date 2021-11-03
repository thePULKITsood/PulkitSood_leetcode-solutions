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
        TreeNode node ;
        int index;
        pair (TreeNode node ,int index){
            this.node = node;
            this.index = index;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        
          if (root == null)
            return 0;
        
        int maxwidth = 0;
        
        LinkedList<pair > q= new LinkedList();
        
        q.addLast(new pair(root,0));
        
       
        
        while (q.size()!=0){
            
            pair rem = q.getFirst();
            pair head = q.getFirst();
            int size = q.size();
            
            while (size -- > 0){
                
                rem = q.removeFirst();
                TreeNode node = rem.node;
                int index = rem.index;
                
                if (node.left!=null) q.addLast(new pair (node.left,index * 2 ));
                
                if (node.right!=null) q.addLast(new pair (node.right,index * 2  + 1 ));
                
//                 calculating the width 
                
            }
             // calculate the length of the current level,
            //   by comparing the first and last col_index.
            
            int first = head.index;
            int last = rem.index;
            int thislevel = last -first +1;
            maxwidth = Math.max(maxwidth,thislevel);
        }
        return maxwidth;
        
    }
}