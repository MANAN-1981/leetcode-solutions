# Product of Array Except Self

<div align="center">

## 🟡 Medium • 📂 Array • 💻 Java

[Problem Link](https://leetcode.com/problems/product-of-array-except-self/)

</div>

---

# 🧠 Approach

The approach used in the code calculates the product of all numbers to the left and right of each index, then multiplies these two products together to get the product of all numbers except the one at the current index. This is achieved by using two separate arrays to store the prefix and suffix products. The final result is stored in the input array.

---

# 📊 Complexity Analysis

| Operation | Complexity |
|-----------|------------|
| Time | **O(n)** |
| Space | **O(n)** |

---

# 💻 Source Code

```java
class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;

        int preffix[] = new int[n];
        int suffix[] = new int[n];

        preffix[0] = 1;
        suffix[n - 1] = 1;

        for (int i = 1; i < n; i++) {

            preffix[i] = preffix[i - 1] * nums[i - 1];

        }

        for (int i = n - 2; i >= 0; i--) {

            suffix[i] = suffix[i + 1] * nums[i + 1];

        }

        for (int i = 0; i < n; i++) {
            nums[i] = preffix[i] * suffix[i];
        }

        return nums;
    }
}
```
