// Problem Statement

// You are given four integer values representing ASCII codes. Your task is to convert each integer into its corresponding character and display the result.

// Each integer corresponds to a valid ASCII character.

// Input Specification
// input1: An integer representing the first ASCII value.
// input2: An integer representing the second ASCII value.
// input3: An integer representing the third ASCII value.
// input4: An integer representing the fourth ASCII value.
// Output Specification

// Print the ASCII value along with its corresponding character in the following format:

// <number> - <character>

// Each result should be printed on a new line.

// Constraints
// 0 <= inputi <= 127
// All inputs represent valid ASCII characters.

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
  		System.out.print("Enter 4 ASCII numbers: ");
  		
  		int n1 = sc.nextInt();
  		int n2 = sc.nextInt();
  		int n3 = sc.nextInt();
  		int n4 = sc.nextInt();
  
  		System.out.println(ch1 + "->" + (char)(n1));
  		System.out.println(ch2 + "->" + (char)(n2));
      System.out.println(ch3 + "->" + (char)(n3));
      System.out.println(ch4 + "->" + (char)(n4));
	}
}
