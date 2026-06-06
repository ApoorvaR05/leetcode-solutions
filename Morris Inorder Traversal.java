// time: O(n), space:O(1)

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        TreeNode curr = root;

        while (curr != null) {
            if (curr.left == null) {
                res.add(curr.val);
                curr = curr.right;
            }
            else {
                TreeNode prev = curr.left;
                while (prev.right != null && prev.right != curr) {
                    prev = prev.right;
                }
                if (prev.right == null) {
                    
                    prev.right = curr;
                    curr = curr.left;
                }
                else {
                    prev.right = null;
                    res.add(curr.val);
                    curr = curr.right;
                }
            }
        }
        return res;
    }
}
/*
No left child
    Visit
    Go right

Left child exists
    Find predecessor

    pred.right == null
        Create thread
        Go left

    pred.right == curr
        Remove thread
        Visit
        Go right
  */
