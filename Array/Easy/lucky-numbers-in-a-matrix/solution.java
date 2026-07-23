class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
         int rows = matrix.length;
        int cols = matrix[0].length;


        ArrayList < Integer > rowMin = new ArrayList < > ();
        ArrayList < Integer > colMax = new ArrayList < > ();
        ArrayList < Integer > result = new ArrayList < > ();


        for (int i = 0; i < rows; i++) {
            int min = matrix[i][0];
            for (int j = 1; j < cols; j++) {
                min = Math.min(min, matrix[i][j]);
            }
            rowMin.add(min);
        }


        for (int j = 0; j < cols; j++) {
            int max = matrix[0][j];
            for (int i = 1; i < rows; i++) {
                max = Math.max(max, matrix[i][j]);
            }
            colMax.add(max);
        }

        for (int num: rowMin) {
            if (colMax.contains(num)) {
                result.add(num);
            }
        }
return result;

    }
}