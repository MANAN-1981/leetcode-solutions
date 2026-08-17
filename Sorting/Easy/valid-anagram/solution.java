class Solution {
    public boolean isAnagram(String a, String b) {

        if(a.length() != b.length()){
            return false;
        }
        
        char arr[] = a.toCharArray();
        char brr[] = b.toCharArray();


        Arrays.sort(arr);
        Arrays.sort(brr);


        int l = 0;
        int r = arr.length - 1;

        while (l <= r) {
            if (arr[l] == brr[l] && arr[r] == brr[r]) {
                l++;
                r--;
            } else {
               return false;
            }
        }
    return true;
    }
}