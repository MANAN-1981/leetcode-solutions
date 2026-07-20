class Solution {
    public void rotate(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int row = 1; row < rows; row++) {
            for (int col = 0; col < row; col++) {
                int temp = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = temp;
            }
        }

        for (int row = 0; row < rows; row++) {
            int left = 0;
            int right = cols - 1;

            while (left < right) {
                int temp = matrix[row][left];
                matrix[row][left] = matrix[row][right];
                matrix[row][right] = temp;

                left++;
                right--;
            }

        }
    }
}