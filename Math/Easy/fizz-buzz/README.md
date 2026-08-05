# Fizz Buzz

<div align="center">

## 🟢 Easy • 📂 Math • 💻 Java

[Problem Link](https://leetcode.com/problems/fizz-buzz/)

</div>

---

# 🧠 Approach

The solution uses a simple iterative approach to generate the Fizz Buzz sequence, checking each number from 1 to n for divisibility by 3 and 5, and appending the corresponding string to the result list. The code utilizes the modulo operator to determine whether a number is divisible by 3 or 5. The resulting list of strings is then returned as the solution.

---

# 📊 Complexity Analysis

| Operation | Complexity |
|-----------|------------|
| Time | **O(n)** |
| Space | **O(n)** |

---

# 💻 Source Code

```java
class Solution {
    public List<String> fizzBuzz(int n) {
        
        ArrayList<String> al = new ArrayList<>();

        for(int i=1; i<=n; i++){
            if(i%3==0 && i%5==0){
                al.add("FizzBuzz");
            }else if(i%3==0){
                al.add("Fizz");
            }else if(i%5==0){
                al.add("Buzz");
            }else{
                al.add("" + i);
            }
        }
        return al;
    }
}
```
