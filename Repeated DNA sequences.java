/*The DNA sequence is composed of a series of nucleotides abbreviated as 'A', 'C', 'G', and 'T'.

For example, "ACGAATTCCG" is a DNA sequence.
When studying DNA, it is useful to identify repeated sequences within the DNA.

Given a string s that represents a DNA sequence, return all the 10-letter-long sequences (substrings) that occur more than once in a DNA molecule. You may return the answer in any order.
space & time: O(n) */

import java.util.*;
class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            if (right - left + 1 > 10) {
                left++;
            }
            if (right - left + 1 == 10) {
                String str = s.substring(left, right + 1);
                map.put(str, map.getOrDefault(str,0) + 1);

                if (map.get(str) == 2) {
                    list.add(str);
                }               
            }
        }
        return list;
    }
}

