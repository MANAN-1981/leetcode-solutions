# Interview Review

| Category | Rating |
|----------|--------|
| Interview Readiness | ⭐⭐⭐⭐☆ |
| Difficulty | ⭐⭐⭐☆☆ |
| Optimization | ⭐⭐⭐⭐☆ |
| Code Quality | ⭐⭐⭐⭐☆ |
| Alternative Solutions | ⭐⭐⭐☆☆ |

---

## Common Follow-up Questions

1. How would you handle the case where the input string is extremely large and cannot fit entirely in memory?
2. Can you generalize this solution to find the longest substring with at most K distinct characters?
3. What modifications are needed if we need to count all substrings that satisfy the uniqueness condition?

---

## Strengths

- Linear time complexity with clear two‑pointer logic.
- Uses standard library collections, making the code concise and readable.
- Handles all edge cases without extra conditionals.

---

## Weaknesses

- Relies on a HashSet which may have higher constant factors compared to an array for limited character sets.

---

## How To Improve

- Replace the HashSet with an int array of size 128 (or 256) for ASCII inputs to reduce overhead.
- Add early exit when maxNum reaches the remaining length of the string.

---

## Would This Pass a FAANG Interview?

Yes. The solution demonstrates a classic sliding‑window pattern with optimal O(n) time and O(min(n, charset)) space, and the candidate can discuss extensions and trade‑offs, which aligns with FAANG interview expectations.
