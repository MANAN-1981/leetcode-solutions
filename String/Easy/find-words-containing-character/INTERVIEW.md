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

1. How would you handle case-insensitive matching?
2. What if you needed to return the count of occurrences instead of indices?
3. Can you solve this using a single pass without nested loops?
4. How would you handle very large input arrays efficiently?

---

## Strengths

- Clear and readable code structure.
- Efficient use of early termination in the inner loop.
- Correct handling of edge cases.

---

## Weaknesses

- Could be more concise using built-in string methods.
- No handling of potential null values in the input array.

---

## How To Improve

- Add null checks for the input array and individual words.
- Consider using `String.indexOf()` for a more idiomatic Java solution.
- Add comments to explain the logic for clarity.

---

## Would This Pass a FAANG Interview?

Yes, this is a straightforward problem and the solution is correct and efficient. The code is clean and easy to understand, which is important for an interview. However, adding null checks and discussing alternative approaches would make it even stronger.
