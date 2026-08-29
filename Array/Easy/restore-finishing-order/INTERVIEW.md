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

1. Can you improve the time complexity without using extra space?
2. What if the input size is in the order of 10^7, would your solution still be acceptable?
3. How would you adapt the algorithm if the order array is streamed in real time?

---

## Strengths

- Simple and easy to understand implementation.
- Preserves the original relative order of friends.

---

## Weaknesses

- Nested loops lead to O(n*m) time, which is sub‑optimal for large inputs.

---

## How To Improve

- Replace the inner linear scan with a HashSet for O(1) look‑ups.
- Add input validation to handle cases where a friend does not appear in the order.

---

## Would This Pass a FAANG Interview?

Yes. The core idea is correct and the code is clean; with a quick mention of the hash‑set optimization, it meets the performance expectations for an Easy‑level problem in a FAANG interview.
