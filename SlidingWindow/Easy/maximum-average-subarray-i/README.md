# Maximum Average Subarray I

<div align="center">

## 🟢 Easy • 📂 SlidingWindow

[Problem Link](https://leetcode.com/problems/maximum-average-subarray-i/)

**Solutions:** `Java`

</div>

---

# 🧠 Approach

Maintain a window of size k, compute its sum, slide the window by subtracting the left element and adding the new right element, and keep track of the maximum average encountered.

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
    public double findMaxAverage(int[] nums, int k) {
        int left = 0;
		int right = (int)k-1;
		
		int n = nums.length;
		
		double windowAvg = 0;
		double maxAvg = Double.NEGATIVE_INFINITY;
		
		double sum = 0;
		    for(int i=left; i<=right; i++){
		        sum += nums[i];
		    }
		    windowAvg  = sum/k;
		    
		    if(maxAvg<windowAvg){
		        maxAvg = windowAvg;
		    }
		right++;

		while(right<n){
            sum = sum - nums[left] + nums[right];

            windowAvg = sum/k;

		    if(maxAvg<windowAvg){
		        maxAvg = windowAvg;
		    }
            
		    left++;
		    right++;
		}
    return maxAvg;
    }
}
```
<!-- /LCGH:SOLUTION -->
