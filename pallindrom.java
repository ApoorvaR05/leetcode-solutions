
// TC: O(n)
// SC: O(1)

import java.util.*;
class Solution {
    boolean isPalindrome(String s) {
        // code here
        int left = 0;
        int right = s.length() - 1;
        
        while (left <= right) {
            if (s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

// another implementation is to run a loop, starting from 0th index to high iteration, check characters at start and end of string, do this till middle of string and if corresponding characters are different, return false, else continue. 
