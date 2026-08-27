# Quick Revision

## Pattern Used

Math

## Key Idea

The minimum number of operations to make the sum divisible by K is equal to the remainder of the sum when divided by K.

## Important Observations

- Each operation reduces the total sum by exactly 1.
- We need to reach the largest multiple of K that is less than or equal to the current sum.
- The difference between the current sum and that multiple is the remainder.

## Formula

operations = sum % k

## Interview Tips

- Clearly state that the problem reduces to a simple modulo operation.
- Explain why the two-pointer approach is used for summing (though a simple loop is more idiomatic).
- Mention that the time complexity is dominated by the sum calculation, not the modulo operation.

---

## Revision Questions

**Q1.** What if the operation was to increase an element by 1 instead of decrease?

**Q2.** How would you modify the solution if K could be negative?

**Q3.** Can you prove that sum % k is always the minimum number of operations?

**Q4.** What is the time complexity if K is very large, e.g., 10^9?

**Q5.** How would you handle the case where the array is empty?

**Q6.** Is there a way to calculate the sum without using a loop?

**Q7.** What if the array elements could be negative?

**Q8.** How would you optimize the space complexity if the array was extremely large?

