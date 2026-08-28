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

1. How would you solve the problem if the subarray length could vary?
2. What if the input array is streamed and you cannot store it entirely in memory?
3. Can you achieve the same result using a deque or other data structure?

---

## Strengths

- Runs in linear time with constant extra space.
- Simple and easy to explain during an interview.
- Handles negative numbers and edge cases correctly.

---

## Weaknesses

- Uses double division inside the loop, which could be avoided by comparing sums directly.

---

## How To Improve

- Compare sums multiplied by k to avoid repeated floating‑point division.
- Use a long for the running sum to prevent overflow before casting to double.
- Add input validation for k <= 0 or k > nums.length.

---

## Would This Pass a FAANG Interview?

Yes. The solution demonstrates a classic sliding‑window technique with O(n) time and O(1) space, which is exactly what top tech companies expect for this easy‑level problem.
