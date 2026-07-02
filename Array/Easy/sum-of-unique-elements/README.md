# Sum of Unique Elements

**Difficulty:** Easy
**Topic:** Array
**LeetCode link:** https://leetcode.com/problems/sum-of-unique-elements/submissions/2053246209/

## Solutions

### Java
**Approach:** This solution iterates over the input array, counting the occurrences of each element. If an element appears only once, it is added to the sum. The approach uses nested loops to compare each element with every other element in the array. This results in a straightforward but inefficient solution due to the nested loop structure.
**Time:** O(n^2) | **Space:** O(1)
[View code](solution.java)
