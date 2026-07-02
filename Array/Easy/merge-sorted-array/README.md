# Merge Sorted Array

<div align="center">

## 🟢 Easy • 📂 Array • 💻 Java

[Problem Link](https://leetcode.com/problems/merge-sorted-array/)

</div>

---

# 🧠 Approach

This problem involves merging two sorted arrays into one sorted array. The approach used here is to first fill the remaining space in the first array with elements from the second array and then sort the first array. The time complexity of this approach is O((m+n)log(m+n)) due to the sorting operation.

---

# 📊 Complexity Analysis

| Operation | Complexity |
|-----------|------------|
| Time | **O((m+n)log(m+n))** |
| Space | **O(1)** |

---

# 💻 Source Code

```java
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       
        for(int i=m; i<nums1.length; i++){
            if(nums1[i] == 0){
                nums1[i] = nums2[n-1];
                n--;
            }
        }
        Arrays.sort(nums1);
    }
}
```

---

<div align="center">

⭐ If you found this solution helpful, consider giving this repository a star.

</div>
