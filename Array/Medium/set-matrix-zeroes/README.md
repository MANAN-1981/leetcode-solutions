# Set Matrix Zeroes

<div align="center">

## 🟡 Medium • 📂 Array • 💻 Java

[Problem Link](https://leetcode.com/problems/set-matrix-zeroes/)

</div>

---

# 🧠 Approach

The approach used in the code involves iterating over the matrix to find the rows and columns that contain a zero, storing these indices, and then setting the corresponding rows and columns to zero. This is done in two separate passes: one to find the zero-containing rows and columns, and another to update the matrix. The code uses ArrayLists to store the indices of the rows and columns that need to be zeroed out.

---

# 📊 Complexity Analysis

| Operation | Complexity |
|-----------|------------|
| Time | **O(m*n)** |
| Space | **O(m+n)** |

---

# 💻 Source Code

```java
class Solution {
    public void setZeroes(int[][] arr) {

        ArrayList<Integer> roww = new ArrayList<>();
        ArrayList<Integer> coll = new ArrayList<>();

        int rowp = 0;
        int colp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    roww.add(i);
                    coll.add(j);
                }
            }
        }

        int r = 0;
        int c = 0;

        int rr[] = new int[roww.size()];
        int cc[] = new int[coll.size()];

        for (int i = 0; i < roww.size(); i++) {
            rr[i] = roww.get(i);
        }
        for (int i = 0; i < roww.size(); i++) {
            cc[i] = coll.get(i);
        }

        for (int k = 0; k < roww.size(); k++) {

            int row = roww.get(k);
            int col = coll.get(k);

            for (int j = 0; j < arr[row].length; j++) {
                arr[row][j] = 0;
            }

            for (int i = 0; i < arr.length; i++) {
                arr[i][col] = 0;
            }
        }
    }
}
```
