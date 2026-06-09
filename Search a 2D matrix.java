/* You are given an m x n integer matrix matrix with the following two properties:

Each row is sorted in non-decreasing order.
The first integer of each row is greater than the last integer of the previous row.
Given an integer target, return true if target is in matrix or false otherwise.

You must write a solution in O(log(m * n)) time complexity.
Time: O(log(m*n))
Space: O(1) */

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int low = 0;
        int high = rows * cols - 1;
        
        while (low <= high) {
            int mid = low + (high - low)/2;

            int row = mid/cols;
            int col = mid % cols;

            int value = matrix[row][col];
            if (value == target) {
                return true;
            }
            else if (value < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return false;
    }
}
/* Each row is sorted.
First element of a row > last element of previous row.

The entire matrix behaves like a single sorted array.
  Use binary search */
