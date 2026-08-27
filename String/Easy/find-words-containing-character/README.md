# Find Words Containing Character

<div align="center">

## 🟢 Easy • 📂 String

[Problem Link](https://leetcode.com/problems/find-words-containing-character/)

**Solutions:** `Java`

</div>

---

# 🧠 Approach

Iterate through each word in the array. For each word, scan its characters to check if the target character exists. If found, add the current index to the result list and break the inner loop to avoid duplicate indices.

---

# 💻 Source Code

<!-- LCGH:SOLUTION lang="Java" -->
## 💻 Java

| Operation | Complexity |
|-----------|------------|
| Time | **O(N * M)** |
| Space | **O(1)** |

[`solution.java`](./solution.java)

```java
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        
         List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            for (char c : words[i].toCharArray()) {
                if (c == x) {
                    ans.add(i);
                    break;
                }
            }
        }

        return ans;
        
    }
}
```
<!-- /LCGH:SOLUTION -->
