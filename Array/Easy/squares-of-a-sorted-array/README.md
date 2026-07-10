# Squares of a Sorted Array

<div align="center">

## 🟢 Easy • 📂 Array • 💻 Java

[Problem Link](https://leetcode.com/problems/squares-of-a-sorted-array/)

</div>

---

# 🧠 Approach

This solution uses a two-pointer approach to iterate through the input array from both ends, comparing the squares of the values at the left and right pointers and placing the larger square at the end of the result array. The pointers are then moved accordingly, ensuring that the result array is filled in descending order. This approach takes advantage of the fact that the input array is already sorted.

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
    public int[] sortedSquares(int[] nums) {

        int n = nums.length;
        int[] ans = new int[n];

        int left = 0;
        int right = n - 1;
        int index = n - 1;

        while (left <= right) {

            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {
                ans[index] = leftSquare;
                left++;
            } else {
                ans[index] = rightSquare;
                right--;
            }

            index--;
        }

        return ans;
    }
}
```
