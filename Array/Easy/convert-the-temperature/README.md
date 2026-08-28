# Convert the Temperature

<div align="center">

## 🟢 Easy • 📂 Array

[Problem Link](https://leetcode.com/problems/convert-the-temperature/)

**Solutions:** `Java`

</div>

---

# 🧠 Approach

Use a HashMap to store each value's index while iterating through the array. For every value, check whether target - value already exists.

---

# 💻 Source Code

<!-- LCGH:SOLUTION lang="Java" -->
## 💻 Java

| Operation | Complexity |
|-----------|------------|
| Time | **O(n)** |
| Space | **O(n)** |

[`solution.java`](./solution.java)

```java
class Solution {
    public double[] convertTemperature(double celsius) {
        
        double[] sol = new double[2];

        sol[0] = celsius + 273.15;
        sol[1] = celsius * 1.80 + 32.00;

        return sol;

    }
}
```
<!-- /LCGH:SOLUTION -->
