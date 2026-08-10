# Build Array from Permutation

<div align="center">

## 🟢 Easy • 📂 Array • 💻 Java

[Problem Link](https://leetcode.com/problems/build-array-from-permutation/?utm_source=chatgpt.com)

</div>

---

# 🧠 Approach

This solution uses a simple iteration approach to build the target array from the given permutation. It iterates over the input array and uses each element as an index to access the corresponding element in the same array, effectively creating the desired permutation. The result is stored in a new array and returned.

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
    public int[] buildArray(int[] nums) {

        int n = nums.length;

        int target[] = new int[n];

        for (int i = 0; i < n; i++) {
            target[i] = nums[nums[i]];
        }

        return target;
    }
}
```
