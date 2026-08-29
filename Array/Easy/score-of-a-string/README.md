# Score of a String

<div align="center">

## 🟢 Easy • 📂 Array

[Problem Link](https://leetcode.com/problems/score-of-a-string/)

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
    public int scoreOfString(String s) {
        
         int out = 0;

        for (int i = 1; i < s.length(); i++) {
            out += Math.abs(s.charAt(i) - s.charAt(i - 1));
        }

        return out;
    }
}
```
<!-- /LCGH:SOLUTION -->
