// Given the root of a Binary Search Tree (BST), return the minimum difference between the values of any two different nodes in the tree.
// time: O(n), space: O(h)

class Solution {
    int ans = Integer.MAX_VALUE;
    TreeNode prev;

    private void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(root.left);

        if (prev != null) {
            ans = Math.min(ans, root.val - prev.val);
        }
        prev = root;
        inorder(root.right);
    }

    public int minDiffInBST(TreeNode root) {
        inorder(root);
        return ans;
    }
}
