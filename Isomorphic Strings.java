// Given two strings s1 and s2 consisting of only lowercase English letters and of equal length, check if these two strings are isomorphic to each other.
// If the characters in s1 can be changed to get s2, then two strings, s1 and s2 are isomorphic. A character must be completely swapped out for another character while maintaining the order of the characters. A character may map to itself, but no two characters may map to the same character.

// Time Complexity	O(n)
// Space Complexity	O(n)
  
import java.util.*;

class Solution {
    public boolean areIsomorphic(String s1, String s2) {
        
        if (s1.length() != s2.length()) {
            return false;
        }
        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {

            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);

            if (map1.containsKey(ch1)) {

                if (map1.get(ch1) != ch2) {
                    return false;
                }
            } else {

                if (map2.containsKey(ch2)) {
                    return false;
                }

                map1.put(ch1, ch2);
                map2.put(ch2, ch1);
            }
        }

        return true;
    }
}
/*
1. Check whether both strings have the same length.
2. Create one mapping to store character relationships from the first string to the second string.
3. Create another mapping to store character relationships from the second string to the first string.
4. Traverse both strings character by character simultaneously.
5. If the current character of the first string is already mapped, verify that it maps to the current character of the second string.
6. If the mapping does not match, conclude that the strings are not isomorphic.
7. Similarly, check whether the current character of the second string is already mapped to a different character of the first string.
8. If such a conflicting mapping exists, conclude that the strings are not isomorphic.
9. Otherwise, store the new mappings in both directions.
10. If the traversal completes without conflicts, conclude that the strings are isomorphic.
*/
