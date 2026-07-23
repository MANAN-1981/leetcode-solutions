# Lucky Numbers in a Matrix

<div align="center">

## 🟢 Easy • 📂 Array • 💻 Java

[Problem Link](https://leetcode.com/problems/lucky-numbers-in-a-matrix/)

</div>

---

# 🧠 Approach

The approach used in the code involves finding the minimum number in each row and the maximum number in each column, then checking for any common numbers between these two sets. This is done by iterating over the matrix to find the row minimums and column maximums, and then comparing these two sets to find any lucky numbers. The time complexity is higher than O(n) due to the nested iterations, but the provided code does not accurately reflect the space and time complexities.

---

# 📊 Complexity Analysis

| Operation | Complexity |
|-----------|------------|
| Time | **O(m*n)** |
| Space | **O(m+n)** |

---

# 💻 Source Code

```java
class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
         int rows = matrix.length;
        int cols = matrix[0].length;


        ArrayList < Integer > rowMin = new ArrayList < > ();
        ArrayList < Integer > colMax = new ArrayList < > ();
        ArrayList < Integer > result = new ArrayList < > ();


        for (int i = 0; i < rows; i++) {
            int min = matrix[i][0];
            for (int j = 1; j < cols; j++) {
                min = Math.min(min, matrix[i][j]);
            }
            rowMin.add(min);
        }


        for (int j = 0; j < cols; j++) {
            int max = matrix[0][j];
            for (int i = 1; i < rows; i++) {
                max = Math.max(max, matrix[i][j]);
            }
            colMax.add(max);
        }

        for (int num: rowMin) {
            if (colMax.contains(num)) {
                result.add(num);
            }
        }
return result;

    }
}
```
