# 

**Difficulty:** Easy
**Topic:** TwoPointers
**Language:** txt
**LeetCode link:** https://leetcode.com/problems/valid-palindrome/

## Approach

This solution uses a two-pointer approach to check if a given string is a palindrome. It first removes non-alphanumeric characters and converts the string to lowercase, then uses two pointers starting from the beginning and end of the string to compare characters. If all pairs of characters match, the string is a palindrome.

## Complexity

- Time: O(n)
- Space: O(n)

## Code

```txt
        int en = arr.length -1;
        int st = 0;
        String s = se.replaceAll("[^a-zA-Z0-9]" , "").toLowerCase();
        
class Solution {
    public boolean isPalindrome(String se) {
        if(s.length() == 0){
            return true;
        }
        char arr[] = s.toCharArray();


```
