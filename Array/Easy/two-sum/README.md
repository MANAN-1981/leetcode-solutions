# Two Sum

**Difficulty:** Easy
**Topic:** Array
**Language:** Java
**LeetCode link:** https://leetcode.com/problems/two-sum/

## Approach

This solution uses a brute-force approach with nested loops. It iterates through every possible pair of distinct numbers in the input array. For each pair, it checks if their sum equals the target, returning their indices if a match is found.

## Complexity

- Time: O(n^2)
- Space: O(1)

## Code

```java
class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int n = nums.length;

        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                
                if(nums[i] + nums[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[]{};

    }
}
```
