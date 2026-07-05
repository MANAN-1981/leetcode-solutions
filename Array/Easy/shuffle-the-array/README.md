# Shuffle the Array

<div align="center">

## 🟢 Easy • 📂 Array • 💻 Java

[Problem Link](https://leetcode.com/problems/shuffle-the-array/submissions/2057125160/?envType=problem-list-v2&envId=dsa-linear-shoal-array-i)

</div>

---

# 🧠 Approach

The approach used in the code is to create a new array and fill it with elements from the input array in a shuffled manner. It does this by iterating over the first half of the input array and placing each element and its corresponding element from the second half of the array into the new array in an alternating pattern. This results in the desired shuffled array.

---

# 📊 Complexity Analysis

| Operation | Complexity |
|-----------|------------|
| Time | **O(n)** |
| Space | **O(n)** |

---

# 💻 Source Code

```java
class Solution {
    public int[] shuffle(int[] nums, int n) {
       
       int arr[] = new int[nums.length];

       int j = 0;

       for(int i=0; i<n; i++){
        arr[j] = nums[i];
        arr[j+1] = nums[i+n];
        j = j + 2;
       }

       return arr;
    }
}
```
