// Given an integer n, your task is to complete the function convertToRoman which prints the corresponding roman number of n. Various symbols and their values are given below
// Note:- There are a few exceptions for some numbers like 4 in roman is IV,9 in roman is IX, similarly, 40 is XL while 90 is XC. Similarly, 400 is CD while 900 is CM

// I 1
// V 5
// X 10
// L 50
// C 100
// D 500
// M 1000

// Time & Space: O(1)

import java.util.*;

class Solution {
    String convertToRoman(int n) {
        int[] values = {
            1000, 900, 500, 400,
            100, 90, 50, 40,
            10, 9, 5, 4, 1
        };
        
        String[] symbols = {
            "M", "CM", "D", "CD",
            "C", "XC", "L", "XL",
            "X", "IX", "V", "IV", "I"
        };
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < values.length; i++) {
            
            while (n >= values[i]) {
                sb.append(symbols[i]);
                n -= values[i];
            }
        }
        return sb.toString(); 
    }
}

/*
Step 1

Check:

58 >= 1000 ? No
58 >= 900 ? No
...
58 >= 50 ? Yes

Append:

"L"

Subtract:

58 - 50 = 8

Result:

"L"
Step 2

Continue with remaining values.

Check:

8 >= 40 ? No
8 >= 10 ? No
8 >= 9 ? No
8 >= 5 ? Yes

Append:

"V"

Subtract:

8 - 5 = 3

Result:

"LV"
Step 3

Check:

3 >= 4 ? No
3 >= 1 ? Yes

Append:

"I"

Subtract:

3 - 1 = 2

Result:

"LVI"
Step 4

Again:

2 >= 1 ? Yes

Append:

"I"

Subtract:

2 - 1 = 1

Result:

"LVII"
Step 5

Again:

1 >= 1 ? Yes

Append:

"I"

Subtract:

1 - 1 = 0

Result:

"LVIII"
Final Output
LVIII
  */
