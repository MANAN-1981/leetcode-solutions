# Quick Revision

## Pattern Used

Greedy

## Key Idea

Make the cheapest candy in every group of three free by always paying for the two most expensive ones.

## Important Observations

- After sorting, the cheapest candy of any three consecutive items is the one that can be taken for free.
- Processing from the largest to smallest guarantees each free candy is the smallest in its group.
- Only two out of every three items contribute to the total cost.

## Formula

N/A

## Interview Tips

1. State the greedy intuition before showing the code.
2. Emphasize the proof that skipping the smallest in each sorted triple is optimal.
3. Mention the O(n log n) bound and possible O(n) counting‑sort improvement.

---

## Revision Questions

**Q1.** Why does sorting the array guarantee an optimal grouping for the discount?

**Q2.** Can the algorithm be adapted if the discount applies to every fourth candy instead of the third?

**Q3.** How would you modify the solution to handle prices that exceed the range of 32‑bit integers?

**Q4.** What is the time‑space trade‑off when using counting sort versus the built‑in sort?

**Q5.** If the discount rule changed to "buy two, get the cheaper one free", how would the algorithm change?

**Q6.** Is it possible to solve the problem in a single pass without sorting? Why or why not?

**Q7.** How does the solution behave when all candy prices are zero?

**Q8.** Can you prove that any solution that does not skip the smallest in each triple cannot be cheaper?

