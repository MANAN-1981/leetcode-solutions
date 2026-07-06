# Max Consecutive Ones

<div align="center">

## 🟢 Easy • 📂 Array • 💻 Java

[Problem Link](https://leetcode.com/problems/max-consecutive-ones/)

</div>

---

# 🧠 Approach

This solution iterates through the given array, maintaining a count of consecutive ones and updating the maximum count found so far. It resets the count whenever it encounters a zero, effectively tracking the longest sequence of ones. The approach ensures a straightforward and efficient solution to the problem.

---

# 📊 Complexity Analysis

| Operation | Complexity |
|-----------|------------|
| Time | **O(n)** |
| Space | **O(1)** |

---

# 💻 Source Code

```java
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int count = 0;
		int live = 0;
		
			for (int i=0; i<nums.length; i++){
		    
		    if(nums[i] == 1){
		        count++;
		    }else{
                count = 0;
		    }
		    if(count > live){
		        live = count;
		    }
		} 
		return live;
    }
}
```
