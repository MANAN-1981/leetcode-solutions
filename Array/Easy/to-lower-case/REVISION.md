# Quick Revision

## Pattern Used

String

## Key Idea

Utilize the language's built‑in case conversion method, which abstracts the per‑character transformation.

## Important Observations

- `toLowerCase()` handles both ASCII and Unicode.
- It creates a new string, so original input remains unchanged.
- Time and space are linear in the length of the input.

## Formula

N/A

## Interview Tips

1. Mention that you rely on the standard library for correctness and readability.
2. Explain the underlying O(n) behavior.
3. Discuss Unicode considerations if asked.

---

## Revision Questions

**Q1.** How does Java's `toLowerCase()` handle locale‑specific case mappings?

**Q2.** What is the time and space complexity if you modify a character array in place instead of using `toLowerCase()`?

**Q3.** Can you convert a string to lower case without allocating additional memory? Why or why not?

**Q4.** How would you handle a scenario where only ASCII characters need to be converted?

**Q5.** What are the differences between `toLowerCase()` and `toLowerCase(Locale)`?

**Q6.** If the input string is extremely large (e.g., gigabytes), what practical concerns arise?

**Q7.** How does Unicode normalization affect case conversion?

**Q8.** Is it ever beneficial to write a custom lower‑case conversion function in production code?

