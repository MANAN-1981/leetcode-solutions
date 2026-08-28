# Quick Revision

## Pattern Used

TwoPointers

## Key Idea

Normalize the string and then compare mirrored characters using two pointers moving inward.

## Important Observations

- Non‑alphanumeric characters do not affect palindrome property.
- Case is irrelevant, so lower‑casing simplifies comparison.
- Two pointers guarantee O(n) time with a single pass.

## Formula

N/A

## Interview Tips

Explain the preprocessing step first, then describe the two‑pointer scan.,Mention the trade‑off between simplicity (using regex) and optimal space (in‑place scan).,State the time and space complexities clearly.

---

## Revision Questions

**Q1.** How would you adapt the solution to handle Unicode letters beyond the ASCII range?

**Q2.** Can you achieve O(1) extra space without creating a cleaned copy of the string?

**Q3.** What would change if the definition of palindrome ignored only punctuation but kept spaces?

**Q4.** How does the algorithm behave for extremely long strings that exceed available memory?

**Q5.** If the input were a stream of characters, how could you determine palindrome status?

**Q6.** What is the impact of using StringBuilder instead of a char array for the cleaned string?

**Q7.** How would you modify the solution to return the longest palindromic substring instead?

**Q8.** Can you prove that checking only half of the characters is sufficient?

