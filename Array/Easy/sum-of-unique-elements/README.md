# Sum Of Unique Elements

<div align="center">

## 🟢 Easy • 📂 Array • 💻 Java

[Problem Link](https://leetcode.com/problems/sum-of-unique-elements/)

</div>

---

# 🧠 Approach

This problem can be solved by iterating over the array and counting the occurrences of each element. If an element appears only once, it is added to the sum. The solution has a time complexity of O(n^2) due to the nested loops. The algorithm is straightforward but not efficient for large inputs.

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
