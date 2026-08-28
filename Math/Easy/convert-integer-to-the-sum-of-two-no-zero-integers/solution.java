class Solution {
    public int[] getNoZeroIntegers(int n) {
        int[] arr = new int[n];

        enter(n, arr);
        
        for(int i=0; i<arr.length; i++){
            if(String.valueOf(arr[i]).contains("0") == false){
                for(int j=0; j<arr.length; j++){
                    if(String.valueOf(arr[j]).contains("0") == false){
                        if(arr[i] + arr[j] == n){
                            return new int[] {arr[i] , arr[j]};
                        }
                    }
                }
            }
        }
        System.gc();
        return new int[0];
    }

public static void enter(int n, int[] arr) {
        if (n == 0) {
            return;
        }

        arr[n - 1] = n;

        enter(n - 1, arr);
    }
}
