# Matrix Diagonal Sum

<div align="center">

## 🟢 Easy • 📂 Array • 💻 Java

[Problem Link](https://leetcode.com/problems/matrix-diagonal-sum/)

</div>

---

# 🧠 Approach

The approach used in the code involves iterating over a square matrix and summing the elements on the primary and secondary diagonals. This is achieved by checking if the current row index is equal to the column index for the primary diagonal, or if the sum of the row and column indices is equal to the matrix size minus one for the secondary diagonal. The time complexity is linear due to the nested loops, and the space complexity is constant as only a fixed amount of space is used to store the sum and indices.

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
    public int diagonalSum(int[][] mat) {

        int n = mat.length;

        int sum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i == j) {
                    sum += mat[i][j];
                }

                else if (i + j == n - 1) {
                    sum += mat[i][j];
                }
            }
        }

        return sum;
    }
}
```
