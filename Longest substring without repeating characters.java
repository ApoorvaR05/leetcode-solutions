// Given a string s, find the length of the longest substring without duplicate characters.
// Time: O(n)
// Space: O(min(n, charset))

import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int maxCount = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            while (set.contains(ch)) {
                set.remove(s.charAt(left));
                left++;
                
            }
            set.add(ch);
            maxCount = Math.max(maxCount, right - left + 1);
        }
        return maxCount;
    }
}
