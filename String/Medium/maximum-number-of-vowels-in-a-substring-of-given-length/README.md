# Maximum Number of Vowels in a Substring of Given Length

<div align="center">

## 🟡 Medium • 📂 String • 💻 Java

[Problem Link](https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/)

</div>

---

# 🧠 Approach

The approach used in the code involves utilizing a sliding window technique to track the maximum number of vowels in a substring of a given length. It maintains a running count of vowels within the current window and updates the maximum count as the window slides through the string. This allows for an efficient solution that only requires a single pass through the input string.

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
    public int maxVowels(String s, int k) {
        
       char[] arr = s.toCharArray();
	    
	    HashSet<Character> vowels = new HashSet<>();
	    
	    vowels.add('a');
	    vowels.add('e');
	    vowels.add('i');
	    vowels.add('o');
	    vowels.add('u');
	    
	    int runningWindow = 0;
	    int maxWindow = 0;
	    
	    for(int i=0; i<k; i++){
	        if(vowels.contains(arr[i])){
	            runningWindow++;
	        }
	    }
	    if(maxWindow < runningWindow){
	        maxWindow = runningWindow;
	    }
	    
        for(int j=k; j<arr.length; j++){
            if(vowels.contains(arr[j - k])){
                runningWindow--;
            }
            if(vowels.contains(arr[j])){
                runningWindow++;
            }
            
            if(maxWindow<runningWindow){
                maxWindow = runningWindow;
            }
        }
        return maxWindow;
    }
}
```
