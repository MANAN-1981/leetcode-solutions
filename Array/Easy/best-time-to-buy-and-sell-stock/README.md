# Best Time to Buy and Sell Stock

**Difficulty:** Easy
**Topic:** Array
**Language:** Java
**LeetCode link:** https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

## Approach

The solution iterates through the array once, keeping track of the minimum price encountered up to the current day. For each day, it calculates the potential profit by subtracting this minimum price from the current day's price. The maximum of these potential profits is continuously updated and returned.

## Complexity

- Time: O(n)
- Space: O(1)

---
*Auto-generated and pushed by LeetCode → GitHub AI sync extension.*
