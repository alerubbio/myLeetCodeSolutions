// Problem Desc: Insert val into BST given root of Tree. Val is a unique value not yet in the array.

// Solution: Recurisvely loop through tree by comparing the current node's val to parameter val
// Runtime: O(logn) or height of tree     n -> number of nodes in tree 




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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        // Base Case: Null root is passed to recursive function
        if(root ==  null)
            root = new TreeNode(val);
        if(root.val < val)
            root.right = insertIntoBST(root.right, val);
        if(root.val > val)
            root.left = insertIntoBST(root.left, val);

        return root;
    }
}