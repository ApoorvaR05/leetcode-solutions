/*Given the head of a linked list, remove the nth node from the end of the list and return its head.
  Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]
time: O(n), space: O(1)
*/
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode slow = temp;
        ListNode fast = temp;

        int i = 0;
        while (fast != null && i <= n) {
            fast = fast.next;
            i++;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        
        slow.next = slow.next.next;
        
        return temp.next;
    }
}
/* start from a dummy node. Start 2 pointers from beiginning, move one pointer such that between both pointers there is n node difference between them */
