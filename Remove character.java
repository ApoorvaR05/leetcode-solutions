// Given two strings str1 and str2, remove those characters from the first string(str1) which are present in the second string(str2). Both the strings are different and contain only lowercase characters.
// NOTE: Size of the first string is always greater than the size of the second string( |str1| > |str2|).
  
// Time	O(n + m)
// Space	O(n)
// n = length of str1
// m = length of str2

class Solution {
    static String removeChars(String str1, String str2) {
        
        boolean[] present = new boolean[26];
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < str2.length(); i++) {
            present[str2.charAt(i) - 'a'] = true;
        }
        
        for (int j = 0; j < str1.length(); j++) {
            char ch = str1.charAt(j);
            if (!present[ch - 'a']) {
                sb.append(ch);
            }
            
        }
        return sb.toString();
    }
}

// store in which all characters of 2nd string are present, then add to sb from str1 only if it is not present (present array returns false)
