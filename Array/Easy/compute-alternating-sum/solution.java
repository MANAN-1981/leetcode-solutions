class Solution {
    public int alternatingSum(int[] nums) {

        int n = nums.length;

        int l = 0;
        int r = n - 1;

        int sum = 0;

        if (n == 1) {
            return nums[0];
        }
        while (l <= r) {
            if (l % 2 == 0) {
                sum += nums[l];
            } else if (l % 2 != 0) {
                sum -= nums[l];
            }

            if (l != r) {
                if (r % 2 == 0) {
                    sum += nums[r];
                } else {
                    sum -= nums[r];
                }
            }

            l++;
            r--;
        }
        return sum;
    }
}