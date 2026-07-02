# Search Insert Position

<div align="center">

## 🟢 Easy • 📂 BinarySearch • 💻 Java

[Problem Link](https://leetcode.com/problems/search-insert-position/)

</div>

---

# 🧠 Approach

This problem involves finding the position where a target value should be inserted in a sorted array to maintain its sorted order. The solution uses a binary search approach to achieve this efficiently. The algorithm returns the index where the target value should be inserted if it is not already present in the array.

---

# 📊 Complexity Analysis

| Operation | Complexity |
|-----------|------------|
| Time | **O(log n)** |
| Space | **O(1)** |

---

# 💻 Source Code

```java
class Solution {
    public int searchInsert(int[] nums, int target) {
  
    int st = 0;
    int end = nums.length - 1;
    int index = 0;

    while(st <= end){
       int mid = st + (end - st) / 2;
       
       if(target == nums[mid]){
           index = mid;
           return index;
       }else if(target > nums[mid]){
           st = mid + 1;
       }else if (target < nums[mid]){
           end = mid - 1;
       }
    }
    return st;
    }
}
```
