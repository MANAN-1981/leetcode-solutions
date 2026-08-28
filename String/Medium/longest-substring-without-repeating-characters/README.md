# Longest Substring Without Repeating Characters

<div align="center">

## 🟡 Medium • 📂 String

[Problem Link](https://leetcode.com/problems/longest-substring-without-repeating-characters/)

**Solutions:** `Java`

</div>

---

# 🧠 Approach

Use two pointers to define a sliding window and a HashSet to store characters in the current window. Move the right pointer forward, adding characters to the set. If a duplicate is encountered, move the left pointer forward while removing characters from the set until the duplicate is removed. Update the maximum window length after each expansion.

---

# 💻 Source Code

<!-- LCGH:SOLUTION lang="Java" -->
## 💻 Java

| Operation | Complexity |
|-----------|------------|
| Time | **O(n)** |
| Space | **O(n)** |

[`solution.java`](./solution.java)

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
<!-- /LCGH:SOLUTION -->
