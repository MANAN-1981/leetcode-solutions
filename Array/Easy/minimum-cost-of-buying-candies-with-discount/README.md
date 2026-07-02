# Minimum Cost Of Buying Candies With Discount

<div align="center">

## 🟢 Easy • 📂 Array • 💻 Java

[Problem Link](https://leetcode.com/problems/minimum-cost-of-buying-candies-with-discount/)

</div>

---

# 🧠 Approach

This problem involves sorting an array of candy prices and then selecting the most expensive candies to buy with a discount. The goal is to minimize the total cost of buying all the candies. The solution uses a greedy approach to achieve this.

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

---

<div align="center">

⭐ If you found this solution helpful, consider giving this repository a star.

</div>
