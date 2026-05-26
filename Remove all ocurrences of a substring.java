// Given two strings s and part, perform the following operation on s until all occurrences of the substring part are removed:

// Find the leftmost occurrence of the substring part and remove it from s.
// Return s after removing all occurrences of part.

// A substring is a contiguous sequence of characters in a string.
// time:O(n*m)
// space: O(n)

class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder sb = new StringBuilder();
        int m = part.length();

        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));

            if (sb.length() >= m) {
                Boolean match = true;

                for (int j = 0; j < m; j++) {
                    if (sb.charAt(sb.length() - m + j) != part.charAt(j)) {
                        match = false;
                        break;
                    }
                }

                if (match) {
                    sb.delete(sb.length() - m, sb.length());
                }
            }
        }

    return sb.toString();
    }
}

/*
Create an empty StringBuilder.
Traverse each character of the string s.
Append the current character to StringBuilder.

After every append, check if:

sb.length() >= part.length()
Compare the last part.length() characters of sb with part.

If they match, remove those characters using:

sb.delete(sb.length() - part.length(), sb.length());
Continue the process for all characters.
*/
