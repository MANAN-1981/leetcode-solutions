# Missing Number

**Difficulty:** Easy
**Topic:** Math
**Language:** Java
**LeetCode link:** https://leetcode.com/problems/missing-number/

## Approach

This solution calculates the expected sum of all numbers from 0 to n (where n is the length of the input array). It then iterates through the given array to compute the actual sum of its elements. The missing number is found by subtracting the actual sum from the expected sum.

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
