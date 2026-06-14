/*Slow & fast pointer - tortoise & hare
Time: O(n)
Space: O(1)
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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        if (head.next == null) {
            return true;
        }
       
        if (slow.next.next == null) {
            if (slow.val == slow.next.val) {
                return true;
            }
            return false;
        }
       
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast == null) {   // even
            fast = reverse(slow);
        }
        else if (fast != null) {  //odd
            fast = reverse(slow.next);
        }
                
        slow = head;
        while (fast != null) {
            if (slow.val != fast.val) {
                return false;
            }
            slow = slow.next;
            fast = fast.next;
        }
        return true;
    }
    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
/*Find middle using slow/fast.
Reverse second half.
Compare first half and reversed second half.*/
