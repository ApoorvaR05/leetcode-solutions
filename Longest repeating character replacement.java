/*You are given a string s and an integer k. You can choose any character of the string and change it to any other uppercase English character. You can perform this operation at most k times.

Return the length of the longest substring containing the same letter you can get after performing the above operations.
Example 1:
Input: s = "ABAB", k = 2
Output: 4
Explanation: Replace the two 'A's with two 'B's or vice versa.
time: O(n), space: O(1) */

class Solution {
    public int characterReplacement(String s, int k) {
        int maxLength = 0;
        int left = 0;
        int[] count = new int[26];
        int maxFreq = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            count[ch - 'A']++;
            maxFreq = Math.max(maxFreq, count[ch - 'A']);

            while ((right - left + 1) - maxFreq > k) {
                count[s.charAt(left) - 'A']--;
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
