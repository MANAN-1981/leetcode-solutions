class Solution {
    public List<List<Integer>> threeSum(int[] arr) {

        int n = arr.length;
        Arrays.sort(arr);

        List<List<Integer>> li = new ArrayList<>();

        for (int i = 0; i < n - 2; i++) {

            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            int l = i + 1;
            int r = n - 1;

            while (l < r) {
                List<Integer> li1 = new ArrayList<>();

                int sum = arr[i] + arr[l] + arr[r];

                if (sum == 0) {
                    li1.add(arr[i]);
                    li1.add(arr[l]);
                    li1.add(arr[r]);

                    l++;
                    r--;
                    while (l < r && arr[l] == arr[l - 1]) {
                        l++;
                    }
                    while (l < r && arr[r] == arr[r + 1]) {
                        r--;
                    }
                } else if (sum < 0) {
                    l++;
                } else {
                    r--;
                }
                if (li1.size() != 0) {
                    li.add(li1);
                }
            }

        }
        return li;
    }
}