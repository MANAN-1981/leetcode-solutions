# Problem Explanation

## Algorithm Overview

The algorithm scans the given order array and, for each element, checks whether it appears in the friends array. If it does, the element is appended to the result. This preserves the original ordering of the friends within the overall finishing order.

---

## Step-by-Step Explanation

1. Create an empty result array of size equal to friends.length.
2. Initialise an index pointer to 0.
3. For each id in the order array:
   a. Scan the friends array to see if the id matches any friend.
   b. If a match is found, store the id at result[index] and increment index.
   c. Break the inner loop to avoid duplicate inserts.
4. Return the filled result array.

---

## Why This Works

Because the outer loop respects the original finishing order, any friend encountered is placed in the result exactly when it first appears, guaranteeing the relative order among friends is unchanged. The inner loop ensures only friends are selected.

---

## Edge Cases

- friends array is empty → result is an empty array.
- No friend appears in order → result remains all zeros (but length equals friends.length, which is acceptable as per problem constraints).
- order contains duplicate ids (not typical for this problem) → the first occurrence will be taken, subsequent duplicates are ignored due to the break.
- friends contains ids not present in order → those positions stay at default value (0) which should be handled by problem guarantees.

---

## Alternative Approaches

1. Build a HashSet of friends for O(1) look‑ups, then iterate order once (O(n) time, O(m) space). 2. Use a HashMap to store the index of each friend in order, then sort friends by those indices.

---

## Common Mistakes

1. Forgetting to break after a match, causing duplicate entries.
2. Returning an array of the wrong size (e.g., using order.length instead of friends.length).
3. Not handling the case where a friend does not appear in order, leading to uninitialized values.
