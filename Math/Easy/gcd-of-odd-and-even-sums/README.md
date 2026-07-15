# GCD of Odd and Even Sums

<div align="center">

## 🟢 Easy • 📂 Math • 💻 Java

[Problem Link](https://leetcode.com/problems/gcd-of-odd-and-even-sums/)

</div>

---

# 🧠 Approach

The approach used in the code calculates the sum of the first n odd numbers and the first n even numbers, then finds the greatest common divisor (GCD) of these two sums using a recursive function. The sum of odd and even numbers is calculated using simple iterative methods. The GCD is then computed using the Euclidean algorithm.

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

     public static int sumOdd(int a){
        int sum = 0;
        int count = 0;
        int num = 1;

        while (count < a) {
            sum += num;
            num += 2;
            count++;
        }
        return sum;
    }
    
    public static int sumEven(int a){
        int sum = 0;
        int count = 0;
        int num = 2;

        while (count < a) {
            sum += num;
            num += 2;
            count++;
        }
        return sum;
    }
   
    public static int GCD(int a , int b){
        
         if (b == 0) {
            return a;
        }
        return GCD(b, a % b);
    }


    public int gcdOfOddEvenSums(int n) {
        
        int odd = sumOdd(n);
	    int even = sumEven(n);
	    int answer = GCD(odd,even);

        return answer;
    }
}
```
