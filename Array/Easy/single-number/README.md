# Single Number

**Difficulty:** Easy
**Topic:** Array
**Language:** Java
**LeetCode link:** https://leetcode.com/problems/single-number/submissions/2047056095/

## Approach

This solution uses the XOR operation to find the single number in the array. The XOR operation has the property that a ^ a = 0 and a ^ 0 = a, so when all numbers are XORed together, the numbers that appear twice will cancel each other out, leaving the single number. This approach allows for a simple and efficient solution to the problem.

## Complexity

- Time: O(n)
- Space: O(1)

## Code

```java
class Solution {
    public int singleNumber(int[] nums) {
        
       int count = nums[0];

       for(int i=1; i<nums.length; i++){
        count = count ^ nums[i];
       }
       return count;
    }
}
```
