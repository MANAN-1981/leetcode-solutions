# 

**Difficulty:** Easy
**Topic:** Array
**Language:** txt
**LeetCode link:** https://leetcode.com/problems/single-number/description/

## Approach

This solution uses the XOR operation to find the single number in the array. The XOR operation has the property that a ^ a = 0 and a ^ 0 = a, so when all numbers are XORed together, the duplicates will cancel out and the single number will remain. This approach allows for a simple and efficient solution to the problem.

## Complexity

- Time: O(n)
- Space: O(1)

## Code

```txt
class Solution {
    public int singleNumber(int[] nums) {
        
       int count = nums[0];

       for(int i=1; i<nums.length; i++){
        count = count ^ nums[i];
       }
    }
       return count;
}

```
