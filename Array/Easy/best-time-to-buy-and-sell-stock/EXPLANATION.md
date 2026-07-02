# Problem Explanation

## Algorithm Overview

The algorithm iterates through the array of stock prices, keeping track of the minimum price seen so far. It calculates the maximum profit by subtracting the minimum price from the current price. The algorithm uses a greedy approach to find the maximum profit, which means it makes the locally optimal choice at each step with the hope of finding the global optimum.

---

## Step-by-Step Explanation

1. Initialize the minimum price to the first price in the array.
2. Iterate through the array of prices, starting from the second price.
3. For each price, check if it is less than the current minimum price. If it is, update the minimum price.
4. Calculate the profit by subtracting the minimum price from the current price.
5. If the calculated profit is greater than the current maximum profit, update the maximum profit.

---

## Why This Works

This algorithm works because it keeps track of the minimum price seen so far, which allows it to calculate the maximum profit. The greedy approach ensures that the algorithm makes the locally optimal choice at each step, which leads to the global optimum. The algorithm has a time complexity of O(n) because it only needs to iterate through the array once.

---

## Edge Cases

Important edge cases to consider include: an empty array, an array with a single element, an array with all elements being the same, an array with a decreasing sequence of prices.

---

## Alternative Approaches

One alternative approach is to use a brute force method, which involves checking all possible buy and sell combinations. Another approach is to use dynamic programming, which involves breaking down the problem into smaller sub-problems and solving each sub-problem only once.

---

## Common Mistakes

Common mistakes include: not initializing the minimum price correctly, not updating the minimum price correctly, not calculating the profit correctly.
