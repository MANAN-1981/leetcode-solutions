# Valid Palindrome

<div align="center">

## 🟢 Easy • 📂 String

[Problem Link](https://leetcode.com/problems/valid-palindrome/)

**Solutions:** `Java`

</div>

---

# 🧠 Approach

Remove non-alphanumeric characters and convert to lower case, then use two pointers from start and end to compare characters until they meet.

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
    public boolean isPalindrome(String se) {
        
        String s = se.replaceAll("[^a-zA-Z0-9]" , "").toLowerCase();
        if(s.length() == 0){
            return true;
        }
        char arr[] = s.toCharArray();
        int st = 0;
        int en = arr.length -1;

        while(st <= en){
            if(arr[st] != arr[en]){
                return false;
            }   
            else{                
               st++;
               en--;
            }   
        }
        return true;
    }
}
```
<!-- /LCGH:SOLUTION -->
