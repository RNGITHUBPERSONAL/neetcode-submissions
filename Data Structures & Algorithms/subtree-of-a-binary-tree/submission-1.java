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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        String s1 = traverse(root);
        String s2 = traverse(subRoot);
        if (s1.contains(s2)) {
            return true;
        }
        return false;
    }

    String traverse(TreeNode node) {
        StringBuilder strb = new StringBuilder("");
if(node==null) return "null";
        strb.append(node.val);
        strb.append(traverse(node.left));
        strb.append(traverse(node.right));
        return strb.toString();
    }
}
