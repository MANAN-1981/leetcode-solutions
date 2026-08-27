# Digit Frequency Score

<div align="center">

## 🟢 Easy • 📂 Math

[Problem Link](https://leetcode.com/problems/digit-frequency-score/)

**Solutions:** `Java`

</div>

---

# 🧠 Approach

Use a frequency array of size 10 to count the occurrences of each digit in the number. Then, iterate through the digits (0-9) and calculate the sum of each digit multiplied by its frequency.

---

# 💻 Source Code

<!-- LCGH:SOLUTION lang="Java" -->
## 💻 Java

| Operation | Complexity |
|-----------|------------|
| Time | **O(log n)** |
| Space | **O(1)** |

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
