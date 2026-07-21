class Solution {
    public void setZeroes(int[][] arr) {

        ArrayList<Integer> roww = new ArrayList<>();
        ArrayList<Integer> coll = new ArrayList<>();

        int rowp = 0;
        int colp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    roww.add(i);
                    coll.add(j);
                }
            }
        }

        int r = 0;
        int c = 0;

        int rr[] = new int[roww.size()];
        int cc[] = new int[coll.size()];

        for (int i = 0; i < roww.size(); i++) {
            rr[i] = roww.get(i);
        }
        for (int i = 0; i < roww.size(); i++) {
            cc[i] = coll.get(i);
        }

        for (int k = 0; k < roww.size(); k++) {

            int row = roww.get(k);
            int col = coll.get(k);

            for (int j = 0; j < arr[row].length; j++) {
                arr[row][j] = 0;
            }

            for (int i = 0; i < arr.length; i++) {
                arr[i][col] = 0;
            }
        }
    }
}