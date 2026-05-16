// A string s containing both uppercase and lowercase characters, where words are separated by spaces. Find the word with minimum length and maximum length.If there are multiple words with the same minimum length, select the first occurring word, and in case of same maximum length, select the last occurring such word.

import java.util.*;

class Solution {
    public ArrayList<String> smallerAndLarge(String s) {
        // code here
        ArrayList<String> str = new ArrayList<String>();
      
        String[] words = s.split("\\s+"); // (\\s) whitespace + indicates, 1 or more spaces
          
        int maxCount = words[0].length();
        int minCount = words[0].length();
        
        str.add(words[0]);
        str.add(words[0]);
        
        for (int i = 1; i < words.length; i++) {
            if (minCount > words[i].length()) {
                str.set(0, words[i]);
                minCount = words[i].length();
            }
            if (maxCount <= words[i].length()) {
                str.set(1, words[i]);
                maxCount = words[i].length();
            }
        }
        return str;
    }
}
// The string is first divided into individual words using spaces as separators. Multiple consecutive spaces are treated as a single separator to avoid empty words.

// The first word is initially considered both the minimum-length word and maximum-length word.

// Then each remaining word is traversed one by one.
// For every word:

// If its length is smaller than the current minimum length, the minimum word and minimum length are updated.
// If its length is greater than or equal to the current maximum length, the maximum word and maximum length are updated.

// The minimum condition uses strictly smaller comparison so that if multiple words have the same minimum length, the first occurring word remains unchanged.

// The maximum condition uses greater than or equal comparison so that if multiple words have the same maximum length, the last occurring word replaces the previous one.
