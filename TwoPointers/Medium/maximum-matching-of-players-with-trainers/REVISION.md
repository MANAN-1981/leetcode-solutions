# Quick Revision

## Pattern Used

Greedy

## Key Idea

Always pair the currently weakest unmatched player with the weakest trainer that can still train them.

## Important Observations

- Sorting creates a total order that lets us compare weakest elements directly.
- If a trainer cannot train the current weakest player, they cannot train any later (stronger) player, so they are discarded.
- The number of matches cannot exceed the size of the smaller array.

## Formula

N/A

## Interview Tips

1. State the exchange argument to prove optimality.
2. Emphasize the O(n log n) sorting cost and O(1) extra space.
3. Mention how the two‑pointer technique naturally follows the greedy choice.

---

## Revision Questions

**Q1.** Why does matching the weakest player first guarantee an optimal solution?

**Q2.** Can this problem be solved without sorting? If so, what would be the trade‑off?

**Q3.** How would the algorithm change if each trainer could train at most k players?

**Q4.** What if a trainer could train a player only if the difference between their abilities is at most d?

**Q5.** How would you adapt the solution for streaming input where players arrive one by one?

**Q6.** Is there a scenario where a different greedy ordering (e.g., strongest first) fails?

**Q7.** How does the time complexity change if the input arrays are already sorted?

**Q8.** Can you extend the solution to return the actual matched pairs, not just the count?

