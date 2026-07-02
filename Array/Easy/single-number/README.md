# Single Number

<div align="center">

## 🟢 Easy • 📂 Array • 💻 Java

[Problem Link](https://leetcode.com/problems/single-number/)

</div>

---

# 🧠 Approach

The problem is solved by using the XOR operation to find the single number in the array. This approach works because XOR of all elements gives us an odd occurring element. The solution iterates through the array, performing XOR operations on each element to find the single number.

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

---

<div align="center">

⭐ If you found this solution helpful, consider giving this repository a star.

</div>
