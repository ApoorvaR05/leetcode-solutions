// Given a string s, remove all characters except lowercase and uppercase alphabets (a-z and A-Z) and return the resulting string.
// If no alphabetic characters remain after removal, return an empty string.
// Time * Space: O(n)

class Solution {
    public String removeChars(String s) {
        // code here
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                sb.append(ch);
            }
        
        }
        return sb.toString();
    }
};
