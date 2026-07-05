class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int newNums[] = new int[nums.length * 2];
        
        int j=0;       
        
        for(int i=0; i<newNums.length; i++){
            if(j == nums.length){
                j = 0;
                i--;
            }else{
                newNums[i] = nums[j];
                j++;
            }
        }
        return newNums;
    }
}