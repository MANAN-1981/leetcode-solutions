# Problem Explanation

## Algorithm Overview

The algorithm treats the string as an array of characters. For each index i from 1 to n‑1, it computes the absolute difference between s[i] and s[i‑1] and adds it to a running total. After the loop finishes, the total is returned as the score.

---

## Step-by-Step Explanation

1. Initialize result = 0.
2. Loop i from 1 to s.length()‑1.
3. Compute diff = Math.abs(s.charAt(i) - s.charAt(i‑1)).
4. Add diff to result.
5. After the loop, return result.

---

## Why This Works

The score definition is exactly the sum of absolute differences of consecutive characters. By visiting each adjacent pair once and accumulating their differences, we directly compute the definition without any extra work.

---

## Edge Cases

- Empty string or single‑character string yields a score of 0 because the loop never runs.
- Strings containing non‑alphabetic Unicode characters still work because char subtraction yields their code‑point difference.
- Very long strings still fit in O(n) time and O(1) space.

---

## Alternative Approaches

1. Convert the string to a char array first and iterate over the array; this is functionally identical but may be slightly faster in some languages.
2. Use a stream (e.g., IntStream) to map each adjacent pair to its absolute difference and sum, though this adds overhead and reduces readability.

---

## Common Mistakes

1. Forgetting to take the absolute value, which can produce negative contributions.
2. Starting the loop at i = 0 and accessing i‑1, causing an IndexOutOfBoundsException.
3. Using an int overflow‑prone accumulator for extremely long strings (use long if needed).
