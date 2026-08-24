class Solution {
    public void nextPermutation(int[] nums) {

        int p = -1;
        int n = nums.length - 1;

        for (int i = n; i >= 1; i--) {
            if (nums[i - 1] < nums[i]) {
                p = i - 1;
                break;
            }
        }

        if (p != -1) {
            for (int j = n; j > p; j--) {
                if (nums[j] > nums[p]) {

                    int temp = nums[p];
                    nums[p] = nums[j];
                    nums[j] = temp;

                    break;
                }
            }
        }

        int l = p + 1;
        int r = n;

        while (l < r) {
            int temp2 = nums[l];
            nums[l] = nums[r];
            nums[r] = temp2;

            l++;
            r--;
        }

    }
}