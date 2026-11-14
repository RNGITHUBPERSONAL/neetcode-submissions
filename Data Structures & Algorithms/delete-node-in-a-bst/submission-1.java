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
    public TreeNode deleteNode(TreeNode root, int key) {
        // If root is null, return null
        if (root == null) {
            return null;
        }

        // Search in the right subtree
        if (key > root.val) {
            root.right = deleteNode(root.right, key);
        }

        // Search in the left subtree
        else if (key < root.val) {
            root.left = deleteNode(root.left, key);
        }

        // Key matches the current node
        else {
            // If there is no left child, return the right child
            if (root.left == null) {
                return root.right;
            }

            // If there is no right child, return the left child
            if (root.right == null) {
                return root.left;
            }

            // Find the smallest node in the right subtree
            TreeNode successor = root.right;

            while (successor.left != null) {
                successor = successor.left;
            }

            // Replace the current node's value with successor's value
            root.val = successor.val;

            // Delete the successor from its original position
            root.right = deleteNode(root.right, successor.val);
        }

        // Return the current root
        return root;
    }
}

// it visits the right subtree twice for two different purposes.
// First traversal: Find the successor
// Second traversal: Delete the original successor

// Why root.right?

// Because the original successor (55) is somewhere inside the right subtree of the node we are deleting.