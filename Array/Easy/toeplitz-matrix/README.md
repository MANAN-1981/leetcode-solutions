# Toeplitz Matrix

<div align="center">

## 🟢 Easy • 📂 Array • 💻 Java

[Problem Link](https://leetcode.com/problems/toeplitz-matrix/description/)

</div>

---

# 🧠 Approach

The approach used in the code checks each element in the matrix (except the last row and column) and compares it with the element diagonally below it. If all these comparisons pass, the matrix is a Toeplitz matrix. This is done using nested loops to iterate over the matrix.

---

# 📊 Complexity Analysis

| Operation | Complexity |
|-----------|------------|
| Time | **O(n*m)** |
| Space | **O(1)** |

---

# 💻 Source Code

```java
class Solution {
    public boolean isToeplitzMatrix(int[][] arr) {

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr[i].length-1; j++) {
                if(arr[i][j] != arr[i+1][j+1]){
                    return false;
                }
            }
        }
        return true;
    }
}
```
