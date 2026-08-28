# Problem Explanation

## Algorithm Overview

The solution performs a linear scan over the array of strings and, for each string, scans its characters until the target character is found. If found, the current index is added to the result list and the inner loop stops early. Finally, the list of indices is returned.

---

## Step-by-Step Explanation

1. Create an empty list ans.
2. Loop i from 0 to words.length‑1.
3. Convert words[i] to a char array and iterate over each character c.
4. If c equals x, add i to ans and break out of the inner loop.
5. After processing all words, return ans.

---

## Why This Works

Each word is examined at most until the first occurrence of x, guaranteeing that any index added corresponds to a word containing x. Because every word is visited, no qualifying index can be missed, ensuring correctness.

---

## Edge Cases

- The input array is empty → returns an empty list.
- No word contains x → returns an empty list.
- A word contains multiple x's → its index is added only once due to the break.
- Comparison is case‑sensitive; 'a' ≠ 'A'.

---

## Alternative Approaches

1. Use Java streams: IntStream.range(0, words.length).filter(i -> words[i].indexOf(x) != -1).boxed().collect(Collectors.toList()).
2. Pre‑process each word with a HashSet of characters and check set.contains(x), which trades extra space for potentially faster lookups.

---

## Common Mistakes

- Adding the index for every occurrence of x instead of breaking after the first.
- Modifying the original words array instead of building a new list.
- Forgetting to handle the case where words is null (though LeetCode guarantees non‑null input).
