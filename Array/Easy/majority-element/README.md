# Majority Element

**Difficulty:** Easy
**Topic:** Array
**LeetCode link:** https://leetcode.com/problems/majority-element/submissions/2049556771/

## Solutions

### Java
**Approach:** The approach used in this code is to sort the input array and then return the middle element, which is guaranteed to be the majority element since it occurs more than half of the time. This works because the problem states that a majority element always exists. The sorting step allows us to find the majority element in a straightforward manner.
**Time:** O(n log n) | **Space:** O(1)
[View code](solution.java)
