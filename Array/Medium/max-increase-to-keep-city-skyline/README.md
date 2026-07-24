# Max Increase to Keep City Skyline

<div align="center">

## 🟡 Medium • 📂 Array • 💻 Java

[Problem Link](https://leetcode.com/problems/max-increase-to-keep-city-skyline/)

</div>

---

# 🧠 Approach

The approach used in the code involves finding the maximum height of each row and column in the grid, then iterating over the grid to calculate the maximum increase in height for each cell while keeping the city skyline intact. This is achieved by taking the minimum of the row and column maximum heights and subtracting the current cell height. The total increase is then calculated by summing up these individual increases.

---

# 📊 Complexity Analysis

| Operation | Complexity |
|-----------|------------|
| Time | **O(n*m)** |
| Space | **O(n+m)** |

---

# 💻 Source Code

```java
class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        
        int rows = grid.length;
        int cols = grid[0].length;

        int rowMax[] = new int[rows];
        int colMax[] = new int[cols];

        int answer = 0;

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                rowMax[i] = Math.max(rowMax[i] , grid[i][j]);
            }
        }
        
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                colMax[j] = Math.max(colMax[j] , grid[i][j]);
            }
        }
        
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                answer += Math.min(rowMax[i] , colMax[j]) - grid[i][j];
            }
        }

        return answer;
    }
}
```
