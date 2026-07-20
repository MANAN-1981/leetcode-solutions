# Sum of Square Numbers

<div align="center">

## 🟡 Medium • 📂 Math • 💻 Java

[Problem Link](https://leetcode.com/problems/sum-of-square-numbers/)

</div>

---

# 🧠 Approach

This solution uses a two-pointer approach to check if a given number can be expressed as the sum of two square numbers. It iterates through possible square numbers, adjusting the pointers based on whether the sum is greater than, less than, or equal to the target number. The solution returns true if a matching pair is found and false otherwise.

---

# 📊 Complexity Analysis

| Operation | Complexity |
|-----------|------------|
| Time | **O(sqrt(n))** |
| Space | **O(1)** |

---

# 💻 Source Code

```java
class Solution {
    public boolean judgeSquareSum(int c) {

        long l = 0;
        long r =(long)Math.sqrt(c); 

        while(l<=r)
        {
            long sum = l*l + r*r;

            if(sum == c)
            {
                return true;
            }

            else if(sum >c)
            {
                r--;
            }

            else
            {
                l++;
            }

        }   
    
    return false;

    }
}
```
