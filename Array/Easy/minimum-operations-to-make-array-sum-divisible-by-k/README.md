# Minimum Operations to Make Array Sum Divisible by K

<div align="center">

## 🟢 Easy • 📂 Array • 💻 Java

[Problem Link](https://leetcode.com/problems/minimum-operations-to-make-array-sum-divisible-by-k/)

</div>

---

# 🧠 Approach

Solution submitted via LeetCode.

---

# 📊 Complexity Analysis

| Operation | Complexity |
|-----------|------------|
| Time | **N/A** |
| Space | **N/A** |

---

# 💻 Source Code

```java
class Solution {
    public int minOperations(int[] arr, int k) {

        int l = 0;
        int r = arr.length - 1;

        int sum = 0;

        while (l <= r) {

            if (l == r) {
                sum += arr[l];
            } else {
                sum += arr[l] + arr[r];
            }
            l++;
            r--;
        }

        int counter = 0;

        while (sum % k != 0) {
            sum--;
            counter++;
        }

        return counter;
    }
}
```
