# Search Insert Position

**Difficulty:** Easy
**Topic:** Array
**Language:** Go
**LeetCode link:** https://leetcode.com/problems/search-insert-position/

## Approach

The approach used in the code is a simple linear search, iterating through the array to find the target element. If the target is found, its index is returned; otherwise, the function returns the length of the array, indicating the position where the target should be inserted to maintain sorted order. This solution takes advantage of the fact that the input array is already sorted.

## Complexity

- Time: O(n)
- Space: O(1)

## Code

```go
func searchInsert(nums []int, target int) int {
    l := len(nums)
  
    for i:=0; i<l; i++{
        if nums[i] >= target{
            return i
        }
    }
        return len(nums)
}
 

```
