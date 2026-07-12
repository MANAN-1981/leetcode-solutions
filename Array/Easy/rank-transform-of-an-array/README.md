# Rank Transform of an Array

<div align="center">

## 🟢 Easy • 📂 Array • 💻 Java

[Problem Link](https://leetcode.com/problems/rank-transform-of-an-array/)

</div>

---

# 🧠 Approach

The approach used in the code involves first storing unique elements from the input array in a set, then sorting these unique elements. The rank of each element in the input array is determined by its position in the sorted list of unique elements, with the first unique element having a rank of 1. This is achieved using a binary search to find the position of each element in the sorted list.

---

# 📊 Complexity Analysis

| Operation | Complexity |
|-----------|------------|
| Time | **O(n log n)** |
| Space | **O(n)** |

---

# 💻 Source Code

```java
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        
        int n = arr.length;

		HashSet<Integer> filt = new HashSet<>();
		ArrayList<Integer> rank = new ArrayList<>();
		int price[] = new int[arr.length];

		for(int i = 0; i < n; i++) {
			filt.add(arr[i]);
		}

		for(int num : filt) {
			rank.add(num);
		}

		Collections.sort(rank);

		for(int i = 0; i < arr.length; i++) {
			 price[i] = Collections.binarySearch(rank, arr[i]) + 1;
		}

        return price;
    }
}
```
