# Problem Explanation

## Algorithm Overview

The algorithm employs a classic two‑pointer technique: one pointer begins at the start of the array and the other at the end. At each step the characters at these pointers are swapped, then the pointers move inward. This continues until the pointers cross, guaranteeing that every character ends up in its mirrored position.

---

## Step-by-Step Explanation

1. Initialize left pointer (st) to 0 and right pointer (en) to s.length‑1.
2. While st < en, swap s[st] and s[en].
3. Increment st and decrement en.
4. Loop ends when st >= en; the array is now reversed.

---

## Why This Works

Swapping symmetric positions moves each character to its final location. After processing all pairs, every index i has received the original character from index n‑1‑i, which is exactly the definition of a reversed array.

---

## Edge Cases

- Empty array (no operation needed).
- Single‑character array (swap never occurs).
- Already palindrome (algorithm still runs but makes no net change).
- Null input (should be guarded against in production code).

---

## Alternative Approaches

1. Convert the char[] to a StringBuilder and call its reverse() method.
2. Use recursion to swap the outermost characters and recurse on the inner sub‑array.

---

## Common Mistakes

- Forgetting to move the pointers inside the loop, causing an infinite loop.
- Using <= instead of <, which leads to swapping the middle element with itself unnecessarily.
- Trying to return a new array instead of modifying the input in place, which violates the problem constraints.
