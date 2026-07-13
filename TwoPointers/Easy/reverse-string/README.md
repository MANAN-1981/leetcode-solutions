# Reverse String

<div align="center">

## 🟢 Easy • 📂 TwoPointers • 💻 Java

[Problem Link](https://leetcode.com/problems/reverse-string/)

</div>

---

# 🧠 Approach

This solution uses a two-pointer approach to reverse the input string in-place. It initializes two pointers, one at the start and one at the end of the string, and then swaps the characters at these positions while moving the pointers towards each other. This process continues until the pointers meet in the middle, resulting in the reversed string.

---

# 📊 Complexity Analysis

| Operation | Complexity |
|-----------|------------|
| Time | **O(n)** |
| Space | **O(1)** |

---

# 💻 Source Code

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
