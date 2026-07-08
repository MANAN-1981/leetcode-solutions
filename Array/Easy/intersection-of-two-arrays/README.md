# Intersection of Two Arrays

<div align="center">

## 🟢 Easy • 📂 Array • 💻 Java

[Problem Link](https://leetcode.com/problems/intersection-of-two-arrays/)

</div>

---

# 🧠 Approach

This solution uses a hash table to store the elements of the first array, then iterates over the second array to find common elements. It stores these common elements in another hash table to eliminate duplicates. Finally, it converts the hash table of common elements into an array and returns it. The use of hash tables allows for efficient lookups and insertions.

---

# 📊 Complexity Analysis

| Operation | Complexity |
|-----------|------------|
| Time | **O(n + m)** |
| Space | **O(n + m)** |

---

# 💻 Source Code

```java
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        HashSet<Integer> values = new HashSet<>();
        HashSet<Integer> inSection = new HashSet<>();

        int n1 = nums1.length;
	    int n2 = nums2.length;
		
		
		for(int i=0; i<n1; i++){
		    values.add(nums1[i]);
		}

		for(int i=0; i<n2; i++){
		   if(values.contains(nums2[i]) ){
                inSection.add(nums2[i]);
		   }
		}
		    
		int[] arr = new int[inSection.size()];
		int index = 0;
		
        for(int num : inSection){
            arr[index] = num;
            index++;
        }
        return arr;
    }
}
```
