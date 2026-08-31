# Check Divisibility by Digit Sum and Product

<div align="center">

## 🟢 Easy • 📂 Array

[Problem Link](https://leetcode.com/problems/check-divisibility-by-digit-sum-and-product/)

**Solutions:** `Java`

</div>

---

# 🧠 Approach

Use a HashMap to store each value's index while iterating through the array. For every value, check whether target - value already exists.

---

# 💻 Source Code

<!-- LCGH:SOLUTION lang="Java" -->
## 💻 Java

| Operation | Complexity |
|-----------|------------|
| Time | **O(n)** |
| Space | **O(n)** |

[`solution.java`](./solution.java)

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
<!-- /LCGH:SOLUTION -->
