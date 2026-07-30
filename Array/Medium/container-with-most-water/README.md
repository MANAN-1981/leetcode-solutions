# Container With Most Water

<div align="center">

## 🟡 Medium • 📂 Array • 💻 Java

[Problem Link](https://leetcode.com/problems/container-with-most-water/submissions/2087754281/)

</div>

---

# 🧠 Approach

This solution uses a two-pointer approach, starting from both ends of the array and moving towards the center. It calculates the area between the two pointers at each step and keeps track of the maximum area found. The pointer with the smaller height is moved towards the center, as moving the pointer with the larger height would not increase the area.

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
