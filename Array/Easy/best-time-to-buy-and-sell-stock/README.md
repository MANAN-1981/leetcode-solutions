# Best Time to Buy and Sell Stock

**Difficulty:** Easy
**Topic:** Array
**Language:** Java
**LeetCode link:** https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

## Approach

This solution iterates through the array of stock prices to find the maximum possible profit by keeping track of the minimum price encountered so far and updating the maximum profit whenever a higher profit is found. It uses a simple and efficient approach to solve the problem in linear time. The code maintains two key variables: minPrice to store the minimum price seen so far, and maxProfit to store the maximum profit that can be achieved.

## Complexity

- Time: O(n)
- Space: O(1)

## Code

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
