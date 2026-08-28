# Convert Integer to the Sum of Two No-Zero Integers

<div align="center">

## 🟢 Easy • 📂 Math

[Problem Link](https://leetcode.com/problems/convert-integer-to-the-sum-of-two-no-zero-integers/)

**Solutions:** `Java`

</div>

---

# 🧠 Approach

Iterate over possible values from 1 to n-1, check if both numbers contain no zero digit (e.g., by converting to string) and if they sum to n, then return the pair.

---

# 💻 Source Code

<!-- LCGH:SOLUTION lang="Java" -->
## 💻 Java

| Operation | Complexity |
|-----------|------------|
| Time | **O(n)** |
| Space | **O(1)** |

[`solution.java`](./solution.java)

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
        System.gc();
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
<!-- /LCGH:SOLUTION -->
