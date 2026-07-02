# Convert Integer to the Sum of Two No-Zero Integers

**Difficulty:** Easy
**Topic:** Math
**LeetCode link:** https://leetcode.com/problems/convert-integer-to-the-sum-of-two-no-zero-integers/submissions/2053025127/

## Solutions

### Java
**Approach:** The approach used in the code involves generating an array of integers from 1 to n, then checking each pair of integers to see if they add up to n and do not contain the digit 0. The code uses a recursive function to populate the array and then iterates over the array to find the pair of integers that meet the conditions. This solution has a time complexity of O(n) due to the iteration over the array.
**Time:** O(n^2) | **Space:** O(n)
[View code](solution.java)
