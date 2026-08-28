# Problem Explanation

## Algorithm Overview

We traverse the integer digit by digit, recording the count of each digit in a length‑10 array. After counting, we iterate over the array and add digit * frequency to a running total. The final total is returned as the digit frequency score.

---

## Step-by-Step Explanation

1. Initialise an int[10] array to zero.
2. While n != 0, extract the last digit (n % 10), increment the corresponding array cell, and remove the digit (n /= 10).
3. Initialise sum = 0.
4. Loop over the frequency array (or use two‑pointer as in the given code) and for each index i add i * arr[i] to sum.
5. Return sum.

---

## Why This Works

Each occurrence of a digit d contributes exactly d to the total sum, and counting frequencies ensures we add d once per occurrence. Summing d * frequency(d) over all digits therefore equals the sum of all digits in the original number.

---

## Edge Cases

- n = 0 should return 0 because the loop never runs and the array entry for digit 0 stays 0.
- Negative numbers: the current implementation assumes n is non‑negative; handling negatives would require taking absolute value.
- Very large integers that exceed int range would need long or BigInteger.
- Numbers with leading zeros are not represented in integer form, so they are irrelevant.

---

## Alternative Approaches

Directly compute the digit sum in a single pass without a frequency array: sum += n % 10 in the while loop.,Convert the integer to a string and iterate over characters, converting each char back to an int and accumulating the sum.

---

## Common Mistakes

Forgetting to handle n = 0, which leads to a sum of 0 but some implementations may skip the loop entirely.,Using the frequency array but then forgetting to multiply by the digit value, returning just the count of digits.,Assuming the input can be negative without taking absolute value, causing an infinite loop.
