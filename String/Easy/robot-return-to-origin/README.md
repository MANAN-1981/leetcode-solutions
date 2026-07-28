# Robot Return to Origin

<div align="center">

## 🟢 Easy • 📂 String • 💻 Java

[Problem Link](https://leetcode.com/problems/robot-return-to-origin/)

</div>

---

# 🧠 Approach

The approach used in the code iterates through each character in the input string, simulating the robot's movements by incrementing or decrementing the x and y coordinates accordingly. The function then checks if the robot has returned to the origin by verifying if both x and y coordinates are zero. This solution has a linear time complexity due to the single pass through the input string.

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
    public boolean judgeCircle(String moves) {
        
        int x = 0;
        int y = 0;

        for (int i = 0; i < moves.length(); i++) {
           if(moves.charAt(i) == 'R'){
               x++;
           }else if (moves.charAt(i) == 'L') {
               x--;
           }else if (moves.charAt(i) == 'U'){
               y++;
           }else if (moves.charAt(i) == 'D'){
               y--;
           } 
        }
        
        if(x == 0 && y == 0){
            return true;
        }else{
            return false;
        }
    }
}
```
