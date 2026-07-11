# Check If N and Its Double Exist

<div align="center">

## 🟢 Easy • 📂 Array • 💻 Java

[Problem Link](https://leetcode.com/problems/check-if-n-and-its-double-exist/)

</div>

---

# 🧠 Approach

The approach used in the code involves iterating over the input array and checking for each element if its double exists in the array. This is done by using two nested loops to compare each element with every other element in the array. If a match is found, the function immediately returns true.

---

# 📊 Complexity Analysis

| Operation | Complexity |
|-----------|------------|
| Time | **O(n^2)** |
| Space | **O(1)** |

---

# 💻 Source Code

```java
class Solution {
    public boolean checkIfExist(int[] nums) {

        boolean result = false;

        if (nums.length == 1) {
            result = false;
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {

                if (i != j) {
                    int mul = nums[j] * 2;

                    if (nums[i] == mul) {
                        result = true;
                    }
                }
            }
        }

        return result;

    }
}
```
