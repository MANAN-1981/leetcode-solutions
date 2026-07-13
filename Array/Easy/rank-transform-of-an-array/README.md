# Rank Transform of an Array

<div align="center">

## 🟢 Easy • 📂 Array • 💻 Java

[Problem Link](https://leetcode.com/problems/rank-transform-of-an-array/)

</div>

---

# 🧠 Approach

The approach used in the code involves first adding all unique elements from the input array to a set, then sorting these unique elements in ascending order. It then uses binary search to find the rank of each element in the sorted list, adding 1 to the result to get the final rank. This approach ensures that equal elements have the same rank, and the ranks are consecutive integers starting from 1.

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
