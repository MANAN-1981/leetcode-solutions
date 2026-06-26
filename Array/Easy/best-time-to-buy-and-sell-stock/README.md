# Best Time to Buy and Sell Stock

**Difficulty:** Easy
**Topic:** Array
**Language:** Go
**LeetCode link:** https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

## Approach

This solution iterates through the array of stock prices, keeping track of the minimum price encountered so far and the maximum profit that can be achieved. It updates the minimum price whenever it finds a lower price, and updates the maximum profit whenever it finds a price that would result in a higher profit. This approach ensures that the solution finds the best time to buy and sell the stock in a single pass through the array.

## Complexity

- Time: O(n)
- Space: O(1)

## Code

```go
func maxProfit(prices []int) int {
    mp := 0
    minPrice := 2147483647
   
    for _ ,p := range prices{
        if p < minPrice{
            minPrice = p
        }else if ( p - minPrice ) > mp {
            mp = p - minPrice
        }
    }
    return mp
}
```
