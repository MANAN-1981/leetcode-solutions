class Solution {
    public int smallestIndex(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int sum = 0;

            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }

            if (sum == i) {
                return i;
            }
        }

        return -1;

    }
}