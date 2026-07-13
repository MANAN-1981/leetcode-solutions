# Find Pivot Index

<div align="center">

## 🟢 Easy • 📂 Array • 💻 Java

[Problem Link](https://leetcode.com/problems/find-pivot-index/submissions/)

</div>

---

# 🧠 Approach

The approach used in the code is to iterate through the array and for each index, calculate the sum of elements to the left and right. If the left sum equals the right sum, the current index is the pivot index. However, the provided code has an inefficient recursive approach to calculate the left and right sums, which can be optimized using prefix sum or a simple iterative method.

---

# 📊 Complexity Analysis

| Operation | Complexity |
|-----------|------------|
| Time | **O(n^2)** |
| Space | **O(n)** |

---

# 💻 Source Code

```java
class Solution {
    public int pivotIndex(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int left = leftSum(arr, i - 1);
            int right = rightSum(arr, i + 1, n);

            if (left == right) {
                return i;
            } 
        }
        return -1;
    }

    public static int leftSum(int arr[], int index) {
        int sum = 0;

        if (index >= 0) {
            sum = arr[index] + leftSum(arr, index - 1);
        }
        return sum;
    }

    public static int rightSum(int arr[], int index, int n) {
        int sum = 0;

        if (index <= n - 1) {
            sum = arr[index] + rightSum(arr, index + 1, n);
        }
        return sum;
    }

}

```
