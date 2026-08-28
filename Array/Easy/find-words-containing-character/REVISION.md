# Quick Revision

## Pattern Used

Array

## Key Idea

Linearly scan each word and stop at the first match, recording the word's index.

## Important Observations

- The inner loop can exit early, reducing work for words that contain x early.
- The result list size is at most the number of words.
- The algorithm is case‑sensitive and relies on direct character comparison.

## Formula

N/A

## Interview Tips

1. Emphasize early termination to show awareness of constant‑factor optimizations.
2. Mention that the solution is O(N·L) and cannot be improved without additional preprocessing.
3. Discuss how you would adapt it for Unicode or case‑insensitive matching.

---

## Revision Questions

**Q1.** How would the solution change if the input were a list of sentences and you needed word indices containing the character?

**Q2.** Can you modify the algorithm to return the indices in descending order without extra sorting?

**Q3.** What would be the impact on time complexity if you pre‑computed a map from characters to word indices?

**Q4.** How would you handle Unicode surrogate pairs where a character may be represented by two char values?

**Q5.** If the array were extremely large and did not fit in memory, how could you process it?

**Q6.** Is there a way to achieve O(N) total time regardless of word length?

**Q7.** How would you extend the solution to support multiple query characters efficiently?

**Q8.** What are the trade‑offs between using a HashSet per word versus scanning the char array directly?

