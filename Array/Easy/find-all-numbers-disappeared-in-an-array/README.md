# Find All Numbers Disappeared in an Array

<div align="center">

## 🟢 Easy • 📂 Array • 💻 Java

[Problem Link](https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/)

</div>

---

# 🧠 Approach

This solution uses a HashSet to store the values present in the input array, then iterates over the range from 1 to the length of the array to find the numbers that are not present in the HashSet. The result is a list of numbers that disappeared in the array. This approach allows for efficient lookups and insertions in the HashSet.

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
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        HashSet<Integer> values = new HashSet<>();
		int n = nums.length;
		
        ArrayList<Integer> notPresent = new ArrayList<>();
		
        for(int i=0; i<n; i++){
		    values.add(nums[i]);
		}
		
		for(int i=1; i<=n; i++){
		    if(!values.contains(i)){
		        notPresent.add(i);
		    }
		}
        return notPresent;
    }
}
```
