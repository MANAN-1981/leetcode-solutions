# Determine Whether Matrix Can Be Obtained By Rotation

<div align="center">

## 🟢 Easy • 📂 Array • 💻 Java

[Problem Link](https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/)

</div>

---

# 🧠 Approach

The approach used in the code checks if the target matrix can be obtained by rotating the original matrix. It first checks if the original matrix is the same as the target matrix, and if not, it rotates the original matrix 90 degrees clockwise and checks again, repeating this process up to three times. If a match is found after any rotation, the function returns true; otherwise, it returns false.

---

# 📊 Complexity Analysis

| Operation | Complexity |
|-----------|------------|
| Time | **O(n^2)** |
| Space | **O(n^2)** |

---

# 💻 Source Code

```java
class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {

        int result[][] = new int[mat.length][mat[0].length];

        int rotate = 0;
        Boolean same = true;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] != target[i][j]) {
                    same = false;
                }
            }
        }

        if (same) {
            return true;
        }

        while (rotate < 3) {

            for (int k = 0; k < mat.length; k++) {

                int index = 0;

                for (int i = mat.length - 1; i >= 0; i--) {
                    result[k][index] = mat[i][k];
                    index++;
                }
            }

            same = true;

            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[0].length; j++) {
                    if (result[i][j] != target[i][j]) {
                        same = false;
                    }
                }
            }

            if (same) {
                return true;
            } else {
                for (int i = 0; i < mat.length; i++) {
                    for (int j = 0; j < mat[0].length; j++) {
                        mat[i][j] = result[i][j];
                    }
                }
            }

            rotate++;
        }

        return false;
    }
}
```
