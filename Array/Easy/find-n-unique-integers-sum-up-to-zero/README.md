# Find N Unique Integers Sum up to Zero

<div align="center">

## 🟢 Easy • 📂 Array • 💻 Java

[Problem Link](https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/submissions/2054173972/)

</div>

---

# 🧠 Approach

The approach used in the code involves creating an array of size n and filling it with pairs of positive and negative integers that sum up to zero. If n is odd, the last element is set to zero to ensure the sum of the array is zero. The code uses a simple iterative method to populate the array.

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
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        int sum = 0;
        int num = (int)(Math.random() * n) + 1;
        
        
        for (int i = 0; i < arr.length - 1; i += 2) {
            int fst = num++;
            int sec = fst * - 1;
            
            arr[i] = fst;
            arr[i+1] = sec;
            
            if(n%2 != 0){
                arr[arr.length - 1] = 0;
            }
    }
    return arr;
    }
}
```
