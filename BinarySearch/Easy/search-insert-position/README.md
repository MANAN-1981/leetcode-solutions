# Search Insert Position

**Difficulty:** Easy
**Topic:** BinarySearch
**Language:** Java
**LeetCode link:** https://leetcode.com/problems/search-insert-position/

## Approach

The approach used in this code is a binary search algorithm that iterates through a sorted array to find the target value. If the target is found, the function returns its index; otherwise, it returns the index where the target should be inserted to maintain the sorted order. This is achieved by adjusting the search boundaries based on comparisons between the target and the middle element of the current search range.

## Complexity

- Time: O(log n)
- Space: O(1)

## Code

```java
class Solution {
    public int searchInsert(int[] nums, int target) {
  
    int st = 0;
    int end = nums.length - 1;
    int index = 0;

    while(st <= end){
       int mid = st + (end - st) / 2;
       
       if(target == nums[mid]){
           index = mid;
           return index;
       }else if(target > nums[mid]){
           st = mid + 1;
       }else if (target < nums[mid]){
           end = mid - 1;
       }
    }
    return st;
    }
}
```
