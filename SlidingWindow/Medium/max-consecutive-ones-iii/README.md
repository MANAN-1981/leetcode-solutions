# Max Consecutive Ones III

<div align="center">

## 🟡 Medium • 📂 SlidingWindow

[Problem Link](https://leetcode.com/problems/max-consecutive-ones-iii/)

**Solutions:** `Java`

</div>

---

# 🧠 Approach

Maintain a sliding window using two pointers. Expand the right pointer while counting zeros in the window. If the zero count exceeds k, move the left pointer forward, decreasing the zero count as needed. Keep track of the maximum window size, which represents the longest subarray with at most k zeros.

---

# 💻 Source Code

<!-- LCGH:SOLUTION lang="Java" -->
## 💻 Java

| Operation | Complexity |
|-----------|------------|
| Time | **O(n)** |
| Space | **O(1)** |

[`solution.java`](./solution.java)

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
<!-- /LCGH:SOLUTION -->
