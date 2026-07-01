# Minimum Cost of Buying Candies With Discount

**Difficulty:** Easy
**Topic:** Array
**LeetCode link:** https://leetcode.com/problems/minimum-cost-of-buying-candies-with-discount/submissions/2051912312/

## Solutions

### Java
**Approach:** This solution sorts the array of candy costs in ascending order, then iterates over the array from the end, adding the costs of the two most expensive candies in each set of three to the total cost. This greedy approach takes advantage of the discount offered when buying three candies. The solution has a time complexity of O(n log n) due to the sorting operation, but is simplified to O(n) in the provided JSON object, however the correct time complexity is O(n log n) due to the sorting operation.
**Time:** O(n log n) | **Space:** O(1)
[View code](solution.java)
