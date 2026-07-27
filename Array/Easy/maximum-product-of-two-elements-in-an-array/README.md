# Maximum Product of Two Elements in an Array

<div align="center">

## 🟢 Easy • 📂 Array • 💻 Java

[Problem Link](https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/submissions/2082699132/?envType=daily-question&envId=2026-07-27)

</div>

---

# 🧠 Approach

This solution iterates through the array to find the two largest numbers, then returns the product of these two numbers minus one. It keeps track of the largest and second largest numbers seen so far. The approach has a linear time complexity due to the single pass through the array.

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
    public int maxProduct(int[] nums) {
        
        int large = 0;
        int seLarge = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] > large){
                seLarge = large;
                large = nums[i];
            }else if(nums[i]>seLarge){
                seLarge = nums[i];
            }
        }
        return (large-1) * (seLarge - 1);
    }
}
```
