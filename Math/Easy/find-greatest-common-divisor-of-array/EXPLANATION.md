# Problem Explanation

## Algorithm Overview

The algorithm first sorts the input array to easily access the minimum and maximum values. It then applies the Euclidean algorithm to find the GCD of these two numbers, returning the result as the GCD of the entire array.

---

## Step-by-Step Explanation

1. Receive the integer array `nums`.
2. Sort `nums` in ascending order.
3. Identify `min = nums[0]` and `max = nums[nums.length‑1]`.
4. Call the helper `gcd(min, max)` which repeatedly replaces the pair (a, b) with (b, a % b) until b becomes 0.
5. Return the final value of `a` as the GCD.

---

## Why This Works

The Euclidean algorithm correctly computes the GCD of two numbers by exploiting the property gcd(a, b) = gcd(b, a % b). Sorting ensures we pick the extreme values, but the correctness for the whole array relies on the (incorrect) assumption that the GCD of the whole set equals gcd(min, max).

---

## Edge Cases

- Single‑element array (the element itself is the GCD)
- Array containing zeros (gcd(0, x) = |x|)
- All elements are identical (GCD equals that value)
- Negative numbers (take absolute values before computation)

---

## Alternative Approaches

1. Iterate through the array and compute the GCD cumulatively: result = gcd(result, nums[i]) for each element.
2. Use Java's built‑in `Math.gcd` (available from Java 9) in a stream reduction to obtain the GCD of all elements.

---

## Common Mistakes

- Assuming gcd(min, max) always equals the GCD of the whole array.
- Forgetting to handle zeros, which can lead to division by zero errors.
- Not taking absolute values when negative numbers are present.
