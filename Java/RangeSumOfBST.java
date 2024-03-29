// Given the root node of a binary search tree, return the sum of values of 
// all nodes with value between L and R (inclusive).
// The binary search tree is guaranteed to have unique values.

// Solution: Perform DFS on BST and all visited nodes falling between L & R
// Runtime: O(n) where n is the number of nodes.
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
    public int rangeSumBST(TreeNode root, int L, int R) {
        if(root == null)
            return 0;
        if(root.val >= L && root.val <= R)
            return root.val + rangeSumBST(root.left, L, R) + rangeSumBST(root.right, L, R);
        return rangeSumBST(root.left, L, R) + rangeSumBST(root.right, L, R);
    }
}