class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int st = 0;
        int lt = (rows * cols) - 1;

        while (st <= lt) {
            int mid = st + (lt - st) / 2;

            if (matrix[mid / cols][mid % cols] == target) {
                return true;
            } else if (matrix[mid / cols][mid % cols] > target) {
                lt = mid - 1;
            } else if (matrix[mid / cols][mid % cols] < target) {
                st = mid + 1;
            }
        }
        return false;
    }
}