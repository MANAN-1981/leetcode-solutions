# Remove Element

<div align="center">

## 🟢 Easy • 📂 Array • 💻 Java

[Problem Link](https://leetcode.com/problems/remove-element/)

</div>

---

# 🧠 Approach

This solution uses a two-pointer approach to remove a specified value from an array. It iterates through the array, copying elements that do not match the target value to the front of the array. The function returns the new length of the modified array, effectively removing the target value. This approach ensures that all elements not equal to the target value are moved to the front of the array in their original order.

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
    public int removeElement(int[] nums, int val) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}
```
