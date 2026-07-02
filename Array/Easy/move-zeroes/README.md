# Move Zeroes

<div align="center">

## 🟢 Easy • 📂 Array • 💻 Java

[Problem Link](https://leetcode.com/problems/move-zeroes/)

</div>

---

# 🧠 Approach

The problem requires moving all zeroes in an array to the end while maintaining the relative order of non-zero elements. This can be achieved by iterating through the array and swapping non-zero elements with the next available position. The provided code attempts to solve this problem but contains logical errors.

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
    public void moveZeroes(int[] nums) {
        
    for (int i=0; i<nums.length; i++){
        for(int j=i+1; j<nums.length; j++){
            if(nums[i] == 0){
                if(nums[j] != 0 || nums[j] == 0){
                    int temp = nums[i];
                    int fr = nums[i]=nums[j];
                    int se = nums[j]=temp;
                }
            }
        }
    }
  }
}
```
