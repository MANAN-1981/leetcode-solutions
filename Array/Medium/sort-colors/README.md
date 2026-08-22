# Sort Colors

<div align="center">

## 🟡 Medium • 📂 Array • 💻 Java

[Problem Link](https://leetcode.com/problems/sort-colors/)

</div>

---

# 🧠 Approach

Solution submitted via LeetCode.

---

# 📊 Complexity Analysis

| Operation | Complexity |
|-----------|------------|
| Time | **N/A** |
| Space | **N/A** |

---

# 💻 Source Code

```java
class Solution {
    public void sortColors(int[] arr) {

        int zero = 0;
        int one = 0;
        int two = 0;

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                zero++;
            } else if (arr[i] == 1) {
                one++;
            } else {
                two++;
            }
        }

        int it = 0;

        for (int i = 0; i < zero; i++) {
            arr[it] = 0;
            it++;
        }
        for (int i = 0; i < one; i++) {
            arr[it] = 1;
            it++;
        }
        for (int i = 0; i < two; i++) {
            arr[it] = 2;
            it++;
        }

    }
}
```
