# Minimum Cost Of Buying Candies With Discount

<div align="center">

## 🟢 Easy • 📂 Array • 💻 Java

[Problem Link](https://leetcode.com/problems/minimum-cost-of-buying-candies-with-discount/)

</div>

---

# 🧠 Approach

This problem requires finding the minimum cost of buying candies with a discount. The approach involves sorting the candies by price and then selecting the most expensive ones with a discount. The solution uses a greedy algorithm to achieve this.

---

# 📊 Complexity Analysis

| Operation | Complexity |
|-----------|------------|
| Time | **O(n log n)** |
| Space | **O(1)** |

---

# 💻 Source Code

```java
class Solution {
    public int minimumCost(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;

        for (int i = nums.length - 1; i >= 0; i -= 3) {
            ans += nums[i];

            if (i - 1 >= 0) {
                ans += nums[i - 1];
            }
        }
        return ans;
    }
}
```
