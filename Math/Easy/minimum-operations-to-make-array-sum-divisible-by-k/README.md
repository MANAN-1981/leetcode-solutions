# Minimum Operations to Make Array Sum Divisible by K

<div align="center">

## 🟢 Easy • 📂 Math

[Problem Link](https://leetcode.com/problems/minimum-operations-to-make-array-sum-divisible-by-k/)

**Solutions:** `Java`

</div>

---

# 🧠 Approach

Calculate the sum of the array. The number of operations required to make the sum divisible by K is the remainder of the sum divided by K (sum % K), as each operation decreases the sum by 1.

---

# 💻 Source Code

<!-- LCGH:SOLUTION lang="Java" -->
## 💻 Java

| Operation | Complexity |
|-----------|------------|
| Time | **O(n)** |
| Space | **O(1)** |

[`solution.java`](./solution.java)

```java
class Solution {
    public int minOperations(int[] arr, int k) {

        int l = 0;
        int r = arr.length - 1;

        int sum = 0;

        while (l <= r) {

            if (l == r) {
                sum += arr[l];
            } else {
                sum += arr[l] + arr[r];
            }
            l++;
            r--;
        }

        int counter = 0;

        while (sum % k != 0) {
            sum--;
            counter++;
        }

        return counter;
    }
}
```
<!-- /LCGH:SOLUTION -->
