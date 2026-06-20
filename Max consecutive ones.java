/*Given a binary array nums, return the maximum number of consecutive 1's in the array.
Time : O(n)
Space: O(1) */
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;

        for (int num : nums) {
            if (num == 1)
                count++;
            else
                count = 0;

            max = Math.max(max, count);
        }

        return max;
    }
}
