class Solution {
    public int[][] transpose(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        if (rows == cols) {
            for (int row = 1; row < rows; row++) {
                for (int col = 0; col < row; col++) {
                    int temp = matrix[row][col];
                    matrix[row][col] = matrix[col][row];
                    matrix[col][row] = temp;
                }
            }
            return matrix;

        } 
        
            int[][] ans = new int[cols][rows];

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    ans[j][i] = matrix[i][j];
                }
            }
        
        return ans;
    }
}