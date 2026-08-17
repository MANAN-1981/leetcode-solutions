# Defanging an IP Address

<div align="center">

## 🟢 Easy • 📂 String • 💻 Java

[Problem Link](https://leetcode.com/problems/defanging-an-ip-address/submissions/2109594695/)

</div>

---

# 🧠 Approach

The approach used in the code is to utilize Java's built-in string replacement method to replace all occurrences of '.' with '[.]', effectively 'defanging' the IP address. This is a straightforward and efficient solution that takes advantage of Java's standard library. The replacement operation is performed in a single line of code, making it a concise and readable solution.

---

# 📊 Complexity Analysis

| Operation | Complexity |
|-----------|------------|
| Time | **O(n)** |
| Space | **O(n)** |

---

# 💻 Source Code

```java
class Solution {
    public String defangIPaddr(String address) {         

        return address.replace("." , "[.]");
    }
}
```
