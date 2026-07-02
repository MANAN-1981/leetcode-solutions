# Contains Duplicate

<div align="center">

## 🟢 Easy • 📂 Array • 💻 Java

[Problem Link](https://leetcode.com/problems/contains-duplicate/)

</div>

---

# 🧠 Approach

This problem can be solved by sorting the input array and then checking for adjacent duplicates. The solution has a time complexity of O(n log n) due to the sorting step. It returns true as soon as it finds a duplicate, and false otherwise.

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
    public boolean containsDuplicate(int[] nums) {
        
        Arrays.sort(nums);

        for(int i=1; i<nums.length; i++){
            if(nums[i] == nums[i-1]){
                return true;
            }
        } 
                   return false;
    }
}
```
