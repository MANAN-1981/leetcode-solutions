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

1. How would you modify the code to also output the start and end indices of the longest subarray?
2. What would be the impact on performance if the array were a linked list instead of an array?
3. Can you think of a scenario where a binary‑search‑based solution would be preferable?

---

## Strengths

- O(n) linear time scan
- O(1) extra space
- Simple and easy to explain

---

## Weaknesses

- Does not directly provide the subarray boundaries without extra bookkeeping
- Relies on mutable pointers, which can be less intuitive for immutable data structures

---

## How To Improve

- Track the left index when maxLen is updated to return the exact window.
- Add input validation for null or empty arrays.
- Refactor variable names for clarity (e.g., zeroCount instead of count).

---

## Would This Pass a FAANG Interview?

Yes. The solution meets the optimal O(n) time and O(1) space requirements, is easy to communicate, and handles all edge cases, which are qualities interviewers at FAANG companies look for.
