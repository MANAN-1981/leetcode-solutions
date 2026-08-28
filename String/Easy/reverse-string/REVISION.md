# Quick Revision

## Pattern Used

TwoPointers

## Key Idea

Swap the characters at symmetric positions using two pointers that move towards each other, achieving an in‑place reversal.

## Important Observations

- The array can be reversed without any extra storage beyond a temporary variable.
- Only half of the elements need to be processed (n/2 swaps).
- The algorithm works for any mutable sequence of elements, not just characters.

## Formula

N/A

## Interview Tips

Explain the two‑pointer intuition before writing code.,Emphasize the O(1) extra‑space guarantee.,Mention that the loop runs at most n/2 iterations, reinforcing the linear time bound.

---

## Revision Questions

**Q1.** How would you modify the algorithm to reverse only a sub‑segment of the array?

**Q2.** Can you reverse the string in‑place using recursion without extra space? What is the call‑stack space complexity?

**Q3.** If the input were a singly linked list of characters, how would you reverse it in O(1) extra space?

**Q4.** What would change if the characters were stored in a read‑only memory region?

**Q5.** How does the algorithm handle Unicode surrogate pairs?

**Q6.** Can you generalize this two‑pointer technique to rotate an array?

**Q7.** What is the impact on cache performance compared to using an auxiliary array for reversal?

**Q8.** How would you adapt the solution for a stream of characters where you cannot store the whole array?

