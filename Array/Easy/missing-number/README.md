# Missing Number

**Difficulty:** Easy
**Topic:** Array
**Language:** Java
**LeetCode link:** https://leetcode.com/problems/missing-number/

## Approach

The approach used in this solution calculates the sum of the numbers in the array and the sum of numbers from 0 to the array length. It then returns the difference between the two sums, which represents the missing number. This solution works by utilizing the properties of arithmetic series to find the missing number in linear time.

## Complexity

- Time: O(n)
- Space: O(1)

## Code

```java
class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int max = nums.length;

        for (int i=0; i<nums.length; i++){
            sum += nums[i];
            max += i;
        }

    return max-sum;
    }
}
```
