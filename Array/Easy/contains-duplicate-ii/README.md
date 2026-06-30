# Contains Duplicate II

**Difficulty:** Easy
**Topic:** Array
**LeetCode link:** https://leetcode.com/problems/contains-duplicate-ii/submissions/2051442778/

## Solutions

### Java
**Approach:** This solution uses a brute-force approach with nested loops to check for duplicate elements within a certain distance in the array. It iterates over each element and checks the next k elements for a duplicate. If a duplicate is found within the distance k, the function returns true. Otherwise, it returns false after checking all elements.
**Time:** O(n*k) | **Space:** O(1)
[View code](solution.java)
