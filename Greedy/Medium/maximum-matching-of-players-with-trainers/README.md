# Maximum Matching of Players With Trainers

<div align="center">

## 🟡 Medium • 📂 Greedy

[Problem Link](https://leetcode.com/problems/maximum-matching-of-players-with-trainers/)

**Solutions:** `Java`

</div>

---

# 🧠 Approach

Sort both the players and trainers arrays. Use two pointers to iterate through both arrays. If the current player's ability is less than or equal to the current trainer's strength, match them and increment both pointers. Otherwise, move to the next trainer. This greedy approach ensures the maximum number of matches.

---

# 💻 Source Code

<!-- LCGH:SOLUTION lang="Java" -->
## 💻 Java

| Operation | Complexity |
|-----------|------------|
| Time | **O(n log n + m log m)** |
| Space | **O(log n + log m)** |

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
