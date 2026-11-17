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
    public int goodNodes(TreeNode root) {
        int maxVal = -9999;
        return goodDfs(root, maxVal);
    }
    int goodDfs(TreeNode node, int max) {
        if (node == null) {
            return 0;
        }
        int res = node.val >= max ? 1 : 0;
        max = Math.max(node.val, max);
        res = res + goodDfs(node.left, max);
        res = res + goodDfs(node.right, max);
        return res;
    }
}
