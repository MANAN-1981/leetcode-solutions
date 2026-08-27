# Digit Frequency Score

<div align="center">

## 🟢 Easy • 📂 HashTable

[Problem Link](https://leetcode.com/problems/digit-frequency-score/)

**Solutions:** `Java`

</div>

---

# 🧠 Approach

Solution submitted via LeetCode (AI summary unavailable).

---

# 💻 Source Code

<!-- LCGH:SOLUTION lang="Java" -->
## 💻 Java

| Operation | Complexity |
|-----------|------------|
| Time | **N/A** |
| Space | **N/A** |

[`solution.java`](./solution.java)

```java
class Solution {
    public int digitFrequencyScore(int n) {
        
        int arr[] = new int[10];

        while (n != 0) {
            int temp = n % 10;
            arr[temp]++;
            n = n / 10;
        }

        int l = 0;
        int r = arr.length - 1;

        int sum = 0;

        while (l <= r) {

            if (l == r) {
                if (arr[l] > 0) {
                    sum += arr[l] * l;
                }
            } else {
                if (arr[l] > 0) {
                    sum += arr[l] * l;
                }

                if (arr[r] > 0) {
                    sum += arr[r] * r;
                }
            }

            l++;
            r--;
        }

        return sum;
    }
}
```
<!-- /LCGH:SOLUTION -->
