# Palindrome Number

**Difficulty:** Easy
**Topic:** Math
**Language:** Java
**LeetCode link:** https://leetcode.com/problems/palindrome-number/

## Approach

This solution checks if a given number is a palindrome by reversing the number and comparing it with the original. It uses a while loop to extract each digit from the number and append it to the reversed number. If the reversed number equals the original, the function returns true, indicating the number is a palindrome.

## Complexity

- Time: O(log n)
- Space: O(1)

## Code

```java
class Solution {
    public boolean isPalindrome(int x) {
        
        int temp = x;
        int rev=0;

        if(x<0){
            return false;
        }
        while(temp != 0){

            int rem = temp%10;
            rev = rev*10+rem;
            temp /= 10;
        }

        if (rev == x){
            return true;
        }else{
            return false;
        }
    }
}
```
