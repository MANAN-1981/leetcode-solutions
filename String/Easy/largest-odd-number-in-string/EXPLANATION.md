# Problem Explanation

## Algorithm Overview

The algorithm scans the input string from the end towards the beginning. It looks for the first character that represents an odd number. Once found, it returns the prefix of the string ending at that character. If no odd digit is found, it returns an empty string.

---

## Step-by-Step Explanation

1. Initialize a loop variable 'i' starting from the last index of the string (num.length() - 1).
2. Iterate backwards while 'i' is greater than or equal to 0.
3. Check if the character at index 'i' is an odd digit by converting it to an integer and checking if the remainder when divided by 2 is not 0.
4. If an odd digit is found, return the substring from index 0 to 'i' (inclusive).
5. If the loop completes without finding an odd digit, return an empty string.

---

## Why This Works

For a number to be odd, its last digit must be odd. To maximize the value of the number, we want to keep as many leading digits as possible. Therefore, the largest odd number is formed by taking the longest prefix of the original string that ends with an odd digit. Scanning from right to left finds the rightmost odd digit, which yields the longest valid prefix.

---

## Edge Cases

- The string contains no odd digits (e.g., "2468"), resulting in an empty string.
- The string has only one character, which is odd (e.g., "3"), returning the character itself.
- The string has only one character, which is even (e.g., "2"), returning an empty string.
- The first digit is odd but subsequent digits are even (e.g., "124"), returning "1".

---

## Alternative Approaches

1. Use a regular expression to find the last odd digit and extract the substring.
2. Convert the string to a list of characters, find the index of the last odd digit, and join the prefix back into a string (less efficient due to extra space).

---

## Common Mistakes

- Forgetting to handle the case where no odd digit exists, leading to an out-of-bounds error or incorrect return value.
- Scanning from left to right instead of right to left, which would find the first odd digit but not necessarily the one that produces the largest number.
- Incorrectly calculating the substring end index (using 'i' instead of 'i+1' in substring call).
