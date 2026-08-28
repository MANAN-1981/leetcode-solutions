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

1. How would you adapt the solution for case‑insensitive matching?
2. What if you needed to return the positions of the character within each word?
3. Can you achieve the same result using functional programming constructs in Java?

---

## Strengths

- Simple and easy to understand.
- Early break reduces unnecessary work.
- Uses only O(1) extra space.

---

## Weaknesses

- Does not handle null inputs gracefully.
- Repeated scanning if many queries are required.

---

## How To Improve

- Add input validation for null arrays.
- Consider building a character‑to‑indices map if multiple queries are expected.

---

## Would This Pass a FAANG Interview?

Yes. The solution is correct, runs in optimal linear time for a single query, and is cleanly written—qualities interviewers at FAANG companies look for for an Easy‑level problem.
