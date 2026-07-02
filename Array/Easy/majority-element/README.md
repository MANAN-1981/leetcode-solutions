# Majority Element

<div align="center">

## 🟢 Easy • 📂 Array • 💻 Java

[Problem Link](https://leetcode.com/problems/majority-element/)

</div>

---

# 🧠 Approach

The problem can be solved by sorting the array and then returning the middle element, as the majority element will be at the middle index after sorting. This approach works because the majority element occurs more than n/2 times, so it will always be at the middle index after sorting. The time complexity of this solution is O(n log n) due to the sorting operation.

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
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
       
        int half = (nums.length) / 2;

        return nums[half];
    }
}
```
