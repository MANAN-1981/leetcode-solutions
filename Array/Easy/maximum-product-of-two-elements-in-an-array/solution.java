class Solution {
    public int maxProduct(int[] nums) {
        
        int large = 0;
        int seLarge = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] > large){
                seLarge = large;
                large = nums[i];
            }else if(nums[i]>seLarge){
                seLarge = nums[i];
            }
        }
        return (large-1) * (seLarge - 1);
    }
}