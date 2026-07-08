# Max Consecutive Ones III

<div align="center">

## 🟡 Medium • 📂 Array • 💻 Java

[Problem Link](https://leetcode.com/problems/max-consecutive-ones-iii/submissions/2060704300/)

</div>

---

# 🧠 Approach

The approach used in the code is a sliding window technique, where we maintain a window of consecutive elements and expand it to the right while keeping track of the number of zeros within the window. If the number of zeros exceeds the allowed limit k, we shrink the window from the left until the number of zeros is within the limit. The maximum size of the window is updated at each step, giving us the longest sequence of ones that can be achieved by flipping at most k zeros.

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
    public int longestOnes(int[] nums, int k) {
        
        int n = nums.length;
	    
	    int l = 0;
	    
	    int maxWindow = 0;
	    int count = 0;
	    
	    
	    for(int i=0; i<n; i++){
	        int cWindow = 0;
	        
	        if(nums[i] == 0){
	            count++;
	        }
	        
	       while(count>k){
	           if(nums[l] == 0){
	               count--;
	           }
	           l++;
	       }
	       
	       cWindow = i-l+1;
	       
	       if(cWindow>maxWindow){
	           maxWindow = cWindow;
	       }
	    }

        return maxWindow;
    }
}
```
