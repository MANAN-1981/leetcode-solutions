# Quick Revision

## Pattern Used

Math

## Key Idea

Repeatedly apply the Euclidean algorithm across array elements to collapse the problem to a single GCD value.

## Important Observations

- GCD is associative: gcd(a, b, c) = gcd(gcd(a, b), c).
- Sorting is unnecessary for a correct solution; it only adds overhead.
- The Euclidean algorithm runs in logarithmic time relative to the smaller operand.

## Formula

gcd(a, b) = gcd(b, a % b)

## Interview Tips

1. Emphasize the associative property of GCD to justify iterating over the array.
2. Mention the Euclidean algorithm’s logarithmic complexity.
3. Discuss edge‑case handling (zeros, single element).

---

## Revision Questions

**Q1.** Why is the Euclidean algorithm preferred over a brute‑force divisor check?

**Q2.** Can the GCD of an array be computed without sorting? Explain.

**Q3.** How does the presence of zero affect the GCD computation?

**Q4.** What is the time complexity of computing GCD iteratively over n numbers?

**Q5.** Is gcd(min, max) always equal to the GCD of the entire array? Provide a counterexample.

**Q6.** How would you modify the algorithm to work with very large integers beyond 32‑bit range?

**Q7.** Can the GCD be parallelized across sub‑arrays? What challenges arise?

**Q8.** Explain how the associative property of GCD enables a divide‑and‑conquer approach.

