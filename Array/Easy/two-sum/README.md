# Two Sum

<div align="center">

## 🟢 Easy • 📂 Array • 💻 C++

[Problem Link](https://leetcode.com/problems/two-sum/)

</div>

---

# 🧠 Approach

The two sum problem is solved by iterating over the array and checking every pair of elements to see if their sum equals the target. This approach is straightforward but not efficient for large arrays. The solution returns the indices of the two elements that add up to the target.

---

# 📊 Complexity Analysis

| Operation | Complexity |
|-----------|------------|
| Time | **O(n^2)** |
| Space | **O(1)** |

---

# 💻 Source Code

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

---

<div align="center">

⭐ If you found this solution helpful, consider giving this repository a star.

</div>
