# Restore Finishing Order

<div align="center">

## 🟢 Easy • 📂 Array

[Problem Link](https://leetcode.com/problems/restore-finishing-order/)

**Solutions:** `Java`

</div>

---

# 🧠 Approach

Use a HashMap to store each value's index while iterating through the array. For every value, check whether target - value already exists.

---

# 💻 Source Code

<!-- LCGH:SOLUTION lang="Java" -->
## 💻 Java

| Operation | Complexity |
|-----------|------------|
| Time | **O(n)** |
| Space | **O(n)** |

[`solution.java`](./solution.java)

```java
class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        

        int[] ans = new int[friends.length];
        int index = 0;

        for (int i : order) {
            for (int j : friends) {
                if (i == j) {
                    ans[index++] = i;
                    break;
                }
            }
        }

        return ans;
    }
}
```
<!-- /LCGH:SOLUTION -->
