# Quick Revision

## Pattern Used

Sliding Window

## Key Idea

Maintain a dynamic window of unique characters and shrink it only when a duplicate appears, updating the maximum window size along the way.

## Important Observations

- Each character enters and leaves the set at most once, guaranteeing O(n) time.
- The left pointer never moves backward, preserving linear progression.
- The HashSet provides O(1) checks for duplicates.

## Formula

N/A

## Interview Tips

1. Emphasize the two‑pointer invariant that the window always has distinct characters.
2. Mention that the HashSet (or map) gives constant‑time membership checks.
3. Discuss how the algorithm can be adapted to return the substring itself, not just its length.

---

## Revision Questions

**Q1.** How would the algorithm change if the input could contain Unicode code points beyond the BMP?

**Q2.** Can you modify the solution to also return the actual longest substring, not just its length?

**Q3.** What is the impact on time and space complexity if the character set size is unbounded?

**Q4.** How would you adapt the approach for a stream of characters where the total length is unknown upfront?

**Q5.** Is it possible to solve the problem with O(1) extra space? Why or why not?

**Q6.** How does the sliding window technique differ from a brute‑force O(n^2) enumeration of substrings?

**Q7.** If you were to use an array instead of a HashSet, what assumptions about the input would you need?

**Q8.** Explain how the algorithm ensures that each character is processed at most twice.

