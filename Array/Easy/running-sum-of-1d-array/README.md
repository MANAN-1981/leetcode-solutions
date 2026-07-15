# Running Sum of 1d Array

<div align="center">

## 🟢 Easy • 📂 Array • 💻 Java

[Problem Link](https://leetcode.com/problems/running-sum-of-1d-array/submissions/2068283628/)

</div>

---

# 🧠 Approach

The approach used in the code is to iterate through the input array and update each element to be the sum of all previous elements and itself. This is achieved by adding the previous element's value to the current element in each iteration. The result is an array where each element represents the running sum of the input array up to that point.

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
    public int[] runningSum(int[] nums) {
        
        for(int i=1; i<nums.length; i++){
            nums[i] += nums[i-1];
        }
        return nums;
    }
}
```
