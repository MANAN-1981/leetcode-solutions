# Quick Revision

## Pattern Used

Sorting and Two Pointers

## Key Idea

Maximize the value by placing '1's at the most significant positions, while strictly reserving the least significant position for a '1' to ensure the number is odd.

## Important Observations

- The relative order of '0's and '1's doesn't matter for the count, only their positions.
- The last digit must be '1'.
- All other '1's should be as far left as possible.

## Formula

N/A

## Interview Tips

- Explain why the last bit must be 1.
- Discuss the time complexity of sorting vs counting.
- Show how the two-pointer swap effectively bubbles '1's to the front.

---

## Revision Questions

**Q1.** What is the time complexity of this solution? Can it be improved?

**Q2.** How would you modify this solution to find the minimum odd binary number?

**Q3.** What if the input string contains characters other than '0' and '1'?

**Q4.** Can you solve this in O(n) time and O(1) space?

**Q5.** Why do we start the right pointer at length - 2 instead of length - 1?

**Q6.** What happens if the input string is already the maximum odd binary number?

**Q7.** How does this approach change if we wanted the maximum even binary number?

**Q8.** What is the maximum possible value of the resulting number for a given length n?

