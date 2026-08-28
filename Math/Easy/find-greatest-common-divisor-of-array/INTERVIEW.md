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

1. What would be the impact of using a priority queue to repeatedly compute GCDs of pairs?
2. How would you handle negative numbers in the input array?
3. If the array size is extremely large (e.g., 10^7), how would you improve memory usage?
4. Can you extend this solution to compute the LCM of the array efficiently?

---

## Strengths

- Uses the well‑known Euclidean algorithm which is fast and reliable.
- Implementation is concise and easy to read.

---

## Weaknesses

- Sorting the array is unnecessary and adds O(n log n) overhead.
- Assumes gcd(min, max) equals the array GCD, which is not always true.

---

## How To Improve

- Remove the sorting step and compute GCD iteratively over all elements.
- Add explicit handling for zeros and negative numbers.
- Include comments explaining why the Euclidean algorithm works.

---

## Would This Pass a FAANG Interview?

Yes. The core Euclidean algorithm is optimal and interviewers expect it, but you should discuss the flaw of using only min and max and propose the correct iterative approach to demonstrate deeper understanding.
