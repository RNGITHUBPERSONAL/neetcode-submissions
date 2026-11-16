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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> que = new ArrayDeque<>();
 if (root == null) {
            return result;
        }

        
            que.add(root);
      

        while (!que.isEmpty()) {
            int size = que.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode current = que.poll();
                level.add(current.val);

                if (current.left != null) {
                    que.add(current.left);
                }
                if (current.right != null) {
                    que.add(current.right);
                }
            }
            result.add(level);
        }
        return result;
    }
}
