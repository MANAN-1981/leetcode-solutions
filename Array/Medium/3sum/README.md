# 3Sum

<div align="center">

## 🟡 Medium • 📂 Array • 💻 Java

[Problem Link](https://leetcode.com/problems/3sum/)

</div>

---

# 🧠 Approach

The approach used in the code is a two-pointer technique, where the array is first sorted and then for each element, two pointers are used to find a pair of elements that sum up to the negation of the current element. This technique ensures that all possible triplets are considered and duplicates are avoided.

---

# 📊 Complexity Analysis

| Operation | Complexity |
|-----------|------------|
| Time | **O(n^2)** |
| Space | **O(n)** |

---

# 💻 Source Code

```java
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
```
