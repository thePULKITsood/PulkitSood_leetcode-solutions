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
    public int deepestLeavesSum(TreeNode root) {
int ans = 0;        
//         iterative bfs 
        LinkedList<TreeNode > q = new LinkedList<>();
        q.addLast(root);
        
        while (q.size () > 0 )
        {
            int size = q.size();
            int sum = 0;
            
            while (size-- > 0){
//                 remove work add children 
                TreeNode temp = q.removeFirst();
                sum += temp.val;
                
                if (temp.left!=null) q.addLast(temp.left);
                
                if (temp.right!=null) q.addLast(temp.right);
            
            }
            ans = sum;
        }
        return ans;
        
    }
}