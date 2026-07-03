# Subtract the Product and Sum of Digits of an Integer

<div align="center">

## 🟢 Easy • 📂 Math • 💻 Java

[Problem Link](https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/submissions/2054119371/)

</div>

---

# 🧠 Approach

This solution calculates the product and sum of the digits of a given integer by iterating through each digit using the modulus operator to get the remainder and integer division to move to the next digit. The product and sum are then subtracted to get the final result. This approach allows for efficient calculation in a single pass through the digits.

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
    public int subtractProductAndSum(int num) {
        int rem = 0;
        int mul = 1;
        int sum = 0;
        
        
        while(num != 0){
            rem = num%10;
            sum += rem;
            mul *= rem;
            num = num/10;
        }
        return mul-sum;
    }
}
```
