# Convert Integer To The Sum Of Two No Zero Integers

<div align="center">

## 🟢 Easy • 📂 Math • 💻 Java

[Problem Link](https://leetcode.com/problems/convert-integer-to-the-sum-of-two-no-zero-integers/)

</div>

---

# 🧠 Approach

The problem requires finding two non-zero integers that sum up to a given number. The provided solution uses a recursive approach to generate all numbers up to the given number and then checks all pairs of numbers to find the pair that sums up to the given number. However, this approach is inefficient and can be improved.

---

# 📊 Complexity Analysis

| Operation | Complexity |
|-----------|------------|
| Time | **O(n^2)** |
| Space | **O(n)** |

---

# 💻 Source Code

```java
class Solution {
    public int[] getNoZeroIntegers(int n) {
        int[] arr = new int[n];

        enter(n, arr);
        
        for(int i=0; i<arr.length; i++){
            if(String.valueOf(arr[i]).contains("0") == false){
            for(int j=0; j<arr.length; j++){
                if(String.valueOf(arr[j]).contains("0") == false){
            if(arr[i] + arr[j] == n){
                return new int[] {arr[i] , arr[j]};
            }
                }
            }
            }
        }
        
        return new int[0];
    }

    public static void enter(int n, int[] arr) {
        if (n == 0) {
            return;
        }

        arr[n - 1] = n;

        enter(n - 1, arr);
    }
    }

```

---

<div align="center">

⭐ If you found this solution helpful, consider giving this repository a star.

</div>
