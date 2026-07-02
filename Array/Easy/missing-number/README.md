# Missing Number

<div align="center">

## 🟢 Easy • 📂 Array • 💻 Java

[Problem Link](https://leetcode.com/problems/missing-number/)

</div>

---

# 🧠 Approach

The problem is solved by calculating the sum of all numbers from 0 to n and subtracting the sum of the given array. This approach takes advantage of the mathematical formula for the sum of an arithmetic series. The solution has a time complexity of O(n) and a space complexity of O(1).

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
    public int missingNumber(int[] nums) {
        int sum = 0;
        int max = nums.length;

        for (int i=0; i<nums.length; i++){
            sum += nums[i];
            max += i;
        }

    return max-sum;
    }
}
```

---

<div align="center">

⭐ If you found this solution helpful, consider giving this repository a star.

</div>
