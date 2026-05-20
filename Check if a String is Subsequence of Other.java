// Given two strings s1 and s2. You have to check that s1 is a subsequence of s2 or not.
// Note: A subsequence is a sequence that can be derived from another sequence by deleting some elements without changing the order of the remaining elements.

// Examples:

// Input: s1 = "AXY", s2 = "YADXCP"
// Output: false
// Explanation: s1 is not a subsequence of s2 as 'Y' appears before 'A'.
// time: O(n)
// space: O(1)

class Solution {
    public boolean isSubSeq(String s1, String s2) {
        // code here
        if (s1.length() == 0) {
            return true;
        }
        int j = 0;
        
        for (int i = 0; i < s2.length(); i++) {
            
            if (s2.charAt(i) == s1.charAt(j)) {
                j++;
                
                 if (j == s1.length()) {
                        return true;
                }
            }
        }
       
        return false;
    }
};
