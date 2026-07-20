# Valid Perfect Square

<div align="center">

## 🟢 Easy • 📂 Math • 💻 Java

[Problem Link](https://leetcode.com/problems/valid-perfect-square/)

</div>

---

# 🧠 Approach

The approach used in the code is a binary search algorithm to find the square root of a given number. It iteratively narrows down the search range until it finds a perfect square or determines that the number is not a perfect square. This method takes advantage of the fact that the square of a number increases rapidly, allowing for efficient searching.

---

# 📊 Complexity Analysis

| Operation | Complexity |
|-----------|------------|
| Time | **O(log n)** |
| Space | **O(1)** |

---

# 💻 Source Code

```java
class Solution {
    public boolean isPerfectSquare(int num) {


        int l = 1;
        int r = num;

        while(l<=r)
        {
            int mid = l+(r-l)/2;
            long sq = (long)mid*mid;

            if(sq == num)
            {
                return true;
            }
           else if(sq >num)
            {
                r = mid-1;
            }
            else{
                l = mid+1;
            }

        }
        return false;
    }
}
```
