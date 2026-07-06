# Maximum Average Subarray I

<div align="center">

## 🟢 Easy • 📂 Array • 💻 Java

[Problem Link](https://leetcode.com/problems/maximum-average-subarray-i/description/)

</div>

---

# 🧠 Approach

The approach used in the code is a sliding window technique where we maintain a window of size k and calculate the average of the elements within the window. We then slide the window to the right and update the average, keeping track of the maximum average seen so far. This allows us to efficiently find the maximum average subarray of size k.

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
