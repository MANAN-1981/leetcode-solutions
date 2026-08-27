# Quick Revision

## Pattern Used

Frequency Counting

## Key Idea

Decompose the number into digits, count their occurrences, and compute the weighted sum based on the digit values.

## Important Observations

- The base-10 representation allows easy extraction of digits using modulo and division.
- The range of digits is fixed (0-9), allowing for a constant-size frequency array.
- The score is a linear combination of digits and their frequencies.

## Formula

Score = Σ (d_i * count(d_i)) for all d_i in {0, 1, ..., 9}

## Interview Tips

- Explain why a frequency array is used instead of a HashMap (fixed small range).
- Discuss the time complexity in terms of the number of digits, O(log n).
- Mention that the two-pointer loop is stylistic here; a simple for-loop would also work and might be clearer.

---

## Revision Questions

**Q1.** How would you modify this solution to handle negative integers?

**Q2.** Can you solve this without using any extra space (other than the input variable)?

**Q3.** What is the maximum possible score for an integer of length k?

**Q4.** How would you adapt this to find the most frequent digit instead of the sum?

**Q5.** Is the two-pointer approach necessary here, or is it over-engineering? Why?

**Q6.** How does the time complexity change if n is given as a string instead of an integer?

**Q7.** What happens if n is 0? Does the current code handle it correctly according to the problem statement?

**Q8.** Can you generalize this to base B instead of base 10?

