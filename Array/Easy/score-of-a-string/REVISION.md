# Quick Revision

## Pattern Used

Array

## Key Idea

Sum the absolute differences of each consecutive character pair in a single linear pass.

## Important Observations

- The problem reduces to a simple prefix‑sum without storing intermediate values.
- Char subtraction yields the Unicode code‑point difference, which is what the problem expects.
- No extra data structures are required; only a scalar accumulator is needed.

## Formula

Score = Σ_{i=1}^{n-1} |code(s[i]) - code(s[i-1])|

## Interview Tips

1. State the definition of the score first, then map it directly to a loop.
2. Emphasize O(n) time and O(1) space, and mention why no extra storage is needed.
3. Mention handling of edge cases like length 0 or 1.

---

## Revision Questions

**Q1.** How would the solution change if the score were defined as the sum of squared differences instead of absolute differences?

**Q2.** Can you compute the score in parallel for very large strings? What challenges arise?

**Q3.** What would be the impact on time and space complexity if you needed to support Unicode surrogate pairs?

**Q4.** How would you modify the algorithm to return the maximum sub‑score of any contiguous substring?

**Q5.** If the input were a stream of characters rather than a known‑length string, how would you adapt the solution?

**Q6.** Is there any scenario where using a long accumulator is necessary instead of int?

**Q7.** How does the solution behave when the string contains characters with negative code points (if any language permits)?

**Q8.** Can you prove that a single pass is sufficient and no dynamic programming is required?

