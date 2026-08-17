# Valid Anagram

<div align="center">

## 🟢 Easy • 📂 Sorting • 💻 Java

[Problem Link](https://leetcode.com/problems/valid-anagram/submissions/2109655892/)

</div>

---

# 🧠 Approach

The approach used in the code first checks if the two input strings have the same length. If they do, it converts the strings to character arrays, sorts them, and then compares the sorted arrays. This approach works because anagrams are strings that contain the same characters, and sorting the characters in each string allows for a straightforward comparison.

---

# 📊 Complexity Analysis

| Operation | Complexity |
|-----------|------------|
| Time | **O(n log n)** |
| Space | **O(n)** |

---

# 💻 Source Code

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
