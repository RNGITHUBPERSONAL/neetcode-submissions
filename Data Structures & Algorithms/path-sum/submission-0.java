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
    ArrayList<Integer> arr = new ArrayList();
    public boolean hasPathSum(TreeNode root, int targetSum) {
        List<Integer> sums = new ArrayList<>();

        calculatePathSum(root, 0, sums);

        return sums.contains(targetSum);
    }
    public void calculatePathSum(TreeNode root, int val, List<Integer> sums) {
        if (root == null) {
            
            return;
        }
         val = val + root.val;

        if (root.left == null && root.right == null) {
           sums.add(val);
        }

        calculatePathSum(root.left, val, sums);
        calculatePathSum(root.right, val, sums);
    }
}
