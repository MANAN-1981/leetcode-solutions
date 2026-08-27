# Quick Revision

## Pattern Used

Greedy with Two Pointers

## Key Idea

Always match the weakest player with the weakest trainer who can handle them to maximize the number of pairs.

## Important Observations

- Sorting is essential to enable the greedy two-pointer approach.
- If a trainer cannot handle the current player, they cannot handle any subsequent (stronger) players.
- The order of processing matters; we must process from weakest to strongest.

## Formula

N/A

## Interview Tips

- Clearly state why the greedy choice is safe (exchange argument).
- Mention the time complexity trade-off of sorting vs. the linear scan.
- Be prepared to explain why a brute force O(N*M) approach fails.

---

## Revision Questions

**Q1.** What happens if we sort players in ascending order but trainers in descending order?

**Q2.** Can we solve this without sorting using a different data structure? What would be the complexity?

**Q3.** How would you modify this solution if each trainer could train multiple players up to a certain limit?

**Q4.** What if the goal was to maximize the sum of strengths of matched pairs instead of the count?

**Q5.** Is the greedy choice always optimal for matching problems? Give a counter-example if not.

**Q6.** How does the space complexity change if we cannot modify the input arrays?

**Q7.** What is the worst-case scenario for the number of iterations in the while loop?

**Q8.** Can this problem be modeled as a bipartite graph matching problem? How would that solution compare?

