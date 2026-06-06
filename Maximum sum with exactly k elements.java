/*
You are given a 0-indexed integer array nums and an integer k. Your task is to perform the following operation exactly k times in order to maximize your score:
Select an element m from nums.
Remove the selected element m from the array.
Add a new element with a value of m + 1 to the array.
Increase your score by m.
Return the maximum score you can achieve after performing the operation exactly k times.

Example 1:
Input: nums = [1,2,3,4,5], k = 3
Output: 18
*/

class Solution {
    public int maximizeSum(int[] nums, int k) {

        int max = Integer.MIN_VALUE;

        for (int num : nums) {
            max = Math.max(max, num);
        }

        return k * (2 * max + k - 1) / 2;
    }
}
/* find the max element and the add k consectutive numbers  starting from the largest */
