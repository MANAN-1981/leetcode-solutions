# Maximum Odd Binary Number

<div align="center">

## 🟢 Easy • 📂 Math • 💻 Java

[Problem Link](https://leetcode.com/problems/maximum-odd-binary-number/)

</div>

---

# 🧠 Approach

Solution submitted via LeetCode.

---

# 📊 Complexity Analysis

| Operation | Complexity |
|-----------|------------|
| Time | **N/A** |
| Space | **N/A** |

---

# 💻 Source Code

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
