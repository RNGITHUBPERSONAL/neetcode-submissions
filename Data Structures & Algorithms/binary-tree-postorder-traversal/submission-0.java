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
    List<Integer> lst=null;
    public List<Integer> postorderTraversal(TreeNode root) {
        lst= new ArrayList();
        postOrder(root);
         return lst;
    }

    public void postOrder(TreeNode root){

        if(root==null){
return;

        }
 
postOrder(root.left);
postOrder(root.right);
lst.add(root.val);

    }
}