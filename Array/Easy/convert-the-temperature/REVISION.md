# Quick Revision

## Pattern Used

Array

## Key Idea

Apply the two linear conversion formulas directly and place the results into a fixed‑size array.

## Important Observations

- The problem only requires constant‑time arithmetic; no iteration is needed.
- Floating‑point precision is sufficient for the given ranges.
- The order of results (Kelvin first, Fahrenheit second) is part of the specification.

## Formula

Kelvin = Celsius + 273.15; Fahrenheit = Celsius * 9/5 + 32

## Interview Tips

Mention the linear nature of the conversions, emphasize constant‑time execution, and clarify the output order before coding.

---

## Revision Questions

**Q1.** Why is it safe to use double arithmetic for these temperature conversions?

**Q2.** What would happen if you mistakenly used integer division for the Fahrenheit multiplier?

**Q3.** How would you modify the solution if the required output format changed to a List<Double>?

**Q4.** Can you think of a scenario where rounding errors might affect the result noticeably?

**Q5.** If the problem asked for conversion to Rankine instead of Fahrenheit, what formula would you use?

**Q6.** How would you test the function for extreme temperature values?

**Q7.** Is there any advantage to using Math.addExact or Math.multiplyExact here?

**Q8.** What would be the impact on time and space complexity if you had to convert an array of Celsius values?

