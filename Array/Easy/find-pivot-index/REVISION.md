# Quick Revision

## Pattern Used

PrefixSum

## Key Idea

The sum of elements to the right of an index can be derived from the total sum and the sum of elements to the left, avoiding the need to recalculate sums from scratch for each index.

## Important Observations

- The sum of the left side plus the sum of the right side plus the current element equals the total sum of the array.
- Recalculating sums from scratch for each index leads to O(n^2) complexity.
- A single pass with a running sum allows O(n) complexity.

## Formula

rightSum = totalSum - leftSum - arr[i]

## Interview Tips

- Start by explaining the brute force approach and its O(n^2) complexity.
- Propose the optimization using the total sum to derive the right sum in O(1) per step.
- Mention the space complexity improvement from O(n) recursion stack to O(1) auxiliary space.

---

## Revision Questions

**Q1.** How would you modify the solution to find all pivot indices instead of just the first one?

**Q2.** What is the impact of using recursion for summing on the space complexity and potential runtime errors?

**Q3.** Can you solve this problem in O(1) space without using the total sum trick?

**Q4.** How would the solution change if the array was a linked list instead of an array?

**Q5.** What is the time complexity of the recursive sum functions in the worst case?

**Q6.** How can you handle integer overflow if the array contains very large numbers?

**Q7.** Is it possible to solve this problem using a sliding window technique?

**Q8.** How would you adapt this solution to find the index where the left sum is exactly twice the right sum?

