class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        

        int[] ans = new int[friends.length];
        int index = 0;

        for (int i : order) {
            for (int j : friends) {
                if (i == j) {
                    ans[index++] = i;
                    break;
                }
            }
        }

        return ans;
    }
}