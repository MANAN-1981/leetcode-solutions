# Problem Explanation

## Algorithm Overview

The algorithm iterates through the array and for each number, it increments the count of good pairs by the current frequency of the number in the hash table. Then, it increments the frequency of the number in the hash table. This approach ensures that each good pair is counted exactly once.

---

## Step-by-Step Explanation

1. Initialize a hash table with 101 elements to store the frequency of each number.
2. Iterate through the array and for each number, increment the count of good pairs by the current frequency of the number in the hash table.
3. Increment the frequency of the number in the hash table.
4. Return the total count of good pairs.

---

## Why This Works

This approach works because it counts each good pair exactly once. When a number is encountered, the current frequency of the number in the hash table represents the number of good pairs that can be formed with the current number. By incrementing the count of good pairs by the current frequency, we ensure that each good pair is counted exactly once.

---

## Edge Cases

Important edge cases to consider include: an empty array, an array with a single element, an array with all elements being the same, and an array with all elements being different.

---

## Alternative Approaches

Alternative approaches include using a brute force approach to count the number of good pairs, or using a sorting-based approach to count the number of good pairs.

---

## Common Mistakes

Common mistakes include not initializing the hash table correctly, not incrementing the count of good pairs correctly, and not handling edge cases correctly.
