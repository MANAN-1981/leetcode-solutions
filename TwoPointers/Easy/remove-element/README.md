# Remove Element

**Difficulty:** Easy
**Topic:** TwoPointers
**Language:** Go
**LeetCode link:** https://leetcode.com/problems/remove-element/

## Approach

This solution employs a two-pointer approach. One pointer (`i`) iterates through the entire array, while another pointer (`k`) tracks the position for the next element that is not equal to `val`. If `nums[i]` is not `val`, it is moved to `nums[k]`, and `k` is incremented. The final value of `k` represents the new length of the array after removing all occurrences of `val` in-place.

## Complexity

- Time: O(n)
- Space: O(1)

---
*Auto-generated and pushed by LeetCode → GitHub AI sync extension.*
