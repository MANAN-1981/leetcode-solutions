# Majority Element

<div align="center">

## 🟢 Easy • 📂 Array • 💻 Java

[Problem Link](https://leetcode.com/problems/majority-element/)

</div>

---

# 🧠 Approach

This problem can be solved by sorting the array and then finding the middle element, which will be the majority element. The majority element is the element that appears more than n/2 times where n is the size of the array. This approach works because the majority element will always be at the middle index after sorting.

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

---

<div align="center">

⭐ If you found this solution helpful, consider giving this repository a star.

</div>
