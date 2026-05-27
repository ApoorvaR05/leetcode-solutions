// Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.

// In other words, return true if one of s1's permutations is the substring of s2.

// Example 1:

// Input: s1 = "ab", s2 = "eidbaooo"
// Output: true
// Explanation: s2 contains one permutation of s1 ("ba").
// Example 2:

// Input: s1 = "ab", s2 = "eidboaoo"
// Output: false

// time: O(n)
// space: O(1)


class Solution {
    public boolean same(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

    public boolean checkInclusion(String s1, String s2) {
        int[] freq = new int[26];
        int[] window = new int[26];
        int n1 = s1.length();
        int n2 = s2.length();

        if (n1 > n2) {
            return false;
        }

        for (int i = 0; i < n1; i++) {
            freq[s1.charAt(i) - 'a']++;
            window[s2.charAt(i) - 'a']++;
        }

        if (same(freq, window)) {
            return true;
        }

        for (int i = n1; i < n2; i++) {
            
            window[s2.charAt(i) - 'a']++;
            window[s2.charAt(i - n1) - 'a']--;
            
            if (same(freq, window)) {
                return true;
            }
        }
        return false;
    }
}
