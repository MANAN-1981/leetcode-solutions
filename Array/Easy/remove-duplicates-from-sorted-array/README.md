# Remove Duplicates from Sorted Array

**Difficulty:** Easy
**Topic:** Array
**Language:** Go
**LeetCode link:** https://leetcode.com/problems/remove-duplicates-from-sorted-array/

## Approach

This solution uses a two-pointer approach to remove duplicates from a sorted array. It maintains a pointer k that keeps track of the last non-duplicate element, and another pointer i that iterates through the array. Whenever a non-duplicate element is found, it is placed at the k+1 position and k is incremented.

## Complexity

- Time: O(n)
- Space: O(1)

## Code

```go
func removeDuplicates(nums []int) int {
    var k int = 0

    for i:=1; i<len(nums);i++{
        
        if nums[k] != nums[i]{

                k++
                nums[k] = nums[i]
        }
        }
    
    return k +1
}
```
