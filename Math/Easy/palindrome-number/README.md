# Palindrome Number

<div align="center">

## 🟢 Easy • 📂 Math • 💻 Java

[Problem Link](https://leetcode.com/problems/palindrome-number/)

</div>

---

# 🧠 Approach

This problem determines whether a given integer is a palindrome by reversing the number and comparing it to the original. The approach involves using arithmetic operations to reverse the number. The solution handles negative numbers as non-palindromes.

---

# 📊 Complexity Analysis

| Operation | Complexity |
|-----------|------------|
| Time | **O(log n)** |
| Space | **O(1)** |

---

# 💻 Source Code

```java
class Solution {
    public boolean isPalindrome(int x) {
        
        int temp = x;
        int rev=0;

        if(x<0){
            return false;
        }
        while(temp != 0){

            int rem = temp%10;
            rev = rev*10+rem;
            temp /= 10;
        }

        if (rev == x){
            return true;
        }else{
            return false;
        }
    }
}
```
