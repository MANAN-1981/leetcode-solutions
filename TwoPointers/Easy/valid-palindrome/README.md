# Valid Palindrome

**Difficulty:** Easy
**Topic:** TwoPointers
**Language:** Java
**LeetCode link:** https://leetcode.com/problems/valid-palindrome/

## Approach

This solution uses a two-pointer approach to check if a given string is a palindrome. It first removes non-alphanumeric characters and converts the string to lowercase, then compares characters from the start and end of the string, moving towards the center. If all pairs of characters match, the string is a palindrome.

## Complexity

- Time: O(n)
- Space: O(n)

## Code

```java
class Solution {
    public boolean isPalindrome(String se) {
        
        String s = se.replaceAll("[^a-zA-Z0-9]" , "").toLowerCase();
        if(s.length() == 0){
            return true;
        }
        char arr[] = s.toCharArray();
        int st = 0;
        int en = arr.length -1;

        while(st <= en){
            if(arr[st] != arr[en]){
                return false;
            }   
            else{                
               st++;
               en--;
            }   
        }
        return true;
    }
}
```
