# Plus One

<div align="center">

## 🟢 Easy • 📂 Array • 💻 Java

[Problem Link](https://leetcode.com/problems/plus-one/submissions/2091561597/)

</div>

---

# 🧠 Approach

The approach used in the code involves iterating through the input array from right to left, incrementing the current digit if it's less than 9, and carrying over the increment if the digit is 9. If all digits are 9, a new array with an additional digit is created to accommodate the carry. This solution modifies the input array in-place when possible to minimize space complexity.

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
    public int[] plusOne(int[] digits) {
        
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits; 
            }
        
            digits[i] = 0;
        }
        
        
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1; 
        return newDigits;
    }
}
```
