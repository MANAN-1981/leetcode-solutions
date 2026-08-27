# Problem Explanation

## Algorithm Overview

First, convert the string to a character array and sort it. Sorting a binary string results in all '0's followed by all '1's. Then, use two pointers starting from the beginning and the second-to-last position (to preserve the last '1' for oddness). Swap characters if the left pointer points to a smaller value ('0') than the right pointer ('1'), moving the '1's to the front.

---

## Step-by-Step Explanation

1. Convert the input string to a character array.
2. Sort the array in ascending order (all '0's then '1's).
3. Initialize two pointers: left at index 0 and right at index length - 2.
4. While left < right, check if arr[left] < arr[right].
5. If true, swap arr[left] and arr[right] to move '1' to a more significant position.
6. Increment left and decrement right.
7. Return the modified array as a string.

---

## Why This Works

To maximize a binary number, we want the largest digits ('1') at the most significant (leftmost) positions. Sorting ensures we have a pool of '1's at the end. By swapping from the outside in, we place '1's at the front. We stop at length - 2 to ensure the last character remains '1', satisfying the odd number constraint.

---

## Edge Cases

- String with only one '1' (e.g., "1"): The loop doesn't run, returns "1".
- String with no '0's (e.g., "111"): Sorting keeps it "111", swaps do nothing, returns "111".
- String with only one '0' (e.g., "101"): Sorting gives "011", swap moves '1' to front, returns "110"? No, wait. "101" -> sort "011". l=0, r=1. arr[0]='0', arr[1]='1'. Swap -> "101". Correct.

---

## Alternative Approaches

- Count the number of '1's. Construct the result by placing (count - 1) '1's at the beginning, followed by all '0's, and ending with a single '1'. This is O(n) time and O(1) extra space (if building string directly).
- Simply count zeros and ones, then return a string of (ones-1) '1's + zeros '0's + '1'.

---

## Common Mistakes

- Forgetting to keep the last bit as '1', which would make the number even.
- Using the wrong index for the right pointer (using length-1 instead of length-2) which might swap the mandatory trailing '1' with a '0'.
- Not handling the case where there are no '0's or only one '1' correctly, though the logic generally holds.
