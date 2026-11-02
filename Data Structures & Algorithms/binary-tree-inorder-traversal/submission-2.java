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
  private List<Integer> res;
  public List<Integer> inorderTraversal(TreeNode root) {
    res = new ArrayList();
    inorderTraversal1(root);
    return res;
  }

  public void inorderTraversal1(TreeNode root) {
    if(root==null) return;
    inorderTraversal1(root.left);
res.add(root.val);
    inorderTraversal1(root.right);
  }
}