# Jewels and Stones

<div align="center">

## 🟢 Easy • 📂 HashTable • 💻 Java

[Problem Link](https://leetcode.com/problems/jewels-and-stones/submissions/2106816457/?utm_source=chatgpt.com)

</div>

---

# 🧠 Approach

This solution uses a HashSet to store the unique jewels and then iterates over the stones to count the number of jewels found. The HashSet allows for efficient lookups, making the overall approach straightforward and simple. By utilizing this data structure, the code achieves a linear time complexity.

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
