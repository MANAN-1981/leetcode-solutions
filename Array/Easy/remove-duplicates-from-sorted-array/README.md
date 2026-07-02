# Remove Duplicates From Sorted Array

<div align="center">

## 🟢 Easy • 📂 Array • 💻 Java

[Problem Link](https://leetcode.com/problems/remove-duplicates-from-sorted-array/)

</div>

---

# 🧠 Approach

This problem involves removing duplicates from a sorted array by iterating through the array and only keeping the first occurrence of each number. The solution uses a two-pointer approach to track the position of the next non-duplicate element. The function returns the length of the modified array with duplicates removed.

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
    public int removeDuplicates(int[] nums) {
        int k = 0;
        
        for (int i = 1; i< nums.length; i++){
           if (nums[k] != nums[i]){
            k++;
            nums[k] = nums[i];
           }
        }
        return k+1;
    }
}
```
