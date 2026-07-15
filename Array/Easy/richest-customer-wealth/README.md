# Richest Customer Wealth

<div align="center">

## 🟢 Easy • 📂 Array • 💻 Java

[Problem Link](https://leetcode.com/problems/richest-customer-wealth/)

</div>

---

# 🧠 Approach

The approach used in the code is to iterate over each row in the given 2D array, calculate the sum of each row, and keep track of the maximum sum found. This maximum sum represents the wealth of the richest customer. The code uses two nested loops to achieve this, with the outer loop iterating over the rows and the inner loop iterating over the columns of each row.

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
    public int maximumWealth(int[][] arr) {

        int rows = arr.length;

        int mx = 0;

        for (int row = 0; row < rows; row++) {
            int cols = arr[row].length;
            int sum = 0;
            for (int col = 0; col < cols; col++) {
                sum += arr[row][col];
            }
            mx = Math.max(mx, sum);
        }
        return mx;
    }
}
```
