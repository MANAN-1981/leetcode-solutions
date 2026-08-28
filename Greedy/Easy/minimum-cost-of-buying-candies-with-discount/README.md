# Minimum Cost of Buying Candies With Discount

<div align="center">

## 🟢 Easy • 📂 Greedy

[Problem Link](https://leetcode.com/problems/minimum-cost-of-buying-candies-with-discount/)

**Solutions:** `Java`

</div>

---

# 🧠 Approach

Sort the array in non‑decreasing order and iterate from the largest element, adding the cost of the two most expensive candies in each group of three (the third is free).

---

# 💻 Source Code

<!-- LCGH:SOLUTION lang="Java" -->
## 💻 Java

| Operation | Complexity |
|-----------|------------|
| Time | **O(n log n)** |
| Space | **O(1)** |

[`solution.java`](./solution.java)

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
<!-- /LCGH:SOLUTION -->
