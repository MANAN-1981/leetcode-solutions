# Problem Explanation

## Algorithm Overview

The algorithm first sorts the price array so that candies are ordered by cost. It then walks the sorted array from the end, adding the two highest prices of each consecutive triple to the answer while skipping the third (the cheapest) because it is free under the discount rule.

---

## Step-by-Step Explanation

1. Sort the array in non‑decreasing order.
2. Initialise answer = 0.
3. Loop i from the last index down to 0, stepping by -3.
4. In each iteration add nums[i] (most expensive) to answer.
5. If i‑1 is within bounds, also add nums[i‑1] (second most expensive).
6. The element at i‑2 (if it exists) is automatically skipped – it is the free candy.
7. After the loop, return answer.

---

## Why This Works

By sorting, each consecutive group of three from the end contains the two most expensive candies that must be paid for and the cheapest one that can be taken for free. Skipping the cheapest in every triple yields the minimal total because any other selection would replace a free candy with a more expensive one, increasing the cost.

---

## Edge Cases

- An array with fewer than three elements: the loop still correctly adds all existing prices.
- All prices are identical: the algorithm still pays for two out of every three, which is optimal.
- Very large price values: use long if overflow is a concern (Java int may overflow for extreme inputs).
- Empty array: returns 0.

---

## Alternative Approaches

1. Use a counting sort when the price range is small (O(n + maxPrice)) to avoid the O(n log n) sort.
2. Employ a max‑heap to repeatedly extract the three most expensive candies, paying for the top two and discarding the third.

---

## Common Mistakes

1. Sorting in descending order and then skipping the wrong index, leading to an off‑by‑one error.
2. Adding the free candy by mistake (e.g., summing all three elements).
3. Forgetting to handle arrays with length < 3, causing index out‑of‑bounds exceptions.
