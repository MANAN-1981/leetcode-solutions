# Longest Substring Without Repeating Characters

<div align="center">

## 🟡 Medium • 📂 SlidingWindow • 💻 Java

[Problem Link](https://leetcode.com/problems/longest-substring-without-repeating-characters/submissions/2061164399/)

</div>

---

# 🧠 Approach

This solution uses a sliding window approach with a HashSet to track unique characters within the current window. It iterates over the string, expanding the window to the right and contracting it from the left when a repeating character is found. The maximum length of the substring without repeating characters is updated accordingly.

---

# 📊 Complexity Analysis

| Operation | Complexity |
|-----------|------------|
| Time | **O(n)** |
| Space | **O(min(n, m))** |

---

# 💻 Source Code

```java
class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        HashSet<Character> slide = new HashSet<>();
        
        char str[] = s.toCharArray();
		
		int maxNum = 0;
		int l = 0;
		
		for(int i=0; i<str.length; i++){
		    
		    while(slide.contains(str[i])){
		        slide.remove(str[l]);
		        l++;
		    }
		    
		    slide.add(str[i]);
		
		    if(i-l+1 > maxNum){
		        maxNum = i-l+1;
		    }
		}

        return maxNum;
    }
}
```
