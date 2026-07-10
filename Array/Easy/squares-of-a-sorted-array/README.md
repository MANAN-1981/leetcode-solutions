# Squares of a Sorted Array

<div align="center">

## 🟢 Easy • 📂 Array • 💻 Java

[Problem Link](https://leetcode.com/problems/squares-of-a-sorted-array/)

</div>

---

# 🧠 Approach

This solution first squares each number in the input array, then sorts the resulting array in ascending order. The approach is straightforward and relies on the built-in sorting functionality of Java. It achieves the desired result but may not be the most efficient solution for large inputs.

---

# 📊 Complexity Analysis

| Operation | Complexity |
|-----------|------------|
| Time | **O(n log n)** |
| Space | **O(1)** |

---

# 💻 Source Code

```java
class Solution {
    public int[] sortedSquares(int[] nums) {
        
        for(int i=0; i<nums.length; i++){
            int n = (int) Math.pow(nums[i] , 2);
            nums[i] = n;
        }
        Arrays.sort(nums);

        return nums;
    }
}
```
