# Count Digit Appearances

<div align="center">

## 🟡 Medium • 📂 Math

[Problem Link](https://leetcode.com/problems/count-digit-appearances/)

**Solutions:** `Java`

</div>

---

# 🧠 Approach

Iterate through each number in the array. For each number, repeatedly extract the last digit using modulo 10 and compare it with the target digit. Increment the count if they match, then remove the last digit by integer division by 10 until the number becomes 0.

---

# 💻 Source Code

<!-- LCGH:SOLUTION lang="Java" -->
## 💻 Java

| Operation | Complexity |
|-----------|------------|
| Time | **O(N * D)** |
| Space | **O(1)** |

[`solution.java`](./solution.java)

```java
class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {

        int count = 0;

        for (int k = 0; k < nums.length; k++) {

            while (nums[k] != 0) {

                int val = nums[k] % 10;

                if (val == digit) {
                    count++;
                }

                nums[k] = nums[k] / 10;
            }
        }

        return count;

    }
}
```
<!-- /LCGH:SOLUTION -->
