// Given two non-empty strings s1 and s2, consisting only of lowercase English letters, determine whether they are anagrams of each other or not.
// Two strings are considered anagrams if they contain the same characters with exactly the same frequencies, regardless of their order.
// TC: O(n)
// SC:O(1)

class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        if (s1.length() != s2.length()) {
            return false;
        }
        int[] freq = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
            freq[s2.charAt(i) - 'a']--;
        }
        
        for (int count:freq) {
            if (count != 0) {
                return false;
            }
        }
        return true;
        
    }
}

For every character:

// Increase count for characters from first string
// Decrease count for characters from second string
// If they are anagaram, all the characters final count = 0
