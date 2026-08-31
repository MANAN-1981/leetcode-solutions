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

1. How would you modify the code to handle a mountain array with duplicate values?
2. Can you extend this approach to find the peak in a 2‑D mountain matrix?
3. What is the time‑space trade‑off if you were to store prefix maxima?

---

## Strengths

- Runs in logarithmic time, optimal for this problem.
- Uses only constant extra space.
- Simple and easy to reason about during an interview.

---

## Weaknesses

- Assumes the input strictly follows the mountain definition; no validation is performed.

---

## How To Improve

- Add input validation to return an error for non‑mountain arrays.
- Include comments clarifying the loop invariant for future readers.
- Consider handling edge cases where the array length is less than 3.

---

## Would This Pass a FAANG Interview?

Yes. The solution is concise, runs in O(log n) time with O(1) space, demonstrates mastery of binary search on unimodal arrays, and is easy to explain, which aligns with FAANG interview expectations.
