# Convert the Temperature

<div align="center">

## 🟢 Easy • 📂 Math • 💻 Java

[Problem Link](https://leetcode.com/problems/convert-the-temperature/?utm_source=chatgpt.com)

</div>

---

# 🧠 Approach

The approach used in the code is to apply the temperature conversion formulas directly. It converts the given Celsius temperature to Kelvin and Fahrenheit, and returns the results in an array. The conversions are done using the formulas celsius + 273.15 for Kelvin and celsius * 1.80 + 32.00 for Fahrenheit.

---

# 📊 Complexity Analysis

| Operation | Complexity |
|-----------|------------|
| Time | **O(1)** |
| Space | **O(1)** |

---

# 💻 Source Code

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
