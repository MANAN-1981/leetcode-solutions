# Find Pivot Index

<div align="center">

## 🟢 Easy • 📂 Array

[Problem Link](https://leetcode.com/problems/find-pivot-index/)

**Solutions:** `Java`

</div>

---

# 🧠 Approach

Iterate through the array to find an index where the sum of elements to the left equals the sum of elements to the right. The provided code uses recursive helper functions to calculate the left and right sums for each index, which is an inefficient O(n^2) approach compared to the optimal O(n) prefix sum method.

---

# 💻 Source Code

<!-- LCGH:SOLUTION lang="Java" -->
## 💻 Java

| Operation | Complexity |
|-----------|------------|
| Time | **O(n^2)** |
| Space | **O(n)** |

[`solution.java`](./solution.java)

```java
// class Solution {
//     public int pivotIndex(int[] arr) {

//         int n = arr.length;

//         for (int i = 0; i < n; i++) {
//             int left = leftSum(arr, i - 1);
//             int right = rightSum(arr, i + 1, n);

//             if (left == right) {
//                 return i;
//             } 
//         }
//         return -1;
//     }

//     public static int leftSum(int arr[], int index) {
//         int sum = 0;

//         if (index >= 0) {
//             sum = arr[index] + leftSum(arr, index - 1);
//         }
//         return sum;
//     }

//     public static int rightSum(int arr[], int index, int n) {
//         int sum = 0;

//         if (index <= n - 1) {
//             sum = arr[index] + rightSum(arr, index + 1, n);
//         }
//         return sum;
//     }


// static {
//     Runtime.getRuntime().addShutdownHook(new Thread(() -> {
//         try (java.io.FileWriter fw = new java.io.FileWriter("display_runtime.txt")) {
//             fw.write("0");
//         } catch (Exception e) {
//         }
//     }));
//     }
// }


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
<!-- /LCGH:SOLUTION -->
