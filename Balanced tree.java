// Given a binary tree, determine if it is height-balanced.
// time: O(n), space: O(h)

class Solution {
    public boolean isBalanced(TreeNode root) {
        return height(root) != -1;
    }
    private int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int hleft = height(root.left);
        if (hleft == -1) {
            return -1;
        }
        int hright = height(root.right);
        if (hright == -1) {
            return -1;
        }

        if (Math.abs(hleft - hright) > 1) {
            return -1;
        }
        return Math.max(hleft,hright) + 1;
    }
}
/*
check at each node whther it is balance
balance factor = height of left subtree - height of right subtree  => must be either -1,0,1 */
