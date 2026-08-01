class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {

        HashSet<Integer> hs = new HashSet<>();
        int result[] = new int[2];

        int rows = grid.length;
        int cols = grid[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (!hs.add(grid[i][j])) {
                    result[0] = grid[i][j];
                }
            }
        }

        int sum1 = 0;

        for (int i = 1; i <= rows * cols; i++) {
            sum1 += i;
        }

        int sum2 = 0;

        for (int element : hs) {
            sum2 += element;
        }

        result[1] = sum1 - sum2;

        return result;
    }
}