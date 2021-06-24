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
  HashSet<Integer> set = new HashSet<>();
    
public TreeNode lowestCommonAncestor(TreeNode root, TreeNode[] nodes) {
	for (TreeNode n : nodes) set.add(n.val);
	return traverse(root);
}

public TreeNode traverse(TreeNode node) {
	if (node == null) return null;
	if (set.contains(node.val)) return node;
	TreeNode left = traverse(node.left);
	TreeNode right = traverse(node.right);
	if (left != null && right != null) return node;
	if (left != null) return left;
	return right;
}
    
    
}