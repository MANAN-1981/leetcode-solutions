# Contains Duplicate Ii

<div align="center">

## 🟢 Easy • 📂 Array • 💻 Java

[Problem Link](https://leetcode.com/problems/contains-duplicate-ii/)

</div>

---

# 🧠 Approach

This problem can be solved by checking every pair of elements in the array to see if there are any duplicates within a certain distance. The algorithm iterates over the array and checks each element with every other element within the given distance. If a duplicate is found, the function returns true. The solution has a time complexity of O(n*k) due to the nested loops. It is a simple and straightforward approach but not efficient for large inputs.

---

# 📊 Complexity Analysis

| Operation | Complexity |
|-----------|------------|
| Time | **O(n*k)** |
| Space | **O(1)** |

---

# 💻 Source Code

```java
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<= i+k && j < nums.length; j++){
                if(nums[i] == nums[j]){
                    if(j-i <= k){
                    return true;
                    }
                }
            }
        }
        System.gc();
        return false;
    }
}
```

---

<div align="center">

⭐ If you found this solution helpful, consider giving this repository a star.

</div>
