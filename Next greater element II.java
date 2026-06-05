/*
Given a circular integer array nums (i.e., the next element of nums[nums.length - 1] is nums[0]), return the next greater number for every element in nums.

The next greater number of a number x is the first greater number to its traversing-order next in the array, which means you could search circularly to find its next greater number. If it doesn't exist, return -1 for this number.

  time & space: O(n)
  */
 
Example 1:

Input: nums = [1,2,1]
Output: [2,-1,2]
Explanation: The first 1's next greater number is 2; 
The number 2 can't find next greater number. 
The second 1's next greater number needs to search circularly, which is also 2.

import java.util.*;
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < 2 * n; i++) {
            int idx = i % n;

            while (!st.isEmpty() && nums[idx] > nums[st.peek()]) {
                ans[st.pop()] = nums[idx];
            }

            if (i < n) {
                st.push(idx);
            }
        }
        return ans;
    }
}
/*
Logic for Next Greater Element II (Circular Array)
Create an answer array and initialize all values to -1.
If no greater element is found, -1 remains the answer.
Use a monotonic decreasing stack to store the indices of elements whose next greater element has not been found yet.
The stack will contain elements in decreasing order of their values.
Traverse the array twice (from 0 to 2*n - 1).
This simulates the circular nature of the array.
Use i % n to get the actual index in the array.
For each current element:
Compare it with the element at the index on the top of the stack.
While the current element is greater:
The current element is the next greater element for the index at the top of the stack.
Update the answer for that index.
Remove that index from the stack.
During the first traversal only:
Push the current index into the stack.
This ensures each index is added exactly once.
During the second traversal:
Do not push indices again.
Only use the elements to resolve pending indices already in the stack.
After completing both traversals:
Any indices still remaining in the stack do not have a greater element.
Their answers remain -1.
  */
