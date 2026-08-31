# Quick Revision

## Pattern Used

Math

## Key Idea

The core insight is that the digit sum and digit product can be computed in a single linear pass over the number's digits and their combination determines divisibility.

## Important Observations

- If any digit is 0, the product becomes 0, simplifying the divisor to the digit sum.
- For single‑digit n, divisor = n + n = 2n, so only n = 0 satisfies the condition.
- The number of iterations equals the number of digits, i.e., O(log10 n).

## Formula

n % (sumDigits(n) + productDigits(n)) == 0

## Interview Tips

1. Mention that you can extract digits using modulo and division, which runs in O(log n).
2. Discuss overflow concerns and how using long mitigates them.
3. Highlight that the algorithm uses O(1) extra space.

---

## Revision Questions

**Q1.** How does the presence of a zero digit affect the divisor and the final result?

**Q2.** Can the algorithm be adapted to work for numbers in bases other than 10?

**Q3.** What is the time complexity if the input is given as a string instead of an integer?

**Q4.** How would you modify the solution to return the divisor itself when the condition holds?

**Q5.** Is there any integer n for which sumDigits(n) + productDigits(n) equals 1? What does that imply?

**Q6.** How does integer overflow impact the correctness, and how would you prevent it?

**Q7.** Can you prove that for any n > 0, sumDigits(n) + productDigits(n) is always less than or equal to n?

**Q8.** What would be the effect of using a recursive digit‑processing approach on the call stack depth?

