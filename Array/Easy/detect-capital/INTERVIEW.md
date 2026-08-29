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

1. How would you handle Unicode characters that have case mappings?
2. What are the trade‑offs between using built‑in string methods versus manual character checks?
3. Can you think of a way to solve the problem using regular expressions?

---

## Strengths

- Simple and easy to understand logic
- O(n) time with O(1) extra space
- Handles all edge cases explicitly

---

## Weaknesses

- Relies on a helper method for uppercase check, which could be inlined
- Does not handle empty strings explicitly

---

## How To Improve

- Add an early return for empty strings to define expected behavior.
- Replace the helper method with `Character.isUpperCase` directly for brevity.
- Consider using built‑in string comparisons to reduce manual counting.

---

## Would This Pass a FAANG Interview?

Yes. The solution meets the required time and space constraints, clearly addresses all edge cases, and demonstrates a solid understanding of string manipulation—qualities valued in FAANG interviews.
