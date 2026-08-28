# Quick Revision

## Pattern Used

Sliding Window

## Key Idea

Maintain a running sum of a fixed‑size window and update it in O(1) as the window slides, allowing constant‑time average computation.

## Important Observations

- The average of a subarray depends only on its sum; the window size is constant.
- Updating the sum requires only the element exiting and the element entering the window.
- The maximum average is the maximum of these computed averages.

## Formula

average = sum / k

## Interview Tips

1. Mention that you keep the sum as a double (or long) to avoid overflow and integer division issues.
2. Explain the sliding‑window invariant: the window always contains exactly k elements.
3. State the time/space complexity up front to show you understand the efficiency.

---

## Revision Questions

**Q1.** How would the solution change if the subarray length could be any value up to k?

**Q2.** Why is it safe to update the sum with subtraction and addition instead of recomputing it each time?

**Q3.** What would happen if k is larger than the array length?

**Q4.** Can this algorithm be adapted to find the subarray with maximum sum instead of average?

**Q5.** How would you modify the code to handle very large input values without overflow?

**Q6.** Is there any benefit to using a prefix‑sum array for this specific problem?

**Q7.** What is the time complexity if you used a nested loop to compute each subarray sum?

**Q8.** How would you extend this approach to a 2‑dimensional matrix to find a sub‑matrix of fixed area with maximum average?

