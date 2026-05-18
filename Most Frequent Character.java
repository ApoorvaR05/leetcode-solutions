// Given a string s of lowercase alphabets. The task is to find the maximum occurring character in the string s. If more than one character occurs the maximum number of times then print the lexicographically smaller character.
// Time: O(n)
// Space: O(1)
  
class Solution {
    public char getMaxOccuringChar(String s) {
        // code here
        char maxChar = s.charAt(0);
        int[] freq = new int[26];
        int count = 1;
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch - 'a']++;
            
            if (freq[ch - 'a'] > count) {
                count = freq[ch - 'a'];
                maxChar = ch;
            }
            else if (freq[ch - 'a'] == count) {
                if (ch < maxChar) {
                    maxChar = ch;
                }
            }
        }
        return maxChar;
    }
}

// 1. Create a frequency array to store the count of each lowercase alphabet.
// 2. Initialize a variable to store the maximum occurring character.
// 3. Initialize another variable to store the highest frequency found so far.
// 4. Traverse the string character by character.
// 5. For each character, increase its frequency in the frequency array.
// 6. Compare the updated frequency with the current maximum frequency.
// 7. If the current character frequency becomes greater than the maximum frequency, update:

//    * the maximum frequency
//    * the maximum occurring character
// 8. If the current character frequency becomes equal to the maximum frequency, compare both characters lexicographically.
// 9. Store the lexicographically smaller character as the answer.
// 10. After completing the traversal, return the stored maximum occurring character.

// This is better than sorting, adding each characters count -> Time: O(nlogn)
