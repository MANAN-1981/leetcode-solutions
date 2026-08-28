# Quick Revision

## Pattern Used

Sorting

## Key Idea

Sort both strings so that equal character multisets line up, then verify equality by direct comparison.

## Important Observations

- Sorting reduces the anagram check to a simple equality test.
- Two‑pointer comparison is equivalent to a linear scan but demonstrates symmetric checking.
- The approach works for any character set without extra data structures.

## Formula

N/A

## Interview Tips

1. Mention the O(n log n) time and why it's acceptable for the given constraints.
2. Be ready to discuss the O(n) counting‑array alternative.
3. Highlight that built‑in sort is highly optimized and reduces implementation errors.

---

## Revision Questions

**Q1.** How would the solution change if the strings could contain Unicode characters beyond the basic multilingual plane?

**Q2.** Can you achieve O(n) time without sorting? Explain the approach.

**Q3.** What is the impact of using a counting array versus a HashMap for this problem?

**Q4.** How would you modify the algorithm to handle case‑insensitive anagrams?

**Q5.** If the input strings are extremely large, what memory considerations arise?

**Q6.** Could you parallelize the sorting step? What challenges would you face?

**Q7.** How does the two‑pointer comparison affect performance compared to a simple linear scan?

**Q8.** In what scenarios would the sorting‑based approach be preferable over the counting‑array approach?

