# Remove Duplicates from Sorted Array

**Difficulty:** Easy
**Topic:** TwoPointers
**Language:** Java
**LeetCode link:** https://leetcode.com/problems/remove-duplicates-from-sorted-array/

## Approach

The code uses a two-pointer approach. One pointer (`k`) tracks the position for the next unique element, while the other (`i`) iterates through the array. If `nums[i]` is different from `nums[k]`, it's a new unique element, so `k` is incremented and `nums[i]` is placed at `nums[k]`. The final count of unique elements is `k+1`.

## Complexity

- Time: O(n)
- Space: O(1)

---
*Auto-generated and pushed by LeetCode → GitHub AI sync extension.*
