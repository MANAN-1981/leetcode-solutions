# Search Insert Position

<div align="center">

## 🟢 Easy • 📂 BinarySearch • 💻 Java

[Problem Link](https://leetcode.com/problems/search-insert-position/)

</div>

---

# 🧠 Approach

This problem involves finding the position to insert a target value in a sorted array to maintain sorted order. The solution uses a binary search approach to achieve this efficiently. It iterates through the array, adjusting the search range based on comparisons with the target value.

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

---

<div align="center">

⭐ If you found this solution helpful, consider giving this repository a star.

</div>
