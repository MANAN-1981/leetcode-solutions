# Longest Common Prefix

**Difficulty:** Easy
**Topic:** String
**Language:** Go
**LeetCode link:** https://leetcode.com/problems/longest-common-prefix/

## Approach

The algorithm iterates character by character through the first string, using it as a reference for the potential common prefix. For each character in the reference string, it checks if all other strings in the input array have a character at the same position, and if that character matches. If a mismatch or an out-of-bounds access occurs in any string, the common prefix found so far is returned; otherwise, the character is appended to the result, and the process continues.

## Complexity

- Time: O(N * L)
- Space: O(1)

---
*Auto-generated and pushed by LeetCode → GitHub AI sync extension.*
