class Solution {
    public boolean checkIfExist(int[] nums) {

        boolean result = false;

        if (nums.length == 1) {
            result = false;
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {

                if (i != j) {
                    int mul = nums[j] * 2;

                    if (nums[i] == mul) {
                        result = true;
                    }
                }
            }
        }

        return result;

    }
}