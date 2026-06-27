# Merge Sorted Array

**Difficulty:** Easy
**Topic:** Array
**LeetCode link:** https://leetcode.com/problems/merge-sorted-array/submissions/2048182359/

## Solutions

### Java
**Approach:** This solution merges two sorted arrays into one by first copying the non-zero elements from the second array into the first array, then sorting the first array to achieve the desired sorted order. The approach relies on the fact that the first array has enough space to hold all elements from both arrays. It uses the built-in sort function to arrange the elements in ascending order.
**Time:** O(n log n) | **Space:** O(1)
[View code](solution.java)
