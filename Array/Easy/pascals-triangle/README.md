# Pascal's Triangle

<div align="center">

## 🟢 Easy • 📂 Array • 💻 Java

[Problem Link](https://leetcode.com/problems/pascals-triangle/)

</div>

---

# 🧠 Approach

This solution uses dynamic programming to generate Pascal's Triangle. It iterates over each row, calculating the values based on the previous row. For the first and last elements of each row, it uses the base case of 1, and for other elements, it sums the two elements directly above it.

---

# 📊 Complexity Analysis

| Operation | Complexity |
|-----------|------------|
| Time | **O(n^2)** |
| Space | **O(n^2)** |

---

# 💻 Source Code

```java
import java.util.*;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
                }
            }

            result.add(row);
        }

        return result;
    }
}
```
