/*You are given the head of a linked list with n nodes.

For each node in the list, find the value of the next greater node. That is, for each node, find the value of the first node that is next to it and has a strictly larger value than it.

Return an integer array answer where answer[i] is the value of the next greater node of the ith node (1-indexed). If the ith node does not have a next greater node, set answer[i] = 0.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        int size = 0;
        Deque<Integer> stack= new ArrayDeque<>();
        ListNode p = head;
        while (p != null) {
            size++;
            p = p.next;
        }
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = head.val;
            head = head.next;
        }
        int[] ans = new int[size];

        for (int i = 0; i < size; i++) {
            while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
                ans[stack.pop()] = arr[i];
            }
            stack.push(i);
        }
        return ans;
    }
}
