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
    public TreeNode balanceBST(TreeNode root) {
        if (root == null)
            return null;
        
        if (root.left == null && root.right == null)
            return root;
        
        List<Integer> bstArray = new ArrayList<Integer>();
        getSortedList(root, bstArray);
        
        return createBST(bstArray, 0, bstArray.size()-1);
      
    }
    
    public void getSortedList(TreeNode root, List<Integer> list) {
        
        if (root == null)
            return;
        
        getSortedList(root.left, list);
        list.add(root.val);
        getSortedList(root.right, list);
    }
    
    public TreeNode createBST(List<Integer> list, int start, int end) {
        
        if (start > end)return null;
        
        int mid = (start + end)/2;
        
        TreeNode root = new TreeNode(list.get(mid));
        root.left = createBST(list, start, mid-1);
        root.right = createBST(list, mid+1, end);
        
        return root;
    }
}