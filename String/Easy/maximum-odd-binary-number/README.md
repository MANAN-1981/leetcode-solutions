# Maximum Odd Binary Number

<div align="center">

## 🟢 Easy • 📂 String

[Problem Link](https://leetcode.com/problems/maximum-odd-binary-number/)

**Solutions:** `Java`

</div>

---

# 🧠 Approach

Convert the string to a character array and sort it to group all '0's at the beginning and '1's at the end. Then, swap the last '1' (which ensures the number is odd) with the first '0' (if any) to maximize the value by placing the largest possible digits at the most significant positions.

---

# 💻 Source Code

<!-- LCGH:SOLUTION lang="Java" -->
## 💻 Java

| Operation | Complexity |
|-----------|------------|
| Time | **O(n log n)** |
| Space | **O(n)** |

[`solution.java`](./solution.java)

```java
class Solution {
    public String maximumOddBinaryNumber(String s) {
        
        char arr[] = s.toCharArray();

        Arrays.sort(arr);

        int l = 0;
        int r = arr.length - 2;

        while(l<r){
            if(arr[l] < arr[r]){
                char temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
            }

            l++;
            r--;
        }
        return new String(arr);
    }
}
```
<!-- /LCGH:SOLUTION -->
