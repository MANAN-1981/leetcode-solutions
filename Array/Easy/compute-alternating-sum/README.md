# Compute Alternating Sum

<div align="center">

## 🟢 Easy • 📂 Array • 💻 Java

[Problem Link](https://leetcode.com/problems/compute-alternating-sum/)

</div>

---

# 🧠 Approach

The approach used in the code is to initialize two pointers, one at the start and one at the end of the array, and then move them towards each other, adding or subtracting elements at even or odd indices respectively. This process continues until the two pointers meet, resulting in the computation of the alternating sum. The code handles the case where the array has only one element by returning that element directly.

---

# 📊 Complexity Analysis

| Operation | Complexity |
|-----------|------------|
| Time | **O(n)** |
| Space | **O(1)** |

---

# 💻 Source Code

```java
class Solution {
    public int alternatingSum(int[] nums) {

        int n = nums.length;

        int l = 0;
        int r = n - 1;

        int sum = 0;

        if (n == 1) {
            return nums[0];
        }
        while (l <= r) {
            if (l % 2 == 0) {
                sum += nums[l];
            } else if (l % 2 != 0) {
                sum -= nums[l];
            }

            if (l != r) {
                if (r % 2 == 0) {
                    sum += nums[r];
                } else {
                    sum -= nums[r];
                }
            }

            l++;
            r--;
        }
        return sum;
    }
}
```
