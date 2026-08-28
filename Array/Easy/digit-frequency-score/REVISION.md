# Quick Revision

## Pattern Used

HashTable

## Key Idea

Use a fixed‑size frequency array (acting as a hash map for digits 0‑9) to count occurrences, then compute Σ digit × frequency.

## Important Observations

- Digits are limited to 10 possible values, so a constant‑size array suffices.
- The result is simply the sum of all digits, regardless of order.
- Two‑pointer traversal of the frequency array is unnecessary; a single linear scan works.

## Formula

score = Σ_{d=0}^{9} d × freq[d]

## Interview Tips

Explain why a length‑10 array is effectively a hash map for this problem.,Mention that the two‑pointer loop is over‑engineered; a simple for‑loop is clearer.,State the time‑space trade‑off: O(log n) time, O(1) extra space.

---

## Revision Questions

**Q1.** How would the solution change if the input were provided as a string instead of an integer?

**Q2.** Can you compute the digit frequency score without using any extra data structures?

**Q3.** What is the impact on time and space complexity if the integer range is extended to 64‑bit?

**Q4.** How would you modify the algorithm to also return the most frequent digit?

**Q5.** If the problem asked for the product of digit and frequency instead of the sum, would the approach differ?

**Q6.** Why is a two‑pointer scan over the frequency array unnecessary here?

**Q7.** How would you handle negative numbers while preserving the definition of the score?

**Q8.** Can this problem be solved using recursion? What would be the pros and cons?

