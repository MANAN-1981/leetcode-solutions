# Find Unique Binary String

<div align="center">

## 🟡 Medium • 📂 String

[Problem Link](https://leetcode.com/problems/find-unique-binary-string/)

**Solutions:** `Java`

</div>

---

# 🧠 Approach

Construct a binary string of length n by iterating through the diagonal of the input array. For each index i, if the i-th character of the i-th string is '0', append '1'; otherwise, append '0'. This guarantees the resulting string differs from every input string at the i-th position.

---

# 💻 Source Code

<!-- LCGH:SOLUTION lang="Java" -->
## 💻 Java

| Operation | Complexity |
|-----------|------------|
| Time | **O(n^2)** |
| Space | **O(n)** |

[`solution.java`](./solution.java)

```java
class Solution {
    public String findDifferentBinaryString(String[] nums) {

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < nums.length; i++) {

            if (nums[i].charAt(i) == '0') {
                ans.append('1');
            } else {
                ans.append('0');
            }
        }

        return ans.toString();
    }
}
```
<!-- /LCGH:SOLUTION -->
