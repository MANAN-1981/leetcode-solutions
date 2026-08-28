# Problem Explanation

## Algorithm Overview

The solution uses a sliding window of size k to maintain the sum of the current subarray. By updating the sum in O(1) when the window moves, we can compute each subarray's average efficiently and track the maximum.

---

## Step-by-Step Explanation

1. Initialize left = 0 and right = k-1.
2. Compute the sum of the first k elements.
3. Calculate the average and store it as the current maximum.
4. Move the window one step to the right: increment left and right.
5. Update the sum by subtracting nums[left-1] and adding nums[right].
6. Compute the new average and update the maximum if larger.
7. Repeat steps 4‑6 until right reaches the end of the array.
8. Return the maximum average found.

---

## Why This Works

Because the window size never changes, the sum of each consecutive subarray can be derived from the previous sum with only two arithmetic operations. This guarantees that every possible subarray of length k is examined exactly once, ensuring the maximum average is found.

---

## Edge Cases

- k equals the length of the array (only one subarray to consider).
- The array contains all negative numbers (still works, max average may be negative).
- Very large integer values that could overflow an int sum (use long or double).

---

## Alternative Approaches

1. Build a prefix‑sum array; any subarray sum of length k is prefix[i+k]‑prefix[i], giving O(1) query time and O(n) preprocessing.
2. For the more general version (variable length), binary search on the answer with a feasibility check, but for fixed k the sliding window is optimal.

---

## Common Mistakes

- Forgetting to cast k to double before division, leading to integer division.
- Using int for the running sum, which can overflow for large inputs.
- Off‑by‑one errors when initializing or moving the window boundaries.
