# Binary Search

<div align="center">

## 🟢 Easy • 📂 Array • 💻 Java

[Problem Link](https://leetcode.com/problems/binary-search/)

</div>

---

# 🧠 Approach

This problem uses binary search to find a target element in a sorted array. The algorithm repeatedly divides the search interval in half until the target is found or the interval is empty. This approach is efficient and simple to implement.

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
