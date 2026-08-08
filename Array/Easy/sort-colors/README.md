# Sort Colors

<div align="center">

## 🟢 Easy • 📂 Array • 💻 Java

[Problem Link](https://leetcode.com/problems/sort-colors/)

</div>

---

# 🧠 Approach

This solution uses a counting approach to sort the colors in the array. It first counts the occurrences of each color (0, 1, and 2) and then reconstructs the array with the colors in the correct order. This approach allows for a simple and efficient solution with minimal extra space required.

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
