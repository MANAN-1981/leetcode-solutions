# Smallest Index With Digit Sum Equal to Index

<div align="center">

## 🟢 Easy • 📂 Array • 💻 Java

[Problem Link](https://leetcode.com/problems/smallest-index-with-digit-sum-equal-to-index/submissions/2065701749/)

</div>

---

# 🧠 Approach

The approach used in the code iterates through each element in the array, calculates the sum of its digits, and checks if this sum equals its index. If a match is found, the index is immediately returned. If no match is found after checking all elements, the function returns -1.

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
    public int smallestIndex(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int sum = 0;

            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }

            if (sum == i) {
                return i;
            }
        }

        return -1;

    }
}
```
