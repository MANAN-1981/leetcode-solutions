# Problem Explanation

## Algorithm Overview

After sorting, the smallest player is matched with the smallest trainer that has enough ability. If a trainer cannot handle the current player, we skip that trainer and try the next one. This greedy process yields the maximum number of matches.

---

## Step-by-Step Explanation

1. Sort the players array in non‑decreasing order.
2. Sort the trainers array in non‑decreasing order.
3. Initialise i = 0 (players pointer) and j = 0 (trainers pointer).
4. While both pointers are within bounds, if players[i] ≤ trainers[j] record a match and increment both i and j; otherwise increment j only.
5. Return the total number of matches recorded.

---

## Why This Works

Matching the weakest feasible player first never harms the ability to match stronger players later, because any trainer that can handle a stronger player can also handle the weaker one. This exchange argument guarantees optimality.

---

## Edge Cases

- One of the arrays is empty → result is 0.
- All players are stronger than every trainer → result is 0.
- All trainers are stronger than every player → result equals the smaller array length.
- Duplicate values in either array are handled naturally by the two‑pointer scan.

---

## Alternative Approaches

1. Use a multiset (TreeMap) for trainers and for each player find the smallest trainer ≥ player via ceiling operation; O((n+m) log m) time.
2. Binary search each player in the sorted trainers array and mark used trainers with a boolean array; O(n log m) but more bookkeeping.

---

## Common Mistakes

1. Forgetting to sort both arrays, leading to incorrect greedy decisions.
2. Advancing the player pointer when a trainer cannot accommodate, which skips potential matches.
3. Using O(n*m) nested loops instead of the linear two‑pointer scan.
