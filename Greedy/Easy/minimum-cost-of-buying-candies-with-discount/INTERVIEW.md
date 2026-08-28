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

1. How would you handle the case where the price values are extremely large and might cause integer overflow?
2. Can you achieve O(n) time without extra space if the price range is bounded?
3. What modifications are needed if the discount applies to every k‑th candy instead of every third?

---

## Strengths

- Simple and easy to understand implementation.
- Runs in O(n log n) time which meets the constraints for typical input sizes.

---

## Weaknesses

- Relies on sorting; not optimal when the price range is small and counting sort could be linear.

---

## How To Improve

- Implement counting sort for bounded price ranges to achieve O(n) time.
- Use long for the accumulator to avoid overflow on extreme inputs.

---

## Would This Pass a FAANG Interview?

Yes. The solution demonstrates clear greedy reasoning, correct handling of edge cases, and acceptable time/space complexity for the problem constraints, which are all qualities interviewers at FAANG look for.
