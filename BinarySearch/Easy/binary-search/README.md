# Binary Search

**Difficulty:** Easy
**Topic:** BinarySearch
**Language:** Java
**LeetCode link:** https://leetcode.com/problems/binary-search/

## Approach

This solution uses a binary search approach to find the target element in a sorted array. It iteratively divides the search interval in half and searches for the target in one of the two halves until it is found or the interval is empty. The binary search algorithm is efficient and effective for finding elements in sorted arrays.

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
