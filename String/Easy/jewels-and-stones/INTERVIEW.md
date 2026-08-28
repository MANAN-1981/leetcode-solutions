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

1. How would you handle the scenario where the input strings are streamed and cannot be stored entirely in memory?
2. Can you think of a way to solve the problem without any extra data structures?
3. What would you change if the number of distinct jewel types could be up to 10^5?

---

## Strengths

- Simple, readable code with clear intent.
- Runs in linear time and uses minimal extra space.

---

## Weaknesses

- Relies on Java's autoboxing of char to Character, which adds a small overhead.

---

## How To Improve

- Use a primitive boolean array for alphabetic inputs to avoid boxing.
- Add early returns for empty input strings to make the code marginally faster.

---

## Would This Pass a FAANG Interview?

Yes. The solution demonstrates correct use of a hash‑based lookup, runs in optimal linear time, and is easy to explain, all of which meet the expectations for an Easy‑level LeetCode problem in a FAANG interview.
