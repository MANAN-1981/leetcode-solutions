# To Lower Case

<div align="center">

## 🟢 Easy • 📂 Array

[Problem Link](https://leetcode.com/problems/to-lower-case/)

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
    public String toLowerCase(String s) {
        return s.toLowerCase();
    }
}
```
<!-- /LCGH:SOLUTION -->
