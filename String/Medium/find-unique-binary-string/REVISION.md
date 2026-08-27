# Quick Revision

## Pattern Used

Diagonalization

## Key Idea

Construct a string that differs from the i-th input string at the i-th position to guarantee uniqueness.

## Important Observations

- The number of possible binary strings of length n is 2^n, which is greater than n for n > 1.
- Equality of two strings requires matching at all positions.
- Flipping the diagonal characters ensures a mismatch at a specific position for each input string.

## Formula

N/A

## Interview Tips

- Explain the pigeonhole principle and why a unique string must exist.
- Describe the diagonalization process clearly, linking it to the index i.
- Mention that this approach is efficient and avoids brute-force generation.

---

## Revision Questions

**Q1.** Why does the diagonalization method guarantee that the resulting string is not in the input array?

**Q2.** How would you modify this solution if the input strings were of different lengths?

**Q3.** What is the time complexity of the hash set approach compared to the diagonalization approach?

**Q4.** Can this problem be solved using a trie, and what would be the complexity?

**Q5.** How would you handle the case where the input array is empty?

**Q6.** What is the relationship between this problem and Cantor's diagonal argument?

**Q7.** How would you optimize the space complexity of the diagonalization approach?

**Q8.** Can this approach be generalized to find a unique string in a set of k-ary strings?

