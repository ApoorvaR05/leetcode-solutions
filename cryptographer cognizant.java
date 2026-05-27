// The Cryptographer’s Message
// Problem Statement

// A cryptographer has developed a special encoding technique for secret messages using lowercase English letters.

// Given an encoded string S, your task is to generate and return its decoded form according to the encryption rules used by the cryptographer.

// The decoded string must preserve the same length as the original message.

// Input Specification
// input1: A string S consisting of lowercase English alphabets.
// Output Specification

// Return a string representing the decoded message.

// Constraints
// 1 <= |S| <= 10^5
// S contains only lowercase English letters.
// Example 1
// Input
// bcd
// Output
// abc
// Example 2
// Input
// uvwxyza
// Output
// tuvwxyz


StringBuilder sb = new StringBuilder();
	   for (int i = 0; i < s.length(); i++) {
	       if (s.charAt(i) == 'a') {
	           sb.append('z');
	       }
	       else {
	           char ch = (char)(s.charAt(i) - 1);
	           sb.append(ch);
	       }
	   }
