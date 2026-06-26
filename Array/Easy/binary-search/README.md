# Binary Search

**Difficulty:** Easy
**Topic:** Array
**Language:** Java
**LeetCode link:** https://leetcode.com/problems/binary-search/

## Approach

The approach used in the code is a simple implementation of binary search, where we repeatedly divide the search interval in half until the target is found or the interval is empty. We use a while loop to continuously update the start and end pointers based on the comparison between the target and the middle element of the current interval. If the target is found, its index is returned; otherwise, -1 is returned to indicate that the target is not in the array.

## Complexity

- Time: O(log n)
- Space: O(1)

## Code

```java
class Solution {
    public int search(int[] nums, int target) {
        int st = 0;
        int end = nums.length - 1;

        while(st<=end){
            int mid = st + (end - st) / 2;

            if (target > nums[mid]){
                st = mid + 1;
            }else if(target < nums[mid]){
                end = mid - 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
```
