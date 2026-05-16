// Bingu was testing all the strings he had at his place and found that most of them were prone to a vicious attack by Banju, his arch-enemy. Bingu decided to encrypt all the strings he had, by the following method. Every substring of identical letters is replaced by a single instance of that letter followed by the number of occurrences of that letter. Then, the string thus obtained is further encrypted by reversing it.
// Time & Space: O(n)

// User function Template for Java
class Solution {
    String encryptString(String s) {
        // code here
        int count = 1;
        StringBuilder sb = new StringBuilder();
        int i = 1;
        
        for (i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i-1)) {
                count++;
            }
            else {
                sb.append(s.charAt(i-1));
                sb.append(count);
                count = 1;
                
            }
        }
        sb.append(s.charAt(i-1));
        sb.append(count);
        
        return sb.reverse().toString();
    }
}

// count characters and add to sb, then reverse to obtain final string
// since final character will not be appended in the loop, it needs to be dealt separately
