# How Many Numbers Are Smaller Than the Current Number

<div align="center">

## 🟢 Easy • 📂 Array • 💻 Java

[Problem Link](https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/)

</div>

---

# 🧠 Approach

This solution uses a brute-force approach to compare each number in the input array with every other number, counting how many are smaller. It iterates over the array for each element, resulting in a time complexity of O(n^2). The counts are stored in a separate array, which is then returned as the result.

---

# 📊 Complexity Analysis

| Operation | Complexity |
|-----------|------------|
| Time | **O(n^2)** |
| Space | **O(n)** |

---

# 💻 Source Code

```java
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {

    int n = nums.length;
    
    int[] counters = new int[n];
        
    int index = 0;
        
    for(int i=0; i<n; i++){	       
	       int count = 0;           
                for(int j=0; j<n; j++){
                    if(nums[i] > nums[j]){
                            count++;
                        }
                    }
            counters[i] = count;
        }   
        return counters;
    }
}
```
