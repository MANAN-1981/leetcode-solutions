# Check Divisibility by Digit Sum and Product

<div align="center">

## 🟢 Easy • 📂 Math • 💻 Java

[Problem Link](https://leetcode.com/problems/check-divisibility-by-digit-sum-and-product/description/?envType=daily-question&envId=2026-08-22)

</div>

---

# 🧠 Approach

Solution submitted via LeetCode.

---

# 📊 Complexity Analysis

| Operation | Complexity |
|-----------|------------|
| Time | **N/A** |
| Space | **N/A** |

---

# 💻 Source Code

```java
class Solution {
    public boolean checkDivisibility(int n) {
        
        int num = n;
        int mulNum = n;
        int sum = 0;
        int mul = 1;

         while(num!=0){
            sum += num%10;  
            num = num/10;
            
            mul *= mulNum%10;  
            mulNum = mulNum/10;
        }

        if(n % (sum+mul) == 0){
            return true;
        }
        return false;
    }
}
```
