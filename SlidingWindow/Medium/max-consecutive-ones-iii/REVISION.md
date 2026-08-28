# Quick Revision

## Pattern Used

SlidingWindow

## Key Idea

Maintain a window that contains at most k zeros and slide it to maximize its length.

## Important Observations

- The window can contain at most k zeros.
- Expanding the right end never decreases the number of zeros.
- When zeros exceed k, we must shrink from the left.

## Formula

N/A

## Interview Tips

State the invariant (≤ k zeros) clearly, and show how the left pointer restores it when violated. Emphasize that each element is processed O(1) times.

---

## Revision Questions

**Q1.** How would the solution change if you could flip at most k ones to zeros instead?

**Q2.** Can you adapt the algorithm to return the actual subarray indices, not just its length?

**Q3.** What is the time complexity if the input array is streamed and you cannot store it entirely?

**Q4.** How would you solve the problem if the array is circular?

**Q5.** Could you solve it using a binary search on the answer length? Explain the approach.

**Q6.** How does the algorithm behave when k equals the array length?

**Q7.** If the array contains negative numbers representing “cost” of flipping, how would you modify the solution?

**Q8.** Compare this sliding‑window solution with a DP solution in terms of time and space.

