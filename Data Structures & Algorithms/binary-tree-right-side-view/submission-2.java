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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Queue<TreeNode> que = new ArrayDeque<>();
        if (root == null) {
            return result;
        }

        que.add(root);
        int levelVal = 0;

        while (!que.isEmpty()) {
           
            int levelSize = que.size();  // it doenoted the size of current level

            for (int i = 0; i < levelSize; i++) {
                TreeNode current = que.poll();
                levelVal = current.val;// it will  always add last value of node  or partuclular levlel

                if (current.left != null) {
                    que.add(current.left);
                }
                if (current.right != null) {
                    que.add(current.right);
                }
            }
            result.add(levelVal);
        }
        return result;
    }
}




//if you have 3,5 thn levelSize is 2 so first will inside the inner loop , sectime when it loop it get 5 , now when it move to 3 tiem it comes to outer part and update the val in reslt.
