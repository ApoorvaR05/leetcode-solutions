// TC & SC: O(n)

class Solution {
    String removeVowels(String s) {
        // code here
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                continue;
            }
            sb.append(s.charAt(i));
        }
        
        return sb.toString();
    }
}

// add to new string only if the character is not a vowel
