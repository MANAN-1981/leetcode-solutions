# Quick Revision

## Pattern Used

Greedy

## Key Idea

The largest odd number is the longest prefix of the input string that ends with an odd digit. Finding the rightmost odd digit ensures the maximum length and thus the maximum value.

## Important Observations

- A number is odd if and only if its last digit is odd.
- To maximize a number, we want to preserve the most significant digits (leftmost).
- Scanning from right to left allows us to find the optimal cut-off point in a single pass.

## Formula

N/A

## Interview Tips

- Start by explaining why the last digit determines the parity of the number.
- Justify why we want the longest possible prefix (larger numbers have more digits).
- Mention that the solution is optimal because it requires only one pass through the string.

---

## Revision Questions

**Q1.** What if the problem asked for the largest even number instead? How would the logic change?

**Q2.** How would you modify the solution if the input was a list of integers instead of a string?

**Q3.** Can this problem be solved in O(1) time? Why or why not?

**Q4.** What is the time complexity if the string is extremely long (e.g., 10^6 characters)?

**Q5.** How would you handle negative numbers if the input could be negative?

**Q6.** What if the input string contains non-digit characters? How would you validate the input?

**Q7.** Can you prove that the greedy approach (taking the longest prefix ending in an odd digit) always yields the largest odd number?

**Q8.** How would you optimize the space complexity if the string was immutable and substring creation was expensive?

