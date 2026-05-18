// Given a string s in Roman number format, your task is to convert it to an integer. Various symbols and their values are given below.
// Note: I = 1, V = 5, X = 10, L = 50, C = 100, D = 500, M = 1000
// time: O(n), space: O(1)

class Solution {
    public int romanToDecimal(String s) {
        // code here
        int sum = 0;
     
        HashMap<Character, Integer> map = new HashMap<>();
        
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        
        
        for (int i = 0; i < s.length(); i++) {
            int current = map.get(s.charAt(i));
            
            if (i < s.length() - 1) {
                int next = map.get(s.charAt(i + 1));
                
                if (current < next) {
                    sum -= current;
                }
                else {
                    sum += current;
                }
            }
            else {
                sum += current;
            }
        }
        return sum;
    }
}

// Store the integer values of all Roman symbols in a map.
// Initialize the result as 0.
// Traverse the string from left to right.
// For each character, get its numeric value.
// Compare the current symbol value with the next symbol value (if next exists).

// If the current value is smaller than the next value:

// subtract the current value from the result
// because Roman numerals like:
// IV = 5 - 1
// IX = 10 - 1
// Otherwise:
// add the current value to the result.
// Continue until the end of the string.
// Return the final result.
