# Problem Explanation

## Algorithm Overview

The algorithm first removes duplicates from the array using a HashSet. Then, it stores the unique elements in an ArrayList and sorts them. Finally, it uses binary search to find the rank of each element in the sorted array.

---

## Step-by-Step Explanation

1. Create a HashSet to store unique elements from the array.
2. Add all elements from the array to the HashSet.
3. Create an ArrayList to store the unique elements.
4. Add all elements from the HashSet to the ArrayList.
5. Sort the ArrayList in ascending order.
6. Create a new array to store the rank of each element.
7. For each element in the original array, use binary search to find its rank in the sorted ArrayList.

---

## Why This Works

This algorithm works because the HashSet removes duplicates, and the sorting allows us to determine the rank of each element. The binary search is used to find the rank of each element in the sorted array, which gives us the final result.

---

## Edge Cases

Important edge cases to consider include an empty array, an array with a single element, and an array with duplicate elements.

---

## Alternative Approaches

One alternative approach is to use a HashMap to store the rank of each element, and another approach is to use a custom sorting algorithm.

---

## Common Mistakes

Common mistakes include not removing duplicates, not sorting the array correctly, and not using binary search to find the rank of each element.
