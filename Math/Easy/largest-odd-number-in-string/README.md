# Largest Odd Number in String

<div align="center">

## 🟢 Easy • 📂 Math • 💻 Java

[Problem Link](https://leetcode.com/problems/largest-odd-number-in-string/)

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
    public String largestOddNumber(String num) {
        
        
        for(int i=num.length()-1 ; i>=0; i--){
            if((num.charAt(i) - '0') % 2 != 0){
                return num.substring(0, i+1);
            }
        }
        return "";
    }
}
```
