# Problem Explanation

## Algorithm Overview

The algorithm leverages Java's `String.toLowerCase()` which iterates over each character, converting uppercase letters to their lowercase equivalents while leaving other characters unchanged.

---

## Step-by-Step Explanation

1. Receive the input string `s`.
2. Call `s.toLowerCase()` which creates a new string.
3. Return the newly created lowercase string.

---

## Why This Works

`toLowerCase()` follows the Unicode case mapping rules, guaranteeing that every uppercase character is correctly mapped to its lowercase counterpart. Since it processes each character once, the result is accurate and linear in time.

---

## Edge Cases

- Empty string returns an empty string.
- String containing only non‑alphabetic characters remains unchanged.
- Strings with mixed Unicode scripts are handled according to Unicode standards.
- Very long strings still respect O(n) time and space.

---

## Alternative Approaches

Manually iterate over the characters, check if a character is between 'A' and 'Z', and add 32 to convert it to lowercase; or use a character array and modify it in place before constructing a new string.

---

## Common Mistakes

1. Forgetting that `toLowerCase()` returns a new string and trying to modify the original.
2. Assuming ASCII only and ignoring Unicode edge cases.
3. Using `==` to compare strings instead of `.equals()` when testing.
