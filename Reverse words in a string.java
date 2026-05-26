// Given an input string s, reverse the order of the words.

// A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

// Return a string of the words in reverse order concatenated by a single space.

// Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.

 

// Example 1:

// Input: s = "the sky is blue"
// Output: "blue is sky the"
// time & space: O(n)

class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();

        for(int i = words.length - 1; i >= 1; i--) {
            sb.append(words[i]);
            sb.append(" ");
        }
        sb.append(words[0]);

        return sb.toString();
    }
}

/*
two pointer approach - space O(1)
  class Solution {
    public String reverseWords(String s) {

        StringBuilder sb = new StringBuilder();

        int i = s.length() - 1;

        while(i >= 0) {

            // Skip spaces
            while(i >= 0 && s.charAt(i) == ' ') {
                i--;
            }

            if(i < 0) break;

            int j = i;

            // Find start of word
            while(i >= 0 && s.charAt(i) != ' ') {
                i--;
            }

            // Append word
            sb.append(s.substring(i + 1, j + 1));

            // Add space only if more words exist
            sb.append(" ");
        }

        // Remove trailing space
        return sb.toString().trim();
    }
}
*/
