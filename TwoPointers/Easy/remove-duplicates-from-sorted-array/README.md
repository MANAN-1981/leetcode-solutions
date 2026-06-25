# Remove Duplicates from Sorted Array

**Difficulty:** Easy
**Topic:** TwoPointers
**Language:** Go
**LeetCode link:** https://leetcode.com/problems/remove-duplicates-from-sorted-array/

## Approach

This solution employs a two-pointer approach to remove duplicates in-place. A slow pointer `k` tracks the position of the last unique element found, while a fast pointer `i` iterates through the array. If `nums[i]` is distinct from `nums[k]`, it indicates a new unique element, which is then copied to `nums[k+1]` and `k` is incremented. The final length of the array with unique elements is `k + 1`.

## Complexity

- Time: O(n)
- Space: O(1)

---
*Auto-generated and pushed by LeetCode → GitHub AI sync extension.*
