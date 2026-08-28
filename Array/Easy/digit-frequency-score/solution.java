class Solution {
    public int digitFrequencyScore(int n) {
        
        int arr[] = new int[10];

        while (n != 0) {
            int temp = n % 10;
            arr[temp]++;
            n = n / 10;
        }

        int l = 0;
        int r = arr.length - 1;

        int sum = 0;

        while (l <= r) {

            if (l == r) {
                if (arr[l] > 0) {
                    sum += arr[l] * l;
                }
            } else {
                if (arr[l] > 0) {
                    sum += arr[l] * l;
                }

                if (arr[r] > 0) {
                    sum += arr[r] * r;
                }
            }

            l++;
            r--;
        }

        return sum;
    }
}