# Find Words Containing Character

<div align="center">

## 🟢 Easy • 📂 Array

[Problem Link](https://leetcode.com/problems/find-words-containing-character/)

**Solutions:** `Java`

</div>

---

# 🧠 Approach

Iterate through each word in the array, check each character of the word for the target character, and record the word's index when a match is found.

---

# 💻 Source Code

<!-- LCGH:SOLUTION lang="Java" -->
## 💻 Java

| Operation | Complexity |
|-----------|------------|
| Time | **O(n * m)** |
| Space | **O(1) additional** |

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
