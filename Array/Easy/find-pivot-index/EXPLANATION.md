# Problem Explanation

## Algorithm Overview

The algorithm iterates through the array and for each index, it calculates the sum of all numbers to the left and right of the index using recursive functions. If the left sum equals the right sum, the index is returned as the pivot index. The algorithm has a time complexity of O(n^2) due to the recursive calculations.

---

## Step-by-Step Explanation

1. Initialize the array length and iterate through the array. 
2. For each index, calculate the left sum using the leftSum function. 
3. For each index, calculate the right sum using the rightSum function. 
4. Compare the left sum and right sum, and return the index if they are equal.

---

## Why This Works

This algorithm works because it correctly calculates the sum of all numbers to the left and right of each index. By comparing these sums, it can identify the pivot index where the left sum equals the right sum.

---

## Edge Cases

Important edge cases include an empty array, an array with a single element, and an array with all elements equal. These cases should be handled to ensure the algorithm returns the correct result.

---

## Alternative Approaches

Alternative approaches include using a prefix sum array to store the cumulative sum of the array, or using a two-pointer technique to calculate the left and right sums.

---

## Common Mistakes

Common mistakes include not handling edge cases, using inefficient recursive functions, and not optimizing the algorithm for large inputs.
