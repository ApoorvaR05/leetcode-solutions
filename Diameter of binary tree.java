// Given the root of a binary tree, return the length of the diameter of the tree.
// The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.
// The length of a path between two nodes is represented by the number of edges between them.
// time: O(n), space: O(h)

class Solution {
    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        search(root);
        return diameter;
    }
    private int search(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int hleft = search(root.left);
        int hright = search(root.right);
        diameter = Math.max(diameter, hleft + hright);
        return Math.max(hleft, hright) + 1;
    }
}
