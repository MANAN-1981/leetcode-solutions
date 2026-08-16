# Number of Good Pairs

<div align="center">

## 🟢 Easy • 📂 Array • 💻 Java

[Problem Link](https://leetcode.com/problems/number-of-good-pairs/?utm_source=chatgpt.com)

</div>

---

# 🧠 Approach

This solution uses a frequency array to count the occurrences of each number in the input array. It then iterates over the array, incrementing the count of good pairs by the current frequency of each number. This approach allows for efficient counting of good pairs in a single pass through the input array.

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
    public int numIdenticalPairs(int[] nums) {

        int count = 0;
        int arr[] = new int[101];

        for(int i=0; i<nums.length; i++){
            count += arr[nums[i]];
            arr[nums[i]]++;
        }
        return count;
    }
}
```
