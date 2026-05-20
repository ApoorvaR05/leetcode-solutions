// Iterative approach
// Time: O(n)
// Space: O(1)

/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node reverseList(Node head) {
        // code here
        Node prev = null;
        Node curr = head;
        
        while (curr != null) {
            
            Node next = curr.next;
            curr.next = prev;
            
            prev = curr;
            curr = next;
        }
        return prev;
    }
}


/*
class Solution {

    Node reverseList(Node head) {

        if (head == null || head.next == null) {
            return head;
        }

        Node newHead = reverseList(head.next);

        head.next.next = head;

        head.next = null;

        return newHead;
    }
}
*/
