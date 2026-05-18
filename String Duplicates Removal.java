// Given a string s which may contain lowercase and uppercase characters. The task is to remove all duplicate characters from the string and find the resultant string. The order of remaining characters in the output should be same as in the original string.
// Time & Space: O(n)

import java.util.*;

class Solution {
    String removeDuplicates(String s) {
        
        HashSet<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
    
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (!set.contains(ch)) {
                sb.append(ch);
                set.add(ch);
            }
        }
        return sb.toString();      
    }
}

/*
Traverse the string once.
Check whether character already appeared.
If not:
append to result
mark as visited

This preserves:

original order
unique characters only
  */
