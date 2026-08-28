# Problem Explanation

## Algorithm Overview

Read the Celsius value, apply the Kelvin formula (C + 273.15) and the Fahrenheit formula (C * 9/5 + 32), store the results in an array, and return it. No loops or extra data structures are required.

---

## Step-by-Step Explanation

1. Allocate a double array of size 2.
2. Compute Kelvin as celsius + 273.15 and store at index 0.
3. Compute Fahrenheit as celsius * 9/5 + 32 and store at index 1.
4. Return the populated array.

---

## Why This Works

Both conversion formulas are linear transformations of the Celsius value, so a single arithmetic evaluation yields the exact result. Storing them in an array preserves the required order for the output.

---

## Edge Cases

- Celsius can be negative (e.g., -273.15°C → 0 K).
- Very large or very small values may suffer floating‑point rounding, but the formulas remain correct.
- Input is a double, so fractional Celsius values are handled naturally.

---

## Alternative Approaches

1. Compute the two results separately and return a List<Double> instead of an array. 2. Use the exact fraction 9.0/5.0 for the Fahrenheit multiplier to avoid integer division pitfalls.

---

## Common Mistakes

- Using integer literals (9/5) which evaluates to 1, producing wrong Fahrenheit values.
- Forgetting to add 273.15 for Kelvin or adding 32 before the multiplication.
- Returning the values in the wrong order.
