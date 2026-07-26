# Count Items Matching a Rule

<div align="center">

## 🟢 Easy • 📂 Array • 💻 Java

[Problem Link](https://leetcode.com/problems/count-items-matching-a-rule/submissions/)

</div>

---

# 🧠 Approach

The code iterates over a list of items and checks each item against a given rule, incrementing a counter when a match is found. It uses if-else statements to determine which index of the item list to check based on the rule key. The code returns the total count of items that match the rule.

---

# 📊 Complexity Analysis

| Operation | Complexity |
|-----------|------------|
| Time | **O(n)** |
| Space | **O(1)** |

---

# 💻 Source Code

```java
class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        
        int rows = items.size();

        int max = 0;

        if (ruleKey.equals("type")) {
            for (int i = 0; i < rows; i++) {
                if (items.get(i).get(0).equals(ruleValue)) {
                    max++;
                }
            }
        } else if (ruleKey.equals("color")) {
            for (int i = 0; i < rows; i++) {
                if (items.get(i).get(1).equals(ruleValue)) {
                    max++;
                }
            }
        } else {
            for (int i = 0; i < rows; i++) {
                if (items.get(i).get(2).equals(ruleValue)) {
                    max++;
                }
            }
        }

       return max;

    }
}
```
