# Binary Search

<div align="center">

## 🟢 Easy • 📂 BinarySearch • 💻 Java

[Problem Link](https://leetcode.com/problems/binary-search/)

</div>

---

# 🧠 Approach

This problem uses binary search to find the index of a target element in a sorted array. The algorithm works by repeatedly dividing the search interval in half until the target element is found. If the target element is not found, the algorithm returns -1.

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
    public int search(int[] nums, int target) {
        int st = 0;
        int end = nums.length - 1;

        while(st<=end){
            int mid = st + (end - st) / 2;

            if (target > nums[mid]){
                st = mid + 1;
            }else if(target < nums[mid]){
                end = mid - 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
```

---

<div align="center">

⭐ If you found this solution helpful, consider giving this repository a star.

</div>
