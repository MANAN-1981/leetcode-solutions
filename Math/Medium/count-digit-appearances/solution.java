class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {

        int count = 0;

        for (int k = 0; k < nums.length; k++) {

            while (nums[k] != 0) {

                int val = nums[k] % 10;

                if (val == digit) {
                    count++;
                }

                nums[k] = nums[k] / 10;
            }
        }

        return count;

    }
}