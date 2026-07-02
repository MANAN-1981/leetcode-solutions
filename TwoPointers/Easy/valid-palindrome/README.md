# Valid Palindrome

<div align="center">

## 🟢 Easy • 📂 String • 💻 Java

[Problem Link](https://leetcode.com/problems/valid-palindrome/)

</div>

---

# 🧠 Approach

This problem checks if a given string is a palindrome after removing non-alphanumeric characters and converting to lowercase. It uses a two-pointer approach to compare characters from the start and end of the string. The solution returns true if the string is a palindrome and false otherwise.

---

# 📊 Complexity Analysis

| Operation | Complexity |
|-----------|------------|
| Time | **O(n)** |
| Space | **O(n)** |

---

# 💻 Source Code

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
