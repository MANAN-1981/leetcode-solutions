class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left = 0;
		int right = (int)k-1;
		
		int n = nums.length;
		
		double windowAvg = 0;
		double maxAvg = Double.NEGATIVE_INFINITY;
		
		double sum = 0;
		    for(int i=left; i<=right; i++){
		        sum += nums[i];
		    }
		    windowAvg  = sum/k;
		    
		    if(maxAvg<windowAvg){
		        maxAvg = windowAvg;
		    }
		right++;

		while(right<n){
            sum = sum - nums[left] + nums[right];

            windowAvg = sum/k;

		    if(maxAvg<windowAvg){
		        maxAvg = windowAvg;
		    }
            
		    left++;
		    right++;
		}
    return maxAvg;
    }
}