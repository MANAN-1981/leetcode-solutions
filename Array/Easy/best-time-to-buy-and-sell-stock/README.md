# Best Time to Buy and Sell Stock

**Difficulty:** Easy
**Topic:** Array
**Language:** Java
**LeetCode link:** https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

## Approach

The code iterates through the array of stock prices, keeping track of the lowest price encountered so far. For each day, it calculates the potential profit by subtracting this minimum price from the current day's price. The maximum profit found across all days is continuously updated and returned.

## Complexity

- Time: O(n)
- Space: O(1)

---
*Auto-generated and pushed by LeetCode → GitHub AI sync extension.*
