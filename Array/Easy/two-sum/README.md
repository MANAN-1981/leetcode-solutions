# Two Sum

**Difficulty:** Easy
**Topic:** Array
**Language:** C++
**LeetCode link:** https://leetcode.com/problems/two-sum/

## Approach

The approach used in the code is a brute force solution that checks every pair of numbers in the array to see if they add up to the target. It uses nested loops to compare each number with every other number that comes after it. However, the provided code has a logical error and does not correctly implement the two sum problem.

## Complexity

- Time: O(n^2)
- Space: O(1)

## Code

```cpp
class Solution {
public:
vector<int> twoSum(vector<int>& nums, int target) {
int n=nums.size();
vector<int>ans;
   for(int i=0;i<n;i++)
    {
        int e=i;
        for(int j=i;j+1<n;j++)
        {
            if(nums[i]+nums[j+1]==target)
            {
            ans.push_back(e);
            ans.push_back(j+1);
            }
        }
    }
    return ans;
 }
};
```
