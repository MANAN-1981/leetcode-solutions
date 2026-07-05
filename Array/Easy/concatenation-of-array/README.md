# Concatenation of Array

<div align="center">

## 🟢 Easy • 📂 Array • 💻 Java

[Problem Link](https://leetcode.com/problems/concatenation-of-array/)

</div>

---

# 🧠 Approach

The approach used in the code is to create a new array that is twice the size of the input array, then iterate through the new array and fill it with elements from the input array in a cyclic manner. This is achieved by using a secondary index that resets to 0 when it reaches the end of the input array. The result is a new array that is the concatenation of the input array with itself.

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
    public int[] getConcatenation(int[] nums) {
        
        int newNums[] = new int[nums.length * 2];
        
        int j=0;       
        
        for(int i=0; i<newNums.length; i++){
            if(j == nums.length){
                j = 0;
                i--;
            }else{
                newNums[i] = nums[j];
                j++;
            }
        }
        return newNums;
    }
}
```
