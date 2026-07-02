# Single Number

<div align="center">

## 🟢 Easy • 📂 BitManipulation • 💻 Java

[Problem Link](https://leetcode.com/problems/single-number/)

</div>

---

# 🧠 Approach

The problem can be solved by using bitwise XOR operation to find the single number in the array. The XOR operation has the property that a ^ a = 0 and a ^ 0 = a, which makes it suitable for this problem. The solution iterates through the array and XORs all the numbers to find the single number.

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
    public int singleNumber(int[] nums) {
        
       int count = nums[0];

       for(int i=1; i<nums.length; i++){
        count = count ^ nums[i];
       }
       return count;
    }
}
```
