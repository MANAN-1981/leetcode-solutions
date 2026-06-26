# Missing Number

**Difficulty:** Easy
**Topic:** Array
**Language:** Go
**LeetCode link:** https://leetcode.com/problems/missing-number/

## Approach

The approach used in the code calculates the sum of all numbers from 0 to n (where n is the length of the input array) and subtracts the sum of the numbers in the input array to find the missing number. This solution works because the sum of numbers from 0 to n is a known arithmetic series. The code uses two separate loops to calculate these sums.

## Complexity

- Time: O(n)
- Space: O(1)

## Code

```go
func missingNumber(nums []int) int {
    s := len(nums) 
    sum := 0
    sum2 := 0

    for i:=0; i<s; i++{
        sum += nums[i] 
    }

    for i:=0; i<=s; i++{
        sum2 += i
    }

    return sum2 - sum
}
```
