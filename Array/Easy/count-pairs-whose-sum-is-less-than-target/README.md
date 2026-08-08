# Count Pairs Whose Sum is Less than Target

<div align="center">

## 🟢 Easy • 📂 Array • 💻 Java

[Problem Link](https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/)

</div>

---

# 🧠 Approach

This solution uses a two-pointer approach with a sorted array to efficiently count pairs whose sum is less than the target. It maintains two pointers, one at the start and one at the end of the array, and moves them based on whether the sum of the values at the pointers is less than the target. By doing so, it can count all valid pairs in a single pass through the array.

---

# 📊 Complexity Analysis

| Operation | Complexity |
|-----------|------------|
| Time | **O(n log n)** |
| Space | **O(1)** |

---

# 💻 Source Code

```java
class Solution {
    public int countPairs(List<Integer> nums, int target) {

        int n = nums.size();

        Collections.sort(nums);

        int count = 0;

        int l = 0;
        int r = n - 1;

        while (l < r) {

            if (nums.get(l) + nums.get(r) < target) {

                count += r - l;
                l++;

            } else {
                r--;
            }
        }

        return count;
    }
}
```
