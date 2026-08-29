# Problem Explanation

## Algorithm Overview

Traverse the characters of the input string once, counting uppercase letters. After the traversal, compare the count with the length of the string and the position of the first character to decide if the capital usage is valid.

---

## Step-by-Step Explanation

1. Convert the string to a char array.
2. Initialize a counter for uppercase letters.
3. Check the first character; if it is uppercase, increment the counter.
4. Iterate from the second character to the end, incrementing the counter for each uppercase character.
5. After the loop, if the counter equals the string length (all uppercase) or is zero (all lowercase), return true.
6. If the counter is exactly one and the first character is uppercase, return true.
7. Otherwise, return false.

---

## Why This Works

The problem defines three acceptable capital patterns. Counting uppercase letters lets us distinguish between these patterns: all, none, or exactly one at the start. Any other distribution violates the rules, so the algorithm correctly returns false.

---

## Edge Cases

- Single‑character strings (both uppercase and lowercase are valid)
- Strings where all characters are uppercase
- Strings where all characters are lowercase
- Strings where only the first character is uppercase

---

## Alternative Approaches

1. Use built-in methods like `s.equals(s.toUpperCase())`, `s.equals(s.toLowerCase())`, and `Character.isUpperCase(s.charAt(0)) && s.substring(1).equals(s.substring(1).toLowerCase())`.
2. Scan the string once while tracking three flags: allUpper, allLower, and firstUpperRestLower, and evaluate them at the end.

---

## Common Mistakes

1. Checking the wrong condition for the rest of the characters (e.g., using `&&` instead of `||`).
2. Forgetting to handle the single‑character edge case.
3. Misinterpreting the ASCII range checks, leading to incorrect uppercase detection.
