# Quick Revision

## Pattern Used

HashTable

## Key Idea

Store friends in a hash set for constant‑time membership checks, then filter the order array in a single pass.

## Important Observations

- The relative order of friends must match their order in the original list.
- A set gives O(1) containment tests, reducing the nested loop.
- The result size is exactly friends.length, so we can pre‑allocate the array.

## Formula

N/A

## Interview Tips

1. Mention the naive O(n*m) solution first, then immediately propose the hash‑set optimization.
2. Emphasise preserving order by iterating the original array.
3. Clarify space‑time trade‑off: extra O(m) space for O(n) time.

---

## Revision Questions

**Q1.** How would you modify the solution if the friends list could contain duplicates?

**Q2.** Can you solve the problem in O(1) additional space?

**Q3.** What would change if the order array were a linked list instead of an array?

**Q4.** How would you handle the situation where the order array is extremely large and cannot fit into memory?

**Q5.** If you needed to return the positions of friends in the original order rather than the ids, how would you adapt the algorithm?

**Q6.** Explain why a HashMap of id→index is useful when you need to output friends sorted by their finishing position.

**Q7.** What is the impact on time complexity if the friends array is already sorted?

**Q8.** How would you extend the solution to support multiple queries of different friends lists on the same order array?

