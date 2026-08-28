# Problem Explanation

## Algorithm Overview

The algorithm first sanitizes the input string, keeping only letters and digits and making everything lower‑case. It then employs a classic two‑pointer technique: one pointer starts at the beginning, the other at the end. The pointers move towards each other, comparing characters; any mismatch means the string is not a palindrome. If the pointers cross without mismatches, the string is a palindrome.

---

## Step-by-Step Explanation

1. Remove all characters that are not letters or digits and convert the result to lower case.
2. Convert the cleaned string to a character array.
3. Initialise two indices: left = 0 and right = length‑1.
4. While left <= right, compare arr[left] and arr[right].
5. If they differ, return false; otherwise increment left and decrement right.
6. If the loop finishes, return true.

---

## Why This Works

After cleaning, the string contains only characters that should be considered for palindrome checking, and case differences are eliminated. The two‑pointer scan checks each mirrored pair exactly once, guaranteeing correctness because a palindrome must read identically forward and backward.

---

## Edge Cases

- Empty string after cleaning
- Single character string
- String consisting solely of non‑alphanumeric symbols
- Mixed case letters that become identical after lower‑casing

---

## Alternative Approaches

Iterate over the original string with two pointers, skipping non‑alphanumeric characters on the fly, thus avoiding extra storage for the cleaned string.,Create a reversed version of the cleaned string and compare it directly to the original cleaned string.

---

## Common Mistakes

Forgetting to convert characters to the same case, leading to false negatives.,Using a regular expression that also removes digits or other valid characters.,Comparing characters with < instead of <=, which can miss the middle character in odd‑length strings.
