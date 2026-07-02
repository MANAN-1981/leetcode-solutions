# Contains Duplicate Ii

<div align="center">

## 🟢 Easy • 📂 Array • 💻 Java

[Problem Link](https://leetcode.com/problems/contains-duplicate-ii/)

</div>

---

# 🧠 Approach

This problem involves checking for duplicate elements in an array within a certain distance. The approach is to use a brute force method, checking each element against all other elements within the specified distance. The algorithm returns true as soon as it finds a duplicate within the distance, and false otherwise.

---

# 📊 Complexity Analysis

| Operation | Complexity |
|-----------|------------|
| Time | **O(n*k)** |
| Space | **O(1)** |

---

# 💻 Source Code

```java
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<= i+k && j < nums.length; j++){
                if(nums[i] == nums[j]){
                    if(j-i <= k){
                    return true;
                    }
                }
            }
        }
        System.gc();
        return false;
    }
}
```
