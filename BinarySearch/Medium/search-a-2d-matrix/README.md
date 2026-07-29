# Search a 2D Matrix

<div align="center">

## 🟡 Medium • 📂 BinarySearch • 💻 Java

[Problem Link](https://leetcode.com/problems/search-a-2d-matrix/submissions/2086405403/)

</div>

---

# 🧠 Approach

This solution uses a binary search approach to find the target in a 2D matrix. It treats the matrix as a one-dimensional array and calculates the middle index, then compares the middle element to the target. If the middle element is equal to the target, it returns true; otherwise, it adjusts the search range accordingly.

---

# 📊 Complexity Analysis

| Operation | Complexity |
|-----------|------------|
| Time | **O(log(n))** |
| Space | **O(1)** |

---

# 💻 Source Code

```java
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int st = 0;
        int lt = (rows * cols) - 1;

        while (st <= lt) {
            int mid = st + (lt - st) / 2;

            if (matrix[mid / cols][mid % cols] == target) {
                return true;
            } else if (matrix[mid / cols][mid % cols] > target) {
                lt = mid - 1;
            } else if (matrix[mid / cols][mid % cols] < target) {
                st = mid + 1;
            }
        }
        return false;
    }
}
```
