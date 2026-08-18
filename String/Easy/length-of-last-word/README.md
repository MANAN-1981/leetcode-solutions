# Length of Last Word

<div align="center">

## 🟢 Easy • 📂 String • 💻 Java

[Problem Link](https://leetcode.com/problems/length-of-last-word/)

</div>

---

# 🧠 Approach

Solution submitted via LeetCode.

---

# 📊 Complexity Analysis

| Operation | Complexity |
|-----------|------------|
| Time | **N/A** |
| Space | **N/A** |

---

# 💻 Source Code

```java
class Solution {
    public int lengthOfLastWord(String s) {
        s.strip();
        String[] words = s.split(" ");

        int n = words.length;

        String last = words[n-1];

        return last.length();
    }
}
```
