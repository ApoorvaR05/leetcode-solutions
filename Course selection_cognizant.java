/*Course Availability Search Problem
Problem Statement

A training institute maintains a list of available courses. You are given the names of all available courses and a course name to search for.

Your task is to determine whether the given course is available in the institute’s course list.

If the number of courses entered is outside the valid range, print:

Invalid Range

Otherwise:

print that the course is available if found
print that the course is not available if not found
Input Specification
input1: An integer N representing the number of courses.
input2: An array of N strings representing course names.
input3: A string key representing the course to search.
Output Specification
If N is invalid:
Invalid Range
If course is found:
<course_name> course is Available
If course is not found:
<course_name> course is not Available
Constraints
1 <= N <= 20
Course names are case-sensitive.

time & space: O(n)
*/

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of courses: ");
		int n = sc.nextInt();
		
		sc.nextLine(); // after reading n, if s[i] is read it will be in the same line of n, to make it to next line used nextLine()
		String[] s = new String[n];
		
		System.out.println("Enter courses: ");
		for (int i = 0; i < n; i++) {
		    s[i] = sc.nextLine();
		}
		
		if (n < 1 || n > 20) {
		    System.out.println("Invalid Range");
		    return;
		}
		
		System.out.println("Enter course to search: ");
		String key = sc.nextLine();
		
		for (int i = 0; i < n; i++) {
		    if (key.equals(s[i])) {
		        System.out.println(key + " course is Available");
		        return;
		    }
		}
		System.out.println(key + " course is not Available");
		return;
	}
}
