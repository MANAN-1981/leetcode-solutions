# Problem Explanation

## Algorithm Overview

Store each character of the jewels string in a hash set for O(1) look‑ups. Then iterate over the stones string, incrementing a counter whenever a stone character is found in the set.

---

## Step-by-Step Explanation

1. Initialise an empty HashSet<Character>.
2. Loop over the jewels string and add each character to the set.
3. Initialise a counter to zero.
4. Loop over the stones string; if the current stone character is in the set, increment the counter.
5. Return the final counter value.

---

## Why This Works

A hash set provides constant‑time membership checks, so each stone is examined exactly once and we can instantly determine if it is a jewel. The total work is therefore proportional to the sum of the lengths of the two strings.

---

## Edge Cases

- jewels is an empty string (result is always 0).
- stones is an empty string (result is 0).
- jewels contains duplicate characters (set automatically deduplicates).
- Both strings contain only non‑alphabetic Unicode characters (still works because we treat characters generically).

---

## Alternative Approaches

Use a fixed‑size boolean array of length 52 (26 uppercase + 26 lowercase) to mark jewel types, which avoids hashing overhead. Or sort both strings and walk them with two pointers, counting matches as you go.

---

## Common Mistakes

- Forgetting to deduplicate jewels, leading to double counting.
- Using a list and calling contains() inside the stone loop, causing O(n*m) time.
- Modifying the input strings or assuming they contain only letters.
