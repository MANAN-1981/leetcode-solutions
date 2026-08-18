# Rotate String

<div align="center">

## 🟢 Easy • 📂 String • 💻 Java

[Problem Link](https://leetcode.com/problems/rotate-string/)

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
    public boolean rotateString(String s, String goal) {
        
        String str = s + s;

        if(s.length() != goal.length()){
            return false;
        }

        if(str.contains(goal)){
            return true;
        }

        return false;
    
    } 
}
```
