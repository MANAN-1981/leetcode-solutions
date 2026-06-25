# Remove Duplicates from Sorted Array

**Difficulty:** Easy
**Topic:** TwoPointers
**Language:** Go
**LeetCode link:** https://leetcode.com/problems/remove-duplicates-from-sorted-array/

## Approach

This solution employs a two-pointer technique. A slow pointer `k` maintains the index for the next unique element, while a fast pointer `i` traverses the array. When `nums[i]` is distinct from `nums[k]`, it signifies a new unique value; `k` is incremented, and `nums[i]` is moved to `nums[k]`, effectively compacting unique elements to the front. The final count of unique elements is `k + 1`.

## Complexity

- Time: O(n)
- Space: O(1)

---
*Auto-generated and pushed by LeetCode → GitHub AI sync extension.*
