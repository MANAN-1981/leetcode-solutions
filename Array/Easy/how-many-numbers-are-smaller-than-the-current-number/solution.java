class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {

    int n = nums.length;
    
    int[] counters = new int[n];
        
    int index = 0;
        
    for(int i=0; i<n; i++){	       
	       int count = 0;           
                for(int j=0; j<n; j++){
                    if(nums[i] > nums[j]){
                            count++;
                        }
                    }
            counters[i] = count;
        }   
        return counters;
    }
}