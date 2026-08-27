# Problem Explanation

## Algorithm Overview

The algorithm performs a nested loop traversal. The outer loop iterates over each word in the provided array. The inner loop scans each character of the current word to see if it matches the target character. If a match is found, the index of the word is recorded, and the inner loop breaks early to avoid unnecessary checks for that word.

---

## Step-by-Step Explanation

1. Initialize an empty list 'ans' to store the indices of matching words.
2. Loop through the 'words' array from index 0 to length-1.
3. For each word, convert it to a character array or iterate through its characters.
4. Check each character against the target character 'x'.
5. If a match is found, add the current index 'i' to 'ans' and break out of the inner loop.
6. Return the populated list 'ans'.

---

## Why This Works

Since we only need to determine if a character exists in a string, we can stop checking the rest of the string once the character is found. This early termination optimizes the average case performance. The logic is sound because the problem asks for indices of words containing the character, which is a direct membership test.

---

## Edge Cases

- Empty words array: returns an empty list.
- Words with no matching character: indices are not added.
- Single character words: works correctly if it matches.
- Target character not present in any word: returns an empty list.

---

## Alternative Approaches

- Using Java Streams: `IntStream.range(0, words.length).filter(i -> words[i].indexOf(x) != -1).boxed().collect(Collectors.toList())`.
- Using `String.contains()`: Iterate through words and check `words[i].contains(String.valueOf(x))`.

---

## Common Mistakes

- Forgetting to break the inner loop after finding a match, leading to duplicate indices in the result list.
- Using `String.indexOf()` without checking for -1, which could cause issues if not handled correctly.
- Confusing character comparison with string comparison.
