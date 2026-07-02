# Best Time To Buy And Sell Stock

<div align="center">

## 🟢 Easy • 📂 Array • 💻 Java

[Problem Link](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/)

</div>

---

# 🧠 Approach

This problem can be solved by iterating through the array of stock prices and keeping track of the minimum price seen so far. The maximum profit is then calculated by subtracting the minimum price from the current price. The algorithm iterates through the array once, making it efficient. The solution uses a greedy approach to find the maximum profit.

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
