# Quick Revision

## Pattern Used

Brute Force

## Key Idea

Scan from 1 upward and stop at the first pair where neither number contains the digit zero.

## Important Observations

- Any positive integer can be expressed as a sum of two positive integers.
- At least one valid pair exists for every n ≥ 2.
- Checking for a zero digit is O(log k) where k is the number being checked, which is negligible compared to the linear scan.

## Formula

N/A

## Interview Tips

1. Mention the guarantee of existence before coding.
2. Explain the zero‑digit check using string conversion or modular arithmetic.
3. Emphasize the O(n) time and O(1) space simplicity.

---

## Revision Questions

**Q1.** Why does a solution always exist for n ≥ 2?

**Q2.** Can you implement the zero‑digit check without converting to a string? How would that affect complexity?

**Q3.** How would you modify the algorithm if the numbers were required to be non‑negative instead of positive?

**Q4.** What is the worst‑case number of iterations before finding a pair?

**Q5.** If n were up to 10^9, would the linear scan still be acceptable? Why or why not?

**Q6.** How could you use a pre‑computed list of no‑zero numbers to improve average performance?

**Q7.** Is there any benefit to iterating from the middle (n/2) outward instead of from 1?

**Q8.** How would you adapt the solution for a language without built‑in string conversion?

