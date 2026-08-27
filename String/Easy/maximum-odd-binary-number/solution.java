class Solution {
    public String maximumOddBinaryNumber(String s) {
        
        char arr[] = s.toCharArray();

        Arrays.sort(arr);

        int l = 0;
        int r = arr.length - 2;

        while(l<r){
            if(arr[l] < arr[r]){
                char temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
            }

            l++;
            r--;
        }
        return new String(arr);
    }
}