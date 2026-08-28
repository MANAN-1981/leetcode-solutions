# Find Greatest Common Divisor of Array

<div align="center">

## 🟢 Easy • 📂 Math

[Problem Link](https://leetcode.com/problems/find-greatest-common-divisor-of-array/)

**Solutions:** `Java`

</div>

---

# 🧠 Approach

Sort the array, then compute the GCD of the smallest and largest numbers using the Euclidean algorithm.

---

# 💻 Source Code

<!-- LCGH:SOLUTION lang="Java" -->
## 💻 Java

| Operation | Complexity |
|-----------|------------|
| Time | **O(n log n)** |
| Space | **O(1)** |

[`solution.java`](./solution.java)

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
<!-- /LCGH:SOLUTION -->
