# Contains Duplicate

**Difficulty:** Easy
**Topic:** Array
**LeetCode link:** https://leetcode.com/problems/contains-duplicate/submissions/2050302707/

## Solutions

### Java
**Approach:** This solution sorts the input array and then iterates through it to check for duplicate elements by comparing each element with its previous one. If a duplicate is found, the function returns true; otherwise, it returns false after checking all elements. This approach takes advantage of the fact that sorting brings equal elements together.
**Time:** O(n log n) | **Space:** O(1)
[View code](solution.java)
