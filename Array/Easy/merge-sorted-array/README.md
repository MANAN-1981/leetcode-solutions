# 

**Difficulty:** Easy
**Topic:** Array
**Language:** txt
**LeetCode link:** https://leetcode.com/problems/merge-sorted-array/

## Approach

This solution merges two arrays by replacing zeros in the first array with elements from the second array, then sorts the resulting array. The approach uses a simple iteration to replace zeros and the built-in sort function to arrange the elements in ascending order. The time complexity is dominated by the sorting operation.

## Complexity

- Time: O(n log n)
- Space: O(1)

## Code

```txt
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = 0;
        
        for(int i=0; i<nums1.length; i++){
            if(nums1[i] == 0){
                nums1[i] = nums2[k];
                k++;
            }
        }
    }
        Arrays.sort(nums1);
}

```
