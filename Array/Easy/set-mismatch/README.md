# Set Mismatch

<div align="center">

## 🟢 Easy • 📂 Array • 💻 Java

[Problem Link](https://leetcode.com/problems/set-mismatch/)

</div>

---

# 🧠 Approach

The approach used in the code involves sorting the input array and then iterating through it to find the duplicate and missing numbers. It checks for duplicate numbers by comparing adjacent elements, and it checks for missing numbers by looking for gaps in the sequence. The code also handles edge cases where the missing number is at the start or end of the sequence.

---

# 📊 Complexity Analysis

| Operation | Complexity |
|-----------|------------|
| Time | **O(n log n)** |
| Space | **O(1)** |

---

# 💻 Source Code

```java
class Solution {
    public int[] findErrorNums(int[] nums) {
        
        	int n = nums.length;
	    Arrays.sort(nums);
	    
	    int duplicate =-1;
	    int missing = -1;
	    
	    for(int i=1; i<n; i++){
	        if(nums[i] == nums[i-1]){
	            duplicate = nums[i];
	        }else if(nums[i] - nums[i-1] == 2){
	            missing = nums[i]-1;
	        }
	    }
	    if(nums[0] != 1){
	        missing = 1;
	    }
	    if(nums[n-1] != n){
                missing = n;
	    }
          
		return new int[] {duplicate , missing};
    }
}
```
