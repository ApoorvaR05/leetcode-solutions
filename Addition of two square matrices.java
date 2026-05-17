// Time: O(n+m)
// Space: O(1)

class Solution {
    public void Addition(int[][] matrixA, int[][] matrixB) {
        // code here
        for (int i = 0; i < matrixA.length; i++) {  // no of rows
            for (int j = 0; j < matrixA[0].length; j++) {  // no of columns
                matrixA[i][j] += matrixB[i][j];
            }
        }
    }
}
