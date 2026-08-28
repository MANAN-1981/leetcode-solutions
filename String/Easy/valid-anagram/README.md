# Valid Anagram

<div align="center">

## 🟢 Easy • 📂 String

[Problem Link](https://leetcode.com/problems/valid-anagram/)

**Solutions:** `Java`

</div>

---

# 🧠 Approach

Sort both strings, then use two pointers to compare corresponding characters from both ends; if all match, they are anagrams.

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
    public boolean isAnagram(String a, String b) {

        if(a.length() != b.length()){
            return false;
        }
        
        char arr[] = a.toCharArray();
        char brr[] = b.toCharArray();


        Arrays.sort(arr);
        Arrays.sort(brr);


        int l = 0;
        int r = arr.length - 1;

        while (l <= r) {
            if (arr[l] == brr[l] && arr[r] == brr[r]) {
                l++;
                r--;
            } else {
               return false;
            }
        }
    return true;
    }
}
```
<!-- /LCGH:SOLUTION -->
