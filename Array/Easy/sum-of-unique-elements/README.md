# Sum Of Unique Elements

<div align="center">

## 🟢 Easy • 📂 Array • 💻 Java

[Problem Link](https://leetcode.com/problems/sum-of-unique-elements/)

</div>

---

# 🧠 Approach

This problem requires finding the sum of unique elements in an array. The approach involves iterating through the array and counting the occurrences of each element. If an element appears only once, it is added to the sum. The solution can be optimized using a hash table to store the counts of elements. The given code uses a brute-force approach with a time complexity of O(n^2).

---

# 📊 Complexity Analysis

| Operation | Complexity |
|-----------|------------|
| Time | **O(n^2)** |
| Space | **O(1)** |

---

# 💻 Source Code

```java
class Solution {
    public int sumOfUnique(int[] nums) {
        
        int sum = 0;
        
        
       for (int i = 0; i < nums.length; i++) {
            int count = 0;

            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if(count == 1){
                sum += nums[i];
            }
    }
             return sum;
}
}
```

---

<div align="center">

⭐ If you found this solution helpful, consider giving this repository a star.

</div>
