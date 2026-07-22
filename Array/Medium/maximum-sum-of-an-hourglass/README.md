# Maximum Sum of an Hourglass

<div align="center">

## 🟡 Medium • 📂 Array • 💻 Java

[Problem Link](https://leetcode.com/problems/maximum-sum-of-an-hourglass/)

</div>

---

# 🧠 Approach

This solution iterates over each possible hourglass shape in the given grid, calculates the sum of the elements in the current hourglass, and keeps track of the maximum sum found. It uses a brute force approach with two nested loops to generate all possible hourglasses. The time complexity is higher than linear due to the nested loops, and the space complexity is constant as it only uses a fixed amount of space to store the maximum sum and the current sum.

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
    public int maxSum(int[][] grid) {
        
        int n = grid.length;
        int m = grid[0].length;

        int sum=0;
        int itSum=0;

        for(int i=0; i<n-2; i++){
            for(int j=0; j<m-2; j++){
                itSum = grid[i][j]+grid[i][j+1]+grid[i][j+2]
                + grid[i+1][j+1]+ grid[i+2][j]+grid[i+2][j+1]+grid[i+2][j+2];
            sum = Math.max(sum,itSum);
            }
        }

        return sum;
    }
}
```
