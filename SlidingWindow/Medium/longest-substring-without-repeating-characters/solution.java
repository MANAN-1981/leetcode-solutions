class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        HashSet<Character> slide = new HashSet<>();
        
        char str[] = s.toCharArray();
		
		int maxNum = 0;
		int l = 0;
		
		for(int i=0; i<str.length; i++){
		    
		    while(slide.contains(str[i])){
		        slide.remove(str[l]);
		        l++;
		    }
		    
		    slide.add(str[i]);
		
		    if(i-l+1 > maxNum){
		        maxNum = i-l+1;
		    }
		}

        return maxNum;
    }
}