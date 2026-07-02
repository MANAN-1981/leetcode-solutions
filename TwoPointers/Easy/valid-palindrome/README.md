# Valid Palindrome

<div align="center">

## 🟢 Easy • 📂 String • 💻 Java

[Problem Link](https://leetcode.com/problems/valid-palindrome/)

</div>

---

# 🧠 Approach

This problem involves checking if a given string is a palindrome after removing non-alphanumeric characters and converting to lowercase. The approach involves using two pointers to compare characters from the start and end of the string, moving towards the center. The solution returns true if all pairs of characters match, and false otherwise.

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

---

<div align="center">

⭐ If you found this solution helpful, consider giving this repository a star.

</div>
