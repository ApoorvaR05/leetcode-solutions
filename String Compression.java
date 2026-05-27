// Given an array of characters chars, compress it using the following algorithm:

// Begin with an empty string s. For each group of consecutive repeating characters in chars:

// If the group's length is 1, append the character to s.
// Otherwise, append the character followed by the group's length.
// The compressed string s should not be returned separately, but instead, be stored in the input character array chars. Note that group lengths that are 10 or longer will be split into multiple characters in chars.

// After you are done modifying the input array, return the new length of the array.

// You must write an algorithm that uses only constant extra space.

// Note: The characters in the array beyond the returned length do not matter and should be ignored.

// time: O(n)
// space: O(1)

class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int i = 0;
        int idx = 0;

        while (i < n) {
            int count = 0;
            char current = chars[i];

            while (i < n && current == chars[i]) {
                count++;
                i++;
            }
            chars[idx++] = current;

            if (count > 1) {
                String cnt = Integer.toString(count);
                for (char ch:cnt.toCharArray()) {
                    chars[idx++] = ch;
                }
            }
        }
        return idx;
    }
}
