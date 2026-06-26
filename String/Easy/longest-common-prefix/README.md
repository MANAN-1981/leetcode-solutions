# Longest Common Prefix

**Difficulty:** Easy
**Topic:** String
**Language:** Go
**LeetCode link:** https://leetcode.com/problems/longest-common-prefix/

## Approach

This solution iterates through each character in the first string of the input array, checking if the same character exists at the same position in all other strings. If a mismatch is found, it returns the common prefix found so far. The approach ensures that the common prefix is built incrementally, character by character, until a difference is encountered. This method is efficient as it only requires a single pass through the input strings.

## Complexity

- Time: O(n*m)
- Space: O(1)

## Code

```go
func longestCommonPrefix(strs []string) string {
    
    Newstring := ""

    for j:=0; j<len(strs[0]);j++{
        ch := strs[0][j]

        for i:=1; i<len(strs); i++{
            if j>=len(strs[i]) || strs[i][j] != ch{
                return Newstring
            }
        }
       Newstring += string(ch)
    }
    return Newstring
}
```
