// 2965- You are given a 0-indexed 2D integer matrix grid of size n * n with values in the range [1, n2]. Each integer appears exactly once except a which appears twice and b which is missing. The task is to find the repeating and missing numbers a and b.
// Return a 0-indexed integer array ans of size 2 where ans[0] equals to a and ans[1] equals to b.
// Space: O(1)
// Time: O(n)
  
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int N = n * n;

        long expectedSum = (long) N * (N + 1) / 2;
        long expectedSqSum = (long) N * (N + 1) * (2 * N + 1) / 6;

        long actualSum = 0, actualSqSum = 0;

        for (int[] row : grid) {
            for (int num : row) {
                actualSum += num;
                actualSqSum += (long) num * num;
            }
        }

        long diff = actualSum - expectedSum;          // a - b
        long sqDiff = actualSqSum - expectedSqSum;    // a^2 - b^2

        long sumAB = sqDiff / diff;                  // a + b

        int a = (int) ((diff + sumAB) / 2);          // repeating
        int b = (int) (sumAB - a);                   // missing

        return new int[]{a, b};
    }
}
