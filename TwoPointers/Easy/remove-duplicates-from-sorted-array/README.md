# Remove Duplicates from Sorted Array

**Difficulty:** Easy
**Topic:** TwoPointers
**Language:** Java
**LeetCode link:** https://leetcode.com/problems/remove-duplicates-from-sorted-array/

## Approach

This solution uses a two-pointer approach. One pointer (`k`) tracks the position for the next unique element, while the other (`i`) iterates through the array. When a new unique element is found (i.e., `nums[i]` is different from `nums[k]`), it's placed at `nums[k+1]`, and `k` is incremented. Duplicates are skipped, and the final count of unique elements is `k+1`.

## Complexity

- Time: O(n)
- Space: O(1)

---
*Auto-generated and pushed by LeetCode → GitHub AI sync extension.*
