/* There are n people in a line queuing to buy tickets, where the 0th person is at the front of the line and the (n - 1)th person is at the back of the line.
You are given a 0-indexed integer array tickets of length n where the number of tickets that the ith person would like to buy is tickets[i].
Each person takes exactly 1 second to buy a ticket. A person can only buy 1 ticket at a time and has to go back to the end of the line (which happens instantaneously) in order to buy more tickets. If a person does not have any tickets left to buy, the person will leave the line.
Return the time taken for the person initially at position k (0-indexed) to finish buying tickets.
Example 1:
Input: tickets = [2,3,2], k = 2
Output: 6
  */
// time: O(n) space:O(1)
class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int time = 0;

        for (int i = 0; i < tickets.length; i++) {

            if (i <= k) {
                time += Math.min(tickets[i], tickets[k]);
            } else {
                time += Math.min(tickets[i], tickets[k] - 1);
            }
        }

        return time;
    }
}
/* Contribution of person i:
i <= k : min(tickets[i], tickets[k])
i > k  : min(tickets[i], tickets[k]-1) */
/////// my initial solution
import java.util.*;
class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> q = new LinkedList<>();
        int time = 0;
        int n = tickets.length;

        for (int i = 0; i < n; i++) {
            tickets[i]--;
            time++;

            if (i == k && tickets[i] == 0) {
                return time;
            }
            if (tickets[i] != 0) {
                q.offer(i);
            }
        }
        while (!q.isEmpty()) {
            int c = q.poll();
            time++;
            tickets[c]--;
            if (tickets[c] != 0) {
                q.offer(c);
            }
            
            if (c == k && tickets[c] == 0) {
                return time;
            }
        }
        return time;
    }
}
