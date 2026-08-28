# Quick Revision

## Pattern Used

HashTable

## Key Idea

Convert the set of jewels into a constant‑time lookup structure, then count matching stones in a single pass.

## Important Observations

- The problem only asks for membership, not ordering, so a hash set is ideal.
- The size of the set is bounded by the length of the jewels string, not the stones.
- Character case matters; 'a' and 'A' are distinct.

## Formula

N/A

## Interview Tips

1. Mention the O(1) lookup property of hash sets early.
2. Discuss space trade‑offs versus using a fixed array for alphabetic inputs.
3. Clarify handling of empty inputs before coding.

---

## Revision Questions

**Q1.** How would the solution change if the input strings could contain Unicode characters beyond the basic multilingual plane?

**Q2.** Can you achieve O(1) additional space while still maintaining linear time?

**Q3.** What would be the impact on performance if the jewels string were extremely large compared to stones?

**Q4.** How would you adapt the algorithm if you needed to return the list of matching stones instead of just the count?

**Q5.** If the characters were digits (0‑9) only, what is the most space‑efficient representation for jewels?

**Q6.** Explain why sorting both strings and using two pointers still yields O(n log n) time.

**Q7.** How would you modify the code to handle case‑insensitive matching?

**Q8.** What are the trade‑offs between using a HashSet<Character> versus a BitSet for this problem?

