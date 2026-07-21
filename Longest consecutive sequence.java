/*Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.
Example 1:
Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
time: O(n), space: O(n) */

class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int maxLen = 0;
        for (int n:nums) {
            set.add(n);
        }

        for (int n:set) {
            if (!set.contains(n - 1)) {
                int curr = n;
                int len = 1;

                while (set.contains(curr+1)) {
                    curr++;
                    len++;
                }
                maxLen = Math.max(maxLen, len);
            }
            
        }
        return maxLen;
    }
}
