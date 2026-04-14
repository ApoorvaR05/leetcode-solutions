// 136. Single Number
// Space: O(1)
// Time: O(n)

class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;

        for (int num : nums) {
            result ^= num;
        }

        return result;
    }
}

// xor - bit manupilation similar to cancelling same numbers, so at the end the unique number remains
