# Convert Integer To The Sum Of Two No Zero Integers

<div align="center">

## 🟢 Easy • 📂 Math • 💻 Java

[Problem Link](https://leetcode.com/problems/convert-integer-to-the-sum-of-two-no-zero-integers/)

</div>

---

# 🧠 Approach

This problem involves finding two non-zero integers that add up to a given number. The approach is to generate all possible pairs of non-zero integers and check if their sum equals the given number. The solution uses a recursive function to populate an array with numbers from 1 to n, and then iterates through the array to find a pair of numbers that meet the condition.

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
