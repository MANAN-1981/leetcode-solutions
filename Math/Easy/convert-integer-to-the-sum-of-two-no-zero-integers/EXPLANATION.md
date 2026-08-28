# Problem Explanation

## Algorithm Overview

The algorithm scans all possible values for the first addend. For each value it verifies that neither the value nor n minus the value contains the digit zero. The first valid pair is returned.

---

## Step-by-Step Explanation

1. Loop a from 1 to n‑1.
2. Compute b = n – a.
3. Convert a and b to strings.
4. If neither string contains '0', return [a, b].
5. If the loop finishes without finding a pair (theoretically impossible for n ≥ 2), return an empty array.

---

## Why This Works

If a and b are both positive and contain no zero digit, they satisfy the problem constraints. Since we examine every possible a, we are guaranteed to encounter a valid pair because at least one exists for any n ≥ 2 (e.g., 1 and n‑1 when n‑1 has no zero).

---

## Edge Cases

- n = 2 (the smallest valid input, returns [1,1]).
- Numbers where n‑1 contains a zero but another pair exists (e.g., n = 101, answer [11,90] is invalid because 90 has zero, but [19,82] works). 
- Large n up to 10^5, still linear scan is fast.
- Ensure both a and b are > 0.

---

## Alternative Approaches

1. Pre‑compute all numbers without zero up to n and use a hash set to test complements in O(1) lookup.
2. Use recursion/backtracking to build numbers digit by digit, pruning any branch that would introduce a zero (overkill for this easy problem).

---

## Common Mistakes

1. Forgetting to check both numbers for zeros, only checking one side.
2. Starting the loop at 0, which would produce a zero addend.
3. Using an array of size n and filling it unnecessarily, leading to O(n) extra space.
