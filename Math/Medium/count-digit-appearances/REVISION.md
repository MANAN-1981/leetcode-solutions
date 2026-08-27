# Quick Revision

## Pattern Used

Digit Extraction

## Key Idea

Use modulo 10 to get the last digit and integer division by 10 to remove it, iterating until the number is zero.

## Important Observations

- Integer division by 10 effectively shifts the decimal point one place to the left.
- Modulo 10 isolates the least significant digit.
- This method is more efficient than string conversion for large arrays.

## Formula

N/A

## Interview Tips

- Explain why you chose arithmetic over string conversion (performance/memory).
- Mention how you handle edge cases like zero and negative numbers.
- Discuss the time complexity in terms of the number of digits.

---

## Revision Questions

**Q1.** How would you modify this solution to handle negative numbers?

**Q2.** What is the time complexity if the numbers can be up to 10^9?

**Q3.** How would you solve this if the input was a stream of numbers instead of an array?

**Q4.** Can you optimize this if you need to count multiple digits at once?

**Q5.** What happens if the target digit is 0 and the number is 0?

**Q6.** How does this approach compare to using regular expressions on string representations?

**Q7.** Can you implement this recursively and analyze the stack space complexity?

**Q8.** How would you handle very large numbers that exceed the range of `int`?

