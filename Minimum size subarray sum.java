/*Given an array of positive integers nums and a positive integer target, return the minimal length of a subarray whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.
time: O9n), space: O(1) */
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int min = Integer.MAX_VALUE;
        int sum = 0;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum >= target && left <= right) {
                min = Math.min(min, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }
        return min != Integer.MIN_VALUE ? min : 0;
    }
}
