# Two Sum

**Difficulty:** Easy
**Topic:** Array
**Language:** Go
**LeetCode link:** https://leetcode.com/problems/two-sum/

## Approach

This solution uses a brute-force approach to find two numbers in the array that add up to the target sum. It iterates over each pair of numbers in the array and checks if their sum equals the target. If a match is found, it returns the indices of the two numbers.

## Complexity

- Time: O(n^2)
- Space: O(1)

## Code

```go
func twoSum(nums []int, target int) []int {
    l := len(nums)

    for i:=0; i<l; i++{
        for j:=i+1; j<l; j++{
            if nums[i] + nums[j] == target{
                return []int {i,j}
            }
        }
    }
    return nil
}
```
