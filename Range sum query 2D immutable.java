/*Given a 2D matrix matrix, handle multiple queries of the following type:

Calculate the sum of the elements of matrix inside the rectangle defined by its upper left corner (row1, col1) and lower right corner (row2, col2).
Implement the NumMatrix class:

NumMatrix(int[][] matrix) Initializes the object with the integer matrix matrix.
int sumRegion(int row1, int col1, int row2, int col2) Returns the sum of the elements of matrix inside the rectangle defined by its upper left corner (row1, col1) and lower right corner (row2, col2).
You must design an algorithm where sumRegion works on O(1) time complexity.
time: O(1), constructor time: O(rows * cols), space: O(rows * cols)*/

class NumMatrix {
    private int[][] prefix;
    public NumMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        prefix = new int[rows + 1][cols + 1];
        for (int r = 1; r <= rows; r++) {
            for (int c = 1; c <= cols; c++) {
                prefix[r][c] = matrix[r - 1][c - 1] + prefix[r - 1][c] + prefix[r][c - 1] - prefix[r - 1][c - 1];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        return prefix[row2 + 1][col2 + 1] - prefix[row1][col2 + 1] - prefix[row2 + 1][col1] + prefix[row1][col1];
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */
