# Jewels and Stones

<div align="center">

## 🟢 Easy • 📂 String

[Problem Link](https://leetcode.com/problems/jewels-and-stones/)

**Solutions:** `Java`

</div>

---

# 🧠 Approach

Store each jewel character in a hash set (or hash map) for O(1) lookups, then iterate over the stones string and count how many characters appear in the set.

---

# 💻 Source Code

<!-- LCGH:SOLUTION lang="Java" -->
## 💻 Java

| Operation | Complexity |
|-----------|------------|
| Time | **O(n + m)** |
| Space | **O(k)** |

[`solution.java`](./solution.java)

```java
class Solution {
    public int numJewelsInStones(String jewels, String stones) {

        HashSet<Character> set = new HashSet<>();
        int count = 0;

        for (int i = 0; i < jewels.length(); i++) {
            set.add(jewels.charAt(i));
        }
        
        for (int i = 0; i < stones.length(); i++) {
            if (set.contains(stones.charAt(i))) {
                count++;
            }
        }

        return count;
    }
}
```
<!-- /LCGH:SOLUTION -->
