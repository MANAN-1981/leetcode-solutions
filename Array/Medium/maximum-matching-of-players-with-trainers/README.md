# Maximum Matching of Players With Trainers

<div align="center">

## 🟡 Medium • 📂 Array • 💻 Java

[Problem Link](https://leetcode.com/problems/maximum-matching-of-players-with-trainers/)

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
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        
         Arrays.sort(players);
        Arrays.sort(trainers);

        int i = 0;
        int j = 0;
        int count = 0;

        while (i < players.length && j < trainers.length) {

            if (players[i] <= trainers[j]) {
                count++;
                i++;
                j++;
            } else {
                j++;
            }
        }

        return count;
    }
}
```
