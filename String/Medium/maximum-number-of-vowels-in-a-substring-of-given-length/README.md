# Maximum Number of Vowels in a Substring of Given Length

<div align="center">

## 🟡 Medium • 📂 String • 💻 Java

[Problem Link](https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/)

</div>

---

# 🧠 Approach

The approach used in the code is to utilize a sliding window technique to track the maximum number of vowels in a substring of a given length. It initializes a window of size k and then slides it through the string, updating the count of vowels in the window. The maximum count of vowels seen so far is kept track of and returned at the end.

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
