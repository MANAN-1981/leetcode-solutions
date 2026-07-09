# Maximum Subarray

<div align="center">

## 🟡 Medium • 📂 Array • 💻 Java

[Problem Link](https://leetcode.com/problems/maximum-subarray/submissions/2061451609/)

</div>

---

# 🧠 Approach

This solution uses a dynamic programming approach, also known as Kadane's algorithm, to find the maximum subarray sum. It iterates through the array, at each step deciding whether to continue the current subarray or start a new one. The maximum sum found so far is updated accordingly.

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
    public int maxSubArray(int[] nums) {
        
        int n = nums.length;
		int currentSum = nums[0];
		
		int maxSum = nums[0];

		for (int i = 1; i < nums.length; i++) {
            
           currentSum = Math.max(currentSum+nums[i] , nums[i]);

			maxSum = Math.max(maxSum, currentSum);
		}
        return maxSum;
    }
}
```
