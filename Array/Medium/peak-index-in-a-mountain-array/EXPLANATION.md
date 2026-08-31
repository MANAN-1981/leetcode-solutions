# Problem Explanation

## Algorithm Overview

The algorithm treats the mountain array as a unimodal sequence and applies binary search. At each step it checks whether the current middle element is on the rising slope or the descending slope by comparing it with the element to its right, then discards the half that cannot contain the peak.

---

## Step-by-Step Explanation

1. Set l = 0 and r = arr.length - 1.
2. While l < r, compute mid = l + (r - l) / 2.
3. If arr[mid] < arr[mid + 1], the peak lies to the right, so set l = mid + 1.
4. Otherwise the peak is at mid or to the left, so set r = mid.
5. When the loop ends, l == r and points to the peak index.
6. Return l.

---

## Why This Works

In a mountain array, elements increase up to the peak and then decrease. If arr[mid] < arr[mid+1], we are on the increasing side, so the peak must be right of mid. Otherwise we are on the decreasing side or at the peak, so the peak is at mid or left. This invariant halves the search space each iteration, guaranteeing convergence.

---

## Edge Cases

- The array must have at least three elements (the smallest valid mountain).
- The peak can never be at index 0 or the last index, so the algorithm never accesses out‑of‑bounds neighbors.
- All values are within int range, so overflow is not a concern for the comparisons.

---

## Alternative Approaches

A simple linear scan from left to right stops when a[i] > a[i+1] and returns i, which is O(n). A ternary search can also be used on the unimodal property, but it performs more comparisons and offers no practical benefit over binary search.

---

## Common Mistakes

- Accessing arr[mid-1] or arr[mid+1] without ensuring the index is inside bounds.
- Using a <= condition in the loop, which can cause an infinite loop when l and r converge.
- Returning r (or mid) after the loop without confirming l == r, leading to an off‑by‑one error.
