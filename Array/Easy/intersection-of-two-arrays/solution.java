class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        HashSet<Integer> values = new HashSet<>();
        HashSet<Integer> inSection = new HashSet<>();

        int n1 = nums1.length;
	    int n2 = nums2.length;
		
		
		for(int i=0; i<n1; i++){
		    values.add(nums1[i]);
		}

		for(int i=0; i<n2; i++){
		   if(values.contains(nums2[i]) ){
                inSection.add(nums2[i]);
		   }
		}
		    
		int[] arr = new int[inSection.size()];
		int index = 0;
		
        for(int num : inSection){
            arr[index] = num;
            index++;
        }
        return arr;
    }
}