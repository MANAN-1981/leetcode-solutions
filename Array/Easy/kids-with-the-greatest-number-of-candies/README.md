# Kids With the Greatest Number of Candies

<div align="center">

## 🟢 Easy • 📂 Array • 💻 Java

[Problem Link](https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/)

</div>

---

# 🧠 Approach

The approach used in the code involves first finding the maximum number of candies any kid has, then iterating through the array to check if each kid can have the greatest number of candies by adding the extra candies they have. This is done by comparing the sum of each kid's candies and the extra candies to the maximum number of candies. The result is stored in a list of boolean values indicating whether each kid can have the greatest number of candies.

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
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int n = candies.length;

        int max = candies[0];

        for (int i = 1; i < n; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }

        ArrayList<Boolean> al = new ArrayList<>(candies.length);

        for (int i = 0; i < n; i++) {
            if (candies[i] + extraCandies >= max) {
                al.add(true);
            } else {
                al.add(false);
            }
        }
        return al;
    }
}
```
