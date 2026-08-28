# Problem Explanation

## Algorithm Overview

The algorithm first checks if the two strings have the same length. It then converts each string to a character array, sorts both arrays, and finally compares the sorted arrays using two pointers moving from both ends. If all corresponding characters match, the strings are anagrams.

---

## Step-by-Step Explanation

1. If a.length() != b.length(), return false.
2. Convert a and b to char arrays arr and brr.
3. Sort arr and brr.
4. Initialise l = 0 and r = arr.length - 1.
5. While l <= r, compare arr[l] with brr[l] and arr[r] with brr[r]; if any mismatch, return false; otherwise move l++ and r--.
6. After the loop finishes, return true.

---

## Why This Works

Sorting rearranges characters so that identical multisets become identical sequences. Therefore, a position‑by‑position comparison after sorting guarantees that both strings contain exactly the same characters with the same frequencies.

---

## Edge Cases

- Both strings empty (should return true).
- Strings of different lengths (immediately false).
- Strings containing Unicode or non‑alphabetic characters (sorting still works).
- Identical strings (trivially true).

---

## Alternative Approaches

1. Use an int[26] frequency array for lowercase letters and compare counts.
2. Use a HashMap<Character, Integer> to count occurrences in one string and decrement while scanning the other.

---

## Common Mistakes

- Forgetting the length check before sorting.
- Comparing only the first and last characters instead of all positions.
- Using nested loops for comparison, leading to O(n^2) time.
