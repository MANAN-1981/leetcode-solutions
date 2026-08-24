# Find Unique Binary String

<div align="center">

## 🟡 Medium • 📂 Array • 💻 Java

[Problem Link](https://leetcode.com/problems/find-unique-binary-string/)

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
