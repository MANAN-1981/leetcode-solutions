# Best Time To Buy And Sell Stock

<div align="center">

## 🟢 Easy • 📂 Array • 💻 Java

[Problem Link](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/)

</div>

---

# 🧠 Approach

This problem can be solved by iterating through the array of stock prices and keeping track of the minimum price seen so far. The maximum profit can be calculated by subtracting the minimum price from the current price. The solution has a time complexity of O(n) and a space complexity of O(1), making it efficient for large inputs. The algorithm uses a greedy approach to find the maximum profit.

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
    public int maxProfit(int[] prices) {
       
      int maxProfit = 0;
      int profit = 0;

      int minPrice = prices[0];

      for (int i = 1; i<prices.length; i++){
        if (prices[i] < minPrice){
            minPrice = prices[i];
        }
        profit = prices[i] - minPrice;

        if (profit>maxProfit){
            maxProfit = profit;
        }

      }
      return maxProfit;
    }
}
```

---

<div align="center">

⭐ If you found this solution helpful, consider giving this repository a star.

</div>
