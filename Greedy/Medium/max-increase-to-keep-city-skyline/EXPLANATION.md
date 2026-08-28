# Problem Explanation

## Algorithm Overview

First find the tallest building in each row and each column, which represent the skyline from the left/right and top/bottom. Then, for each cell, the highest it can be raised to without altering the skyline is the smaller of its row's max and column's max. The total increase is the sum of these per‑cell increases.

---

## Step-by-Step Explanation

1. Determine number of rows (m) and columns (n).
2. Initialize arrays rowMax[m] and colMax[n] to 0.
3. Scan the grid once to fill rowMax with the maximum value of each row.
4. Scan the grid again (or in the same pass) to fill colMax with the maximum value of each column.
5. Iterate over every cell; for each cell compute allowedHeight = min(rowMax[i], colMax[j]).
6. Add (allowedHeight - grid[i][j]) to the answer.
7. Return the accumulated answer.

---

## Why This Works

The skyline from a side is defined solely by the maximum height in each row or column. Raising a building above the smaller of its row and column maxima would create a new maximum in that row or column, thus changing the skyline. Staying at or below that minimum preserves both skylines while maximizing each cell's height.

---

## Edge Cases

- Grid with a single row or a single column.
- All cells already equal to their allowed heights (no increase possible).
- Cells with height 0 that can be raised.
- Non‑square grids (different m and n).

---

## Alternative Approaches

Compute rowMax and colMax in a single pass using two nested loops, reducing the number of traversals.,Use a priority queue to process cells in order of potential increase, though it adds unnecessary overhead.

---

## Common Mistakes

Using max(rowMax[i], colMax[j]) instead of min, which would over‑increase and change the skyline.,Modifying the original grid while still needing original values for later calculations.,Forgetting to handle empty grid or null input (though LeetCode guarantees a non‑empty grid).
