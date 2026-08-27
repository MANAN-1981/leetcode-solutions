# Interview Review

| Category | Rating |
|----------|--------|
| Interview Readiness | ⭐⭐⭐⭐⭐ |
| Difficulty | ⭐⭐☆☆☆ |
| Optimization | ⭐⭐⭐⭐⭐ |
| Code Quality | ⭐⭐⭐⭐⭐ |
| Alternative Solutions | ⭐⭐⭐☆☆ |

---

## Common Follow-up Questions

1. How would you solve this if the input was a very large number represented as a string that cannot fit into a standard integer type?
2. What if you needed to find the k-th largest odd number from a list of such strings?
3. Can you extend this to find the largest number divisible by 3?
4. How would you handle the case where the input string is empty or null?

---

## Strengths

- Simple and efficient O(n) time complexity with O(1) space complexity.
- Clear and concise implementation with minimal code.
- Correctly handles all edge cases including no odd digits.

---

## Weaknesses

- Does not explicitly handle null input, which could lead to a NullPointerException.
- Could be slightly more readable with a helper method to check if a character is odd.

---

## How To Improve

- Add a null check at the beginning of the method to handle null input gracefully.
- Extract the odd-digit check into a separate private method for better readability and testability.
- Add comments to explain the greedy choice of scanning from right to left.

---

## Would This Pass a FAANG Interview?

Yes, this is a straightforward and optimal solution for an easy problem. It demonstrates a clear understanding of string manipulation and greedy algorithms. The code is clean and efficient, which is exactly what interviewers look for in easy problems.
