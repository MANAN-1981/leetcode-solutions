# Problem Explanation

## Algorithm Overview

The algorithm works by maintaining two pointers, one for the current element being processed and another for the last non-duplicate element found. It iterates through the array, and whenever it encounters a new element, it moves the last non-duplicate pointer forward and copies the new element to that position. This approach ensures that all duplicates are removed from the array.

---

## Step-by-Step Explanation

1. Initialize two pointers, k and i, where k is the last non-duplicate element and i is the current element being processed.
2. Iterate through the array starting from the second element (index 1).
3. For each element, check if it is different from the last non-duplicate element (nums[k]).
4. If it is different, move the last non-duplicate pointer forward (k++) and copy the current element to that position (nums[k] = nums[i]).

---

## Why This Works

This approach works because the array is already sorted, so all duplicates of a number are adjacent to each other. By only keeping the first occurrence of each number, we effectively remove all duplicates. The two-pointer technique allows us to track the position of the last non-duplicate element and efficiently remove duplicates.

---

## Edge Cases

Important edge cases to consider include an empty array, an array with a single element, and an array with all duplicate elements.

---

## Alternative Approaches

One alternative approach is to use a HashSet to keep track of unique elements and then copy them back to the array. Another approach is to use a sorting algorithm that removes duplicates, such as a set-based sort.

---

## Common Mistakes

Common mistakes include not handling edge cases, such as an empty array, and not properly updating the pointers.
