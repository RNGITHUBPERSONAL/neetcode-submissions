// /**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode() {}
//  *     TreeNode(int val) { this.val = val; }
//  *     TreeNode(int val, TreeNode left, TreeNode right) {
//  *         this.val = val;
//  *         this.left = left;
//  *         this.right = right;
//  *     }
//  * }
//  */

// class Solution {
//   public int diameterOfBinaryTree(TreeNode root) {
//     if (root == null)
//       return 0;

//     int left = maxHeight(root.left);
//     int right = maxHeight(root.right);
//     int diameter = left + right;

//     int mx=Math.max(diameterOfBinaryTree(root.left),diameterOfBinaryTree(root.right));

//     return Math.max(mx,diameter);
//   }

//   public int maxHeight(TreeNode root) {
   
//     if (root == null)
//       return 0;

//     int left = diameterOfBinaryTree(root.left) ;
//     int right = diameterOfBinaryTree(root.right) ;

//     int mx = Math.max(left, right);
//     return mx+1;
//   }
// }
class Solution {

    public int diameterOfBinaryTree(TreeNode root) {

        if (root == null) {
            return 0;
        }

        // Height of left subtree
        int left = maxHeight(root.left);

        // Height of right subtree
        int right = maxHeight(root.right);

        // Diameter passing through current root
        int diameter = left + right;

        // Maximum diameter completely inside left or right subtree
        int leftDiameter = diameterOfBinaryTree(root.left);
        int rightDiameter = diameterOfBinaryTree(root.right);

        int maxSubtreeDiameter = Math.max(leftDiameter, rightDiameter);

        return Math.max(diameter, maxSubtreeDiameter);
    }


    public int maxHeight(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int left = maxHeight(root.left);
        int right = maxHeight(root.right);

        return Math.max(left, right) + 1;
    }
}