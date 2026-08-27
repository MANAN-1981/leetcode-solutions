# Problem Explanation

## Algorithm Overview

The algorithm checks every index in the array to see if it is a pivot index. For each index, it calculates the sum of all elements to the left and the sum of all elements to the right using recursive functions. If the left sum equals the right sum, the index is returned as the pivot. If no pivot is found after checking all indices, -1 is returned. The recursive sum calculations lead to a quadratic time complexity.

---

## Step-by-Step Explanation

1. Initialize the length of the array.
2. Iterate through each index i from 0 to n-1.
3. For each index i, call leftSum(arr, i-1) to calculate the sum of elements from 0 to i-1.
4. For each index i, call rightSum(arr, i+1, n) to calculate the sum of elements from i+1 to n-1.
5. Compare the left sum and right sum.
6. If they are equal, return the current index i.
7. If the loop completes without finding a pivot, return -1.
8. The leftSum function recursively adds the current element to the sum of the previous element until the index is negative.
9. The rightSum function recursively adds the current element to the sum of the next element until the index exceeds the array length.

---

## Why This Works

A pivot index is defined as an index where the sum of elements strictly to the left equals the sum of elements strictly to the right. By explicitly calculating these two sums for every possible index, we can verify the condition for each candidate. The recursive functions correctly accumulate the sums by breaking down the problem into smaller subproblems of summing a prefix or suffix of the array.

---

## Edge Cases

- Empty array: The loop does not execute, and -1 is returned.
- Single element array: Left sum is 0, right sum is 0, so index 0 is returned.
- All zeros: The first index (0) will be returned as left and right sums are both 0.
- Large arrays: The recursive approach may cause a StackOverflowError due to deep recursion depth equal to the array length.

---

## Alternative Approaches

- Iterative Prefix Sum: Calculate the total sum first, then iterate while maintaining a running left sum. The right sum can be derived as totalSum - leftSum - arr[i]. This runs in O(n) time and O(1) space.
- Two Pass: Calculate prefix sums in one pass and suffix sums in another, storing them in arrays, then compare. This runs in O(n) time and O(n) space.

---

## Common Mistakes

- Using recursion for summing large arrays, which can lead to stack overflow.
- Forgetting that the pivot element itself is not included in either the left or right sum.
- Not handling the case where no pivot index exists, returning an incorrect value instead of -1.
