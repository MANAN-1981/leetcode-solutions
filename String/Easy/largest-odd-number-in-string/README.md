# Largest Odd Number in String

<div align="center">

## 🟢 Easy • 📂 String

[Problem Link](https://leetcode.com/problems/largest-odd-number-in-string/)

**Solutions:** `Java`

</div>

---

# 🧠 Approach

Iterate from the end of the string to the beginning. The first odd digit encountered determines the largest odd number, as keeping the longest prefix ending with an odd digit yields the maximum value. Return the substring from the start to this index.

---

# 💻 Source Code

<!-- LCGH:SOLUTION lang="Java" -->
## 💻 Java

| Operation | Complexity |
|-----------|------------|
| Time | **O(n)** |
| Space | **O(1)** |

[`solution.java`](./solution.java)

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
<!-- /LCGH:SOLUTION -->
