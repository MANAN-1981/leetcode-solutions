# Problem Explanation

## Algorithm Overview

The algorithm first decomposes the input integer into its constituent digits, storing the count of each digit (0-9) in a frequency array. Then, it traverses this array from both ends towards the center, accumulating the product of the digit value and its frequency. This two-pointer traversal is functionally equivalent to a simple linear scan but demonstrates a specific iteration pattern. The final accumulated sum is returned as the score.

---

## Step-by-Step Explanation

1. Initialize an integer array 'arr' of size 10 to store digit frequencies.
2. While n is not 0, extract the last digit using modulo 10, increment the corresponding index in 'arr', and divide n by 10 to remove the last digit.
3. Initialize two pointers 'l' at 0 and 'r' at 9, and a variable 'sum' to 0.
4. While 'l' is less than or equal to 'r', check if the frequency at index 'l' is greater than 0. If so, add 'arr[l] * l' to 'sum'.
5. If 'l' is not equal to 'r', check if the frequency at index 'r' is greater than 0. If so, add 'arr[r] * r' to 'sum'.
6. Increment 'l' and decrement 'r'.
7. Return the final 'sum'.

---

## Why This Works

The problem requires calculating the sum of (digit * frequency) for all digits present in the number. By first counting the frequencies, we decouple the extraction of digits from the calculation of the score. The two-pointer loop correctly visits every index in the frequency array exactly once, ensuring all contributions to the sum are included without double-counting or omission.

---

## Edge Cases

- n = 0: The while loop for extraction does not run, so arr[0] remains 0. The sum will be 0. Note: If the problem definition considers '0' as having a digit '0' with frequency 1, the code fails for n=0 because it doesn't handle the initial state of n=0 before the loop. However, typically for such problems, if n=0, the digit is 0. The code returns 0, which is 0*1=0, so it is numerically correct but logically skips the count.
- Negative numbers: The problem likely assumes non-negative integers. If negative, the modulo operation in Java yields negative remainders, causing array index out of bounds.
- Large numbers: The loop runs log10(n) times, which is efficient even for large integers within the int range.

---

## Alternative Approaches

- Direct Summation: Instead of storing frequencies, simply sum (n % 10) in each iteration of the digit extraction loop. This eliminates the need for the frequency array and the second loop, reducing space to O(1) and simplifying code.
- String Conversion: Convert n to a String, iterate through each character, convert back to int, and sum them. This is less efficient due to object creation and type conversion overhead.

---

## Common Mistakes

- Forgetting to handle n=0: If the logic relies on the while(n!=0) loop to count digits, n=0 results in zero counts. While the sum is 0, it's important to verify if the problem expects the digit '0' to be counted explicitly.
- Array Index Out of Bounds: If negative numbers are not handled, n % 10 can be negative, leading to an ArrayIndexOutOfBoundsException.
- Double Counting: In the two-pointer approach, failing to check if l == r before processing both pointers can lead to double-counting the middle element if the array size is odd (though here size is 10, so l and r cross without meeting, but the logic `if (l == r)` is a good defensive habit).
