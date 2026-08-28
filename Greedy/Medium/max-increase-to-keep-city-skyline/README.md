# Max Increase to Keep City Skyline

<div align="center">

## 🟡 Medium • 📂 Greedy

[Problem Link](https://leetcode.com/problems/max-increase-to-keep-city-skyline/)

**Solutions:** `Java`

</div>

---

# 🧠 Approach

Compute the maximum height in each row and each column, then for each cell increase its height to the minimum of its row and column maximums, summing the differences.

---

# 💻 Source Code

<!-- LCGH:SOLUTION lang="Java" -->
## 💻 Java

| Operation | Complexity |
|-----------|------------|
| Time | **O(m*n)** |
| Space | **O(m+n)** |

[`solution.java`](./solution.java)

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
<!-- /LCGH:SOLUTION -->
