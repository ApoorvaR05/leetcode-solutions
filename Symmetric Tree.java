
// Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
// time: O(n)
// space: O(h)

class Solution {
    public boolean isSymmetric(TreeNode root) {
        return mirror(root.left,root.right);
    }
    private boolean mirror(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) { //only 1 will be true
            return false;
        }
        return left.val == right.val && mirror(left.left,right.right) && mirror(left.right, right.left);
    }
}
