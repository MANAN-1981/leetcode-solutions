# Remove Element

**Difficulty:** Easy
**Topic:** Array
**Language:** Go
**LeetCode link:** https://leetcode.com/problems/remove-element/

## Approach

This solution uses a two-pointer approach to remove elements from the array. It iterates through the array with one pointer and uses another pointer to track the position where the next element that is not equal to the target value should be placed. This approach allows for an efficient removal of elements in a single pass.

## Complexity

- Time: O(n)
- Space: O(1)

## Code

```go
func removeElement(nums []int, val int) int {
    k := 0

    for i := 0; i < len(nums); i++ {
        if nums[i] != val {
            nums[k] = nums[i]
            k++
        }
    }

    return k
}
```
