# Container With Most Water

<div align="center">

## 🟡 Medium • 📂 TwoPointers • 💻 Java

[Problem Link](https://leetcode.com/problems/container-with-most-water/)

</div>

---

# 🧠 Approach

This solution uses a two-pointer approach to find the maximum area that can be trapped between lines of different heights. It starts from both ends of the array and moves the pointer with the smaller height towards the center, calculating the area at each step. The maximum area found is returned as the result.

---

# 📊 Complexity Analysis

| Operation | Complexity |
|-----------|------------|
| Time | **O(n)** |
| Space | **O(1)** |

---

# 💻 Source Code

```java
class Solution {
    public int maxArea(int[] height) {

        int l = 0;
        int r = height.length - 1;

        int volume = 0;
        while (l < r) {

            int crVolume = Math.min(height[l], height[r]) * (r - l);
            volume = Math.max(volume, crVolume);

            if (height[l] > height[r]) {
                r--;
            } else {
                l++;
            }

        }
        return volume;
    }
}
```
