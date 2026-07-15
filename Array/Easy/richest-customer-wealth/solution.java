class Solution {
    public int maximumWealth(int[][] arr) {

        int rows = arr.length;

        int mx = 0;

        for (int row = 0; row < rows; row++) {
            int cols = arr[row].length;
            int sum = 0;
            for (int col = 0; col < cols; col++) {
                sum += arr[row][col];
            }
            mx = Math.max(mx, sum);
        }
        return mx;
    }
}