class Solution {
    public int maxVowels(String s, int k) {
        
       char[] arr = s.toCharArray();
	    
	    HashSet<Character> vowels = new HashSet<>();
	    
	    vowels.add('a');
	    vowels.add('e');
	    vowels.add('i');
	    vowels.add('o');
	    vowels.add('u');
	    
	    int runningWindow = 0;
	    int maxWindow = 0;
	    
	    for(int i=0; i<k; i++){
	        if(vowels.contains(arr[i])){
	            runningWindow++;
	        }
	    }
	    if(maxWindow < runningWindow){
	        maxWindow = runningWindow;
	    }
	    
        for(int j=k; j<arr.length; j++){
            if(vowels.contains(arr[j - k])){
                runningWindow--;
            }
            if(vowels.contains(arr[j])){
                runningWindow++;
            }
            
            if(maxWindow<runningWindow){
                maxWindow = runningWindow;
            }
        }
        return maxWindow;
    }
}