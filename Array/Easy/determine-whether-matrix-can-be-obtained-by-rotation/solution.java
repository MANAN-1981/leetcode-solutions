class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {

        int result[][] = new int[mat.length][mat[0].length];

        int rotate = 0;
        Boolean same = true;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] != target[i][j]) {
                    same = false;
                }
            }
        }

        if (same) {
            return true;
        }

        while (rotate < 3) {

            for (int k = 0; k < mat.length; k++) {

                int index = 0;

                for (int i = mat.length - 1; i >= 0; i--) {
                    result[k][index] = mat[i][k];
                    index++;
                }
            }

            same = true;

            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[0].length; j++) {
                    if (result[i][j] != target[i][j]) {
                        same = false;
                    }
                }
            }

            if (same) {
                return true;
            } else {
                for (int i = 0; i < mat.length; i++) {
                    for (int j = 0; j < mat[0].length; j++) {
                        mat[i][j] = result[i][j];
                    }
                }
            }

            rotate++;
        }

        return false;
    }
}