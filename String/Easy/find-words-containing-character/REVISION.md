# Quick Revision

## Pattern Used

Linear Scan

## Key Idea

Check each word for the presence of the target character and record its index if found, breaking early upon discovery.

## Important Observations

- The order of indices in the result must match the order in the input array.
- Early termination in the inner loop improves efficiency.
- The problem is a simple filtering task based on a predicate.

## Formula

N/A

## Interview Tips

- Mention the time complexity and why it is optimal for this constraint.
- Highlight the use of `break` to optimize the inner loop.
- Discuss alternative approaches like using built-in string methods for conciseness.

---

## Revision Questions

**Q1.** How would you modify this solution to return the words themselves instead of their indices?

**Q2.** What if the input was a single large string and you needed to find all substrings containing the character?

**Q3.** How would you handle case-insensitive matching?

**Q4.** Can you optimize this further if the words were sorted by length?

**Q5.** What is the space complexity of the result list in the worst case?

**Q6.** How would you implement this using recursion?

**Q7.** What if the target character could be a regex pattern?

**Q8.** How would you handle null values in the words array?

