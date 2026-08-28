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

1. How would you handle the case where the skyline constraints are provided as separate input arrays?
2. What would change if we needed to minimize the number of buildings that are increased?
3. Can you extend the solution to work for three‑dimensional skylines (e.g., a city block with height, width, depth)?

---

## Strengths

- Clear separation of concerns (computing row/col maxima then calculating increase).
- Optimal O(m·n) time and O(m+n) auxiliary space.
- Simple, easy‑to‑read implementation without side effects.

---

## Weaknesses

- Two separate passes for row and column maxima could be merged into one.
- Does not return the modified grid, which might be required in a variant.

---

## How To Improve

- Combine the row and column maximum calculations into a single traversal to reduce constant factors.
- Add input validation and handle edge cases explicitly for production‑level code.

---

## Would This Pass a FAANG Interview?

Yes. The solution demonstrates a solid grasp of greedy reasoning, optimal time/space analysis, and clean coding style, all of which are expected in FAANG interviews.
