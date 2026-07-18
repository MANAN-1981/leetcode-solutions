# Find Greatest Common Divisor of Array

<div align="center">

## 🟢 Easy • 📂 Array • 💻 Java

[Problem Link](https://leetcode.com/problems/find-greatest-common-divisor-of-array/?envType=daily-question&envId=2026-07-18)

</div>

---

# 🧠 Approach

This solution first sorts the input array, then finds the greatest common divisor (GCD) of the smallest and largest numbers in the array using the Euclidean algorithm. The GCD of the smallest and largest numbers is the GCD of the entire array. This approach works because the GCD of a list of numbers is always the GCD of the smallest and largest numbers in the list.

---

# 📊 Complexity Analysis

| Operation | Complexity |
|-----------|------------|
| Time | **O(n log n)** |
| Space | **O(1)** |

---

# 💻 Source Code

```java
class Solution {

 public static int gcd(int a, int b) {
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}

    public int findGCD(int[] nums) {
        
        Arrays.sort(nums);

        return gcd(nums[0] , nums[nums.length-1]);
    }
}
```
