# Pow(x, n)

<div align="center">

## 🟡 Medium • 📂 Math • 💻 Java

[Problem Link](https://leetcode.com/problems/powx-n/submissions/2086316385/)

</div>

---

# 🧠 Approach

This solution uses the built-in Math.pow function in Java to calculate the power of a number. The function takes two parameters, the base and the exponent, and returns the result of raising the base to the power of the exponent. This approach is straightforward and efficient, but may not be suitable for very large inputs due to potential overflow issues.

---

# 📊 Complexity Analysis

| Operation | Complexity |
|-----------|------------|
| Time | **O(1)** |
| Space | **O(1)** |

---

# 💻 Source Code

```java
class Solution {
    public double myPow(double x, int n) {
        return Math.pow(x,n);
    }
}
```
