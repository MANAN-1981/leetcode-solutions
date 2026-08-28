class Solution {
    public int longestOnes(int[] nums, int k) {
        
        int n = nums.length;
	    
	    int l = 0;
	    
	    int maxWindow = 0;
	    int count = 0;
	    
	    
	    for(int i=0; i<n; i++){
	        int cWindow = 0;
	        
	        if(nums[i] == 0){
	            count++;
	        }
	        
	       while(count>k){
	           if(nums[l] == 0){
	               count--;
	           }
	           l++;
	       }
	       
	       cWindow = i-l+1;
	       
	       if(cWindow>maxWindow){
	           maxWindow = cWindow;
	       }
	    }

        return maxWindow;
    }
}