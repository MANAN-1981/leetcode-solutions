# Problem Explanation

## Algorithm Overview

The algorithm maintains a contiguous window that contains at most k zeros. It slides the right boundary forward, updates the zero count, and when the count exceeds k it moves the left boundary forward to restore the invariant. The longest valid window length is tracked throughout.

---

## Step-by-Step Explanation

1. Initialize left pointer l = 0, zeroCount = 0, maxLen = 0.
2. Iterate right pointer i from 0 to n-1.
3. If nums[i] == 0, increment zeroCount.
4. While zeroCount > k, move left pointer l forward; if nums[l] == 0 decrement zeroCount.
5. Update maxLen with the current window size i - l + 1.
6. After the loop, return maxLen.

---

## Why This Works

The window always satisfies the condition "≤ k zeros"; expanding it can only increase length, and shrinking restores the condition when it is violated. Because each element is visited at most twice (once by each pointer), the algorithm explores all possible maximal windows efficiently.

---

## Edge Cases

- The array consists entirely of 1s.
- k is zero.
- k is larger than the total number of zeros in the array.
- The array length is 1.

---

## Alternative Approaches

Compute a prefix‑sum array of zero counts and binary‑search for the farthest left index that keeps zeros ≤ k for each right index. This yields O(n log n) time and O(n) space.

---

## Common Mistakes

1. Forgetting to decrement zeroCount when moving the left pointer.
2. Using a separate window‑size variable that isn’t updated after shrinking.
3. Returning i - l instead of i - l + 1.
