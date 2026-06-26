# Remove Duplicates from Sorted Array

**Difficulty:** Easy
**Topic:** Array
**Language:** Java
**LeetCode link:** https://leetcode.com/problems/remove-duplicates-from-sorted-array/

## Approach

This solution uses a two-pointer approach to remove duplicates from a sorted array. It maintains a pointer k that keeps track of the position where the next non-duplicate element should be placed, and another pointer i that iterates through the array to find non-duplicate elements. By only incrementing k when a non-duplicate element is found, the solution effectively removes duplicates from the array in-place.

## Complexity

- Time: O(n)
- Space: O(1)

## Code

```java
class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        
        for (int i = 1; i< nums.length; i++){
           if (nums[k] != nums[i]){
            k++;
            nums[k] = nums[i];
           }
        }
        return k+1;
    }
}
```
