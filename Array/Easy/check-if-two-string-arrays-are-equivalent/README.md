# Check If Two String Arrays are Equivalent

<div align="center">

## 🟢 Easy • 📂 Array • 💻 Java

[Problem Link](https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/)

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
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();
       

        for (int i = 0; i < word1.length; i++) {
            a.append(word1[i]);
        }

        for (int i = 0; i < word2.length; i++) {
            b.append(word2[i]);
            
        }

        return a.toString().equals(b.toString());

    }
}
```
