# Reverse String

<div align="center">

## 🟢 Easy • 📂 String

[Problem Link](https://leetcode.com/problems/reverse-string/)

**Solutions:** `Java`

</div>

---

# 🧠 Approach

Use two pointers, one at the start and one at the end of the array, and swap characters while moving the pointers towards each other.

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
    public void reverseString(char[] s) {

        int st=0;
	    int en = s.length-1;
	   
	    while(st<en){
	      char temp = s[st];
	      s[st] = s[en];
	      s[en] = temp;
	      
	      st++;
	      en--;
	  }
    }
}
```
<!-- /LCGH:SOLUTION -->
