class Solution {
    public boolean isPalindrome(String se) {
        
        String s = se.replaceAll("[^a-zA-Z0-9]" , "").toLowerCase();
        if(s.length() == 0){
            return true;
        }
        char arr[] = s.toCharArray();
        int st = 0;
        int en = arr.length -1;

        while(st <= en){
            if(arr[st] != arr[en]){
                return false;
            }   
            else{                
               st++;
               en--;
            }   
        }
        return true;
    }
}