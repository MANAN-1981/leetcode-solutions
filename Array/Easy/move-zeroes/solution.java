class Solution {
    public void moveZeroes(int[] nums) {
        
    for (int i=0; i<nums.length; i++){
        for(int j=i+1; j<nums.length; j++){
            if(nums[i] == 0){
                if(nums[j] != 0 || nums[j] == 0){
                    int temp = nums[i];
                    int fr = nums[i]=nums[j];
                    int se = nums[j]=temp;
                }
            }
        }
    }
  }
}