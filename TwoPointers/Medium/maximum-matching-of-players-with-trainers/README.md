# Maximum Matching of Players With Trainers

<div align="center">

## 🟡 Medium • 📂 TwoPointers

[Problem Link](https://leetcode.com/problems/maximum-matching-of-players-with-trainers/)

**Solutions:** `Java`

</div>

---

# 🧠 Approach

Sort both arrays and use two pointers to greedily match each player with the smallest trainer that can accommodate them.

---

# 💻 Source Code

<!-- LCGH:SOLUTION lang="Java" -->
## 💻 Java

| Operation | Complexity |
|-----------|------------|
| Time | **O(n log n)** |
| Space | **O(1)** |

[`solution.java`](./solution.java)

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
<!-- /LCGH:SOLUTION -->
