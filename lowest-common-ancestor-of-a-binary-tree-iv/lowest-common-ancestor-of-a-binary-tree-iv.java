/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    TreeNode lca = null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode[] nodes) {
        Set<Integer> targetNodes = new HashSet<>();
        for(TreeNode node : nodes) {
            targetNodes.add(node.val);
        }
        helper(root, targetNodes);
        return lca;
    }
    
    int helper(TreeNode root, Set<Integer> nodes) {
        if(root == null) return 0;
        int leftCount = helper(root.left, nodes);
        int rightCount = helper(root.right, nodes);
        int foundCount = leftCount + rightCount;
        if(nodes.contains(root.val)) {
            foundCount++;
        }
        if(foundCount == nodes.size() && lca == null) {
            lca = root;
        }
        
        return foundCount;
    }
}   
    
