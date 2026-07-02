/*A network appliance receives packets every millisecond.
Each packet has:

an arrival timestamp time[i]
a priority priority[i]

Packets remain active until a packet with strictly higher priority arrives. Once a higher-priority packet arrives, all lower-priority packets that are still active immediately expire.

For every packet, determine how long (in milliseconds) it remained active.

If no higher-priority packet ever arrives, output -1 for that packet.

Example
time =      [1, 4, 7, 9, 15]
priority =  [5, 2, 8, 6, 9]
o/p: 6,3,8,6,-1
time & space: O(n) 
similar concept of next greater element, monotonic stack*/

import java.util.*;

public class Main {
    public static void main(String[] args) {

        int[] price = {5, 2, 8, 6, 9};
        int[] time = {1, 4, 7, 9, 15};

        int[] ans = new int[price.length];
        Arrays.fill(ans, -1);

        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < price.length; i++) {

            while (!stack.isEmpty() &&
                   price[stack.peek()] < price[i]) {

                int idx = stack.pop();
                ans[idx] = time[i] - time[idx];
            }

            stack.push(i);
        }

        System.out.println(Arrays.toString(ans));
    }
}
