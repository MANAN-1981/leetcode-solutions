# Problem Explanation

## Algorithm Overview

The algorithm processes each integer in the input array individually. For each integer, it repeatedly extracts the last digit using the modulo operator and checks if it matches the target digit. The integer is then divided by 10 to remove the last digit, continuing until the number becomes zero. This approach avoids converting numbers to strings, keeping the solution efficient and memory-light.

---

## Step-by-Step Explanation

1. Initialize a variable `count` to 0 to keep track of the total occurrences.
2. Iterate through each number in the `nums` array using a for loop.
3. For each number, enter a while loop that continues as long as the number is not 0.
4. Inside the loop, extract the last digit using `nums[k] % 10`.
5. Check if the extracted digit equals the target `digit`. If yes, increment `count`.
6. Update the current number by dividing it by 10 (`nums[k] = nums[k] / 10`) to remove the last digit.
7. Repeat steps 4-6 until the number becomes 0.
8. After processing all numbers, return the final `count`.

---

## Why This Works

Any positive integer can be decomposed into its individual digits by repeatedly taking the remainder when divided by 10 (which gives the last digit) and then integer dividing by 10 (which shifts the number right). This process terminates when the number becomes 0, ensuring all digits are checked exactly once.

---

## Edge Cases

- Numbers containing the digit 0: The while loop condition `nums[k] != 0` stops before checking the leading zeros, but since we are extracting from the end, internal zeros are handled correctly. However, if the number itself is 0, the loop won't run, so a special case check for `nums[k] == 0` might be needed if the target digit is 0.
- Negative numbers: The problem usually implies non-negative integers, but if negatives are allowed, the sign must be handled (e.g., taking absolute value) because `-5 % 10` is `-5` in Java.
- Single digit numbers: The loop runs once, checking the only digit.

---

## Alternative Approaches

1. String Conversion: Convert each integer to a String and use `String.indexOf` or iterate through characters to count matches. This is simpler but uses more memory and time due to object creation.
2. Recursive Approach: Define a recursive function that processes the last digit and calls itself on `num / 10`. This uses O(D) stack space.

---

## Common Mistakes

- Forgetting to handle the case where the number is 0 and the target digit is 0.
- Not handling negative numbers correctly if the input constraints allow them.
- Modifying the original array if it is supposed to be immutable (though often acceptable in LeetCode unless specified otherwise).
