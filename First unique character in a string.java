/* Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
Example 1:
Input: s = "leetcode"
Output: 0
Explanation: The character 'l' at index 0 is the first character that does not occur at any other index.

Example 2:
Input: s = "loveleetcode"
Output: 2
*/
import java.util.*;
class Solution {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
        }

        for(Map.Entry<Character, Integer> m: map.entrySet()) {
            if (m.getValue() == 1) {

                return s.indexOf(m.getKey());
            }
        }
        
        return -1;
    }
}
