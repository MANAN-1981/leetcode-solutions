# Goal Parser Interpretation

<div align="center">

## 🟢 Easy • 📂 String • 💻 Java

[Problem Link](https://leetcode.com/problems/goal-parser-interpretation/)

</div>

---

# 🧠 Approach

The code uses a StringBuilder to iterate through the command string, replacing specific patterns with their corresponding interpretations. It checks for occurrences of '()' and '(al)' and appends 'o' and 'al' respectively, while appending all other characters as is. This approach allows for efficient interpretation of the command string in a single pass.

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
    public String interpret(String command) {
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<command.length(); i++){
           if(command.charAt(i) == '(' && command.charAt(i+1) == ')'){
            sb.append("o");
            i++;
           }else if(command.charAt(i) == '(' && command.charAt(i+1) == 'a' && command.charAt(i+2) == 'l' && command.charAt(i+3) == ')'){
            sb.append("al");
            i = i + 3;
           }else{
            sb.append(command.charAt(i));
           }
        }

        return sb.toString();

    }
}
```
