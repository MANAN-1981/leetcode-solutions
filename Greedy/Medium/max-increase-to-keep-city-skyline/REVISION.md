# Quick Revision

## Pattern Used

Greedy

## Key Idea

Each building can be independently raised to the minimum of its row's and column's skyline limits, guaranteeing maximal total increase without affecting the skyline.

## Important Observations

- The skyline from each direction is determined solely by the maximum in each row or column.
- Raising a building above min(rowMax, colMax) would create a new skyline peak.
- Increases for different cells are independent, allowing a greedy per‑cell computation.

## Formula

N/A

## Interview Tips

Explain the skyline concept first, then show how row and column maxima define the constraints.,Emphasize that the problem decomposes into independent per‑cell decisions, justifying the greedy approach.,Mention the O(m·n) time and O(m+n) space as optimal for this problem.

---

## Revision Questions

**Q1.** Why does the minimum of rowMax and colMax give the highest safe height for a cell?

**Q2.** Can the solution be adapted if the skyline is defined by the sum of heights instead of the maximum?

**Q3.** How would the algorithm change if we were allowed to decrease building heights as well?

**Q4.** What is the impact on time/space complexity if the grid size is extremely large (e.g., 10^5 x 10^5) and sparse?

**Q5.** Is it possible to solve the problem in O(1) extra space? Why or why not?

**Q6.** How would you modify the solution to also return the final grid after the increases?

**Q7.** If the skyline constraints were given as explicit arrays rather than derived from the grid, how would the algorithm differ?

**Q8.** Can you prove that the greedy per‑cell increase yields a globally optimal total increase?

