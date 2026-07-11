# Find if Digit Game Can Be Won

<div align="center">

## 🟢 Easy • 📂 Array • 💻 Java

[Problem Link](https://leetcode.com/problems/find-if-digit-game-can-be-won/description/?envType=problem-list-v2&envId=array)

</div>

---

# 🧠 Approach

The approach used in the code is to iterate through the array and separate the numbers into two sums: one for single-digit numbers and one for double-digit numbers. It then checks if the two sums are not equal. However, the given code seems to be incorrect as it does not consider the actual rules of the digit game and only checks for the inequality of the sums.

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
    public boolean canAliceWin(int[] arr) {

        int n = arr.length;

        int SiSum = 0;
        int DoSum = 0;

        for (int i = 0; i < n; i++) {

            if (arr[i] < 10) {
                SiSum += arr[i];
            }
            if (arr[i] >= 10) {
                DoSum += arr[i];
            }
        }
        return SiSum != DoSum;
    }
}
```
