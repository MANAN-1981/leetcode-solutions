class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int n = candies.length;

        int max = candies[0];

        for (int i = 1; i < n; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }

        ArrayList<Boolean> al = new ArrayList<>(candies.length);

        for (int i = 0; i < n; i++) {
            if (candies[i] + extraCandies >= max) {
                al.add(true);
            } else {
                al.add(false);
            }
        }
        return al;
    }
}