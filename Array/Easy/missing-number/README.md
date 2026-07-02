# Missing Number

<div align="center">

## 🟢 Easy • 📂 Array • 💻 Java

[Problem Link](https://leetcode.com/problems/missing-number/)

</div>

---

# 🧠 Approach

The problem is solved by calculating the sum of the given array and the sum of numbers from 0 to the length of the array, then returning the difference between the two sums. This approach works because the missing number is the one that would make the sum of the array equal to the sum of numbers from 0 to the length of the array. The solution has a time complexity of O(n) and a space complexity of O(1).

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
