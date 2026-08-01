# Find Missing and Repeated Values

<div align="center">

## 🟢 Easy • 📂 Array • 💻 Java

[Problem Link](https://leetcode.com/problems/find-missing-and-repeated-values/)

</div>

---

# 🧠 Approach

The approach used in the code involves iterating over a 2D grid to find a repeated value by utilizing a HashSet. It then calculates the sum of all numbers from 1 to the total number of elements in the grid and subtracts the sum of unique elements found in the grid to determine the missing value. This solution has a linear time complexity due to the iteration over the grid and the calculation of sums.

---

# 📊 Complexity Analysis

| Operation | Complexity |
|-----------|------------|
| Time | **O(n)** |
| Space | **O(n)** |

---

# 💻 Source Code

```java
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {

        HashSet<Integer> hs = new HashSet<>();
        int result[] = new int[2];

        int rows = grid.length;
        int cols = grid[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (!hs.add(grid[i][j])) {
                    result[0] = grid[i][j];
                }
            }
        }

        int sum1 = 0;

        for (int i = 1; i <= rows * cols; i++) {
            sum1 += i;
        }

        int sum2 = 0;

        for (int element : hs) {
            sum2 += element;
        }

        result[1] = sum1 - sum2;

        return result;
    }
}
```
