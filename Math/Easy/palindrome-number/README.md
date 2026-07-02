# Palindrome Number

<div align="center">

## 🟢 Easy • 📂 Math • 💻 Java

[Problem Link](https://leetcode.com/problems/palindrome-number/)

</div>

---

# 🧠 Approach

This problem checks if a given integer is a palindrome by reversing the number and comparing it to the original. The solution handles negative numbers and uses a simple iterative approach. It returns true if the number is a palindrome and false otherwise.

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

---

<div align="center">

⭐ If you found this solution helpful, consider giving this repository a star.

</div>
