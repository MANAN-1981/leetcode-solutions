# Problem Explanation

## Algorithm Overview

The algorithm maintains a window [l, i] that always contains unique characters. As we iterate with i, if the character at i is already in the window, we move l forward, removing characters until the duplicate is gone. After each expansion, we record the window size as a candidate for the answer.

---

## Step-by-Step Explanation

1. Initialize an empty HashSet, left pointer l = 0, and maxNum = 0.
2. Iterate i from 0 to end of string.
3. While the current character s[i] is in the set, remove s[l] from the set and increment l.
4. Add s[i] to the set.
5. Update maxNum = max(maxNum, i - l + 1).
6. After the loop, return maxNum.

---

## Why This Works

The set guarantees that the window never contains duplicates; moving the left pointer only when a duplicate appears ensures we always consider the longest possible unique substring ending at each position. Since each character is added and removed at most once, the total work is linear.

---

## Edge Cases

- Empty string should return 0.
- String with all identical characters results in length 1.
- String with all unique characters returns the string length.
- Strings containing Unicode or non‑ASCII characters are handled because we treat characters as Java char values.

---

## Alternative Approaches

1. Use an int[128] (or larger) array to store the last index of each character and jump the left pointer directly to lastSeen+1.
2. Use a HashMap<Character, Integer> to record the most recent index of each character and adjust the left pointer based on that.

---

## Common Mistakes

- Forgetting to remove the leftmost character before moving the left pointer, causing an infinite loop.
- Updating max length before the window is cleaned, leading to off‑by‑one errors.
- Using a List instead of a Set, which makes containment checks O(n).
