
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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorder(res, root);
        return res;

    }
    private void inorder(List<Integer> res, TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(res, root.left);
        res.add(root.val);
        inorder(res, root.right);
    }
}

// stack implementation
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();

        TreeNode curr = root;

        while (curr != null || !st.isEmpty()) {

            while (curr != null) {
                st.push(curr);
                curr = curr.left;
            }

            curr = st.pop();
            ans.add(curr.val);

            curr = curr.right;
        }

        return ans;
    }
}
/*
| Traversal         | Time | Space    |
| ----------------- | ---- | -------- |
| Recursive Inorder | O(n) | O(h)     |
| Iterative Inorder | O(n) | O(h)     |
| Balanced Tree     | O(n) | O(log n) |
| Skewed Tree       | O(n) | O(n)     |

  "Each node is visited once, giving O(n) time, and the recursion/stack stores at most the tree height h, giving O(h) space." */
