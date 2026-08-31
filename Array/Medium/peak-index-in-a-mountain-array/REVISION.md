# Quick Revision

## Pattern Used

Binary Search

## Key Idea

Leverage the monotonic increase then decrease property of a mountain array to decide the direction of the peak using a single comparison.

## Important Observations

- The array is strictly increasing before the peak and strictly decreasing after it.
- Comparing a[mid] with its right neighbor is enough to know which side the peak lies on.
- The search interval can be safely reduced to a single element, which will be the peak.

## Formula

N/A

## Interview Tips

Explain the unimodal property first, then show how a single comparison guides the binary search. Emphasize that the loop invariant maintains the peak inside [l, r]. Mention the O(log n) advantage over a linear scan.

---

## Revision Questions

**Q1.** Why does comparing arr[mid] with arr[mid+1] suffice, and could we compare with arr[mid-1] instead?

**Q2.** How would the algorithm change if the array allowed plateaus (equal adjacent values)?

**Q3.** Can you prove that the loop terminates with l == r at the peak index?

**Q4.** What would happen if we used l <= r as the loop condition?

**Q5.** How does the algorithm behave on the smallest valid mountain array [0,1,0]?

**Q6.** Is it possible to solve this problem with O(1) time using any additional information?

**Q7.** How would you adapt the solution to find the peak in a bitonic array that may not be strictly increasing then decreasing?

**Q8.** What are the trade‑offs between binary search and ternary search for unimodal sequences?

