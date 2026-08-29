# Quick Revision

## Pattern Used

String

## Key Idea

Count uppercase letters and verify that they match one of the three allowed capital patterns.

## Important Observations

- Only three capital usage patterns are valid.
- A single character is always valid.
- Counting uppercase letters gives a constant‑time check after a linear scan.

## Formula

N/A

## Interview Tips

1. Mention the three valid patterns before presenting the code.
2. Emphasize O(n) time and O(1) space.
3. Show awareness of built‑in string methods as a concise alternative.

---

## Revision Questions

**Q1.** How would you modify the solution to handle Unicode letters beyond ASCII?

**Q2.** Can you solve the problem without converting the string to a char array?

**Q3.** What is the impact on performance if you use `toUpperCase()` and `toLowerCase()` on the whole string?

**Q4.** How would you extend the algorithm to support languages with different capitalisation rules?

**Q5.** Is it possible to solve this problem in a single pass without any extra variables besides the counter?

**Q6.** What would change if the definition of a valid capital usage allowed only the last character to be uppercase?

**Q7.** How does the solution behave for an empty string, and should that be considered valid?

**Q8.** Can you prove that counting uppercase letters is sufficient to cover all valid cases?

