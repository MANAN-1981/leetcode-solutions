# Rotate Image

<div align="center">

## 🟡 Medium • 📂 Array • 💻 Java

[Problem Link](https://leetcode.com/problems/rotate-image/submissions/2074001858/)

</div>

---

# 🧠 Approach

The approach used in the code is to first transpose the matrix by swapping elements across the diagonal, and then reverse each row to achieve the rotation. This is done in two separate loops, one for transposing and one for reversing. The result is a rotated matrix.

---

# 📊 Complexity Analysis

| Operation | Complexity |
|-----------|------------|
| Time | **O(n^2)** |
| Space | **O(1)** |

---

# 💻 Source Code

```java
class Solution {
    public void rotate(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int row = 1; row < rows; row++) {
            for (int col = 0; col < row; col++) {
                int temp = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = temp;
            }
        }

        for (int row = 0; row < rows; row++) {
            int left = 0;
            int right = cols - 1;

            while (left < right) {
                int temp = matrix[row][left];
                matrix[row][left] = matrix[row][right];
                matrix[row][right] = temp;

                left++;
                right--;
            }

        }
    }
}
```
