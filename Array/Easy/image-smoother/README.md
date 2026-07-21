# Image Smoother

<div align="center">

## 🟢 Easy • 📂 Array • 💻 Java

[Problem Link](https://leetcode.com/problems/image-smoother/)

</div>

---

# 🧠 Approach

The code uses a simple iterative approach to smooth an image by averaging neighboring pixels. It handles edge cases where pixels are on the border of the image and have fewer neighbors. The algorithm iterates over each pixel in the image, calculates the average of its neighboring pixels, and assigns this average to the corresponding pixel in the smoothed image.

---

# 📊 Complexity Analysis

| Operation | Complexity |
|-----------|------------|
| Time | **O(n*m)** |
| Space | **O(n*m)** |

---

# 💻 Source Code

```java
class Solution {
    public int[][] imageSmoother(int[][] img) {

        int rows = img.length;
        int cols = img[0].length;

        int smoothed[][] = new int[rows][cols];

        if (rows == 1 && cols == 1) {
            smoothed[0][0] = img[0][0];
        }

        else if (rows == 1) {

            for (int col = 0; col < cols; col++) {

                if (col == 0) {
                    smoothed[0][col] = (img[0][col] + img[0][col + 1]) / 2;
                } else if (col == cols - 1) {
                    smoothed[0][col] = (img[0][col] + img[0][col - 1]) / 2;
                } else {
                    smoothed[0][col] = (img[0][col - 1] + img[0][col] + img[0][col + 1]) / 3;
                }
            }
        }

        else if (cols == 1) {

            for (int row = 0; row < rows; row++) {

                if (row == 0) {
                    smoothed[row][0] = (img[row][0] + img[row + 1][0]) / 2;
                } else if (row == rows - 1) {
                    smoothed[row][0] = (img[row][0] + img[row - 1][0]) / 2;
                } else {
                    smoothed[row][0] = (img[row - 1][0] + img[row][0] + img[row + 1][0]) / 3;
                }
            }
        } else {
            for (int row = 0; row < rows; row++) {
                for (int col = 0; col < cols; col++) {

                    if (row == 0 && col == 0) {
                        int sum = img[row][col] + img[row][col + 1]
                                + img[row + 1][col] + img[row + 1][col + 1];
                        smoothed[row][col] = sum / 4;
                    }

                    else if (row == 0 && col == cols - 1) {
                        int sum = img[row][col] + img[row][col - 1]
                                + img[row + 1][col] + img[row + 1][col - 1];
                        smoothed[row][col] = sum / 4;
                    }

                    else if (row == rows - 1 && col == 0) {
                        int sum = img[row][col] + img[row - 1][col]
                                + img[row][col + 1] + img[row - 1][col + 1];
                        smoothed[row][col] = sum / 4;
                    }

                    else if (row == rows - 1 && col == cols - 1) {
                        int sum = img[row][col] + img[row - 1][col]
                                + img[row][col - 1] + img[row - 1][col - 1];
                        smoothed[row][col] = sum / 4;
                    }

                    else if (row == 0) {
                        int sum = img[row][col - 1] + img[row][col] + img[row][col + 1]
                                + img[row + 1][col - 1] + img[row + 1][col]
                                + img[row + 1][col + 1];
                        smoothed[row][col] = sum / 6;
                    }

                    else if (row == rows - 1) {
                        int sum = img[row][col - 1] + img[row][col] + img[row][col + 1]
                                + img[row - 1][col - 1] + img[row - 1][col]
                                + img[row - 1][col + 1];
                        smoothed[row][col] = sum / 6;
                    }

                    else if (col == 0) {
                        int sum = img[row - 1][col] + img[row][col] + img[row + 1][col]
                                + img[row - 1][col + 1] + img[row][col + 1]
                                + img[row + 1][col + 1];
                        smoothed[row][col] = sum / 6;
                    }

                    else if (col == cols - 1) {
                        int sum = img[row - 1][col] + img[row][col] + img[row + 1][col]
                                + img[row - 1][col - 1] + img[row][col - 1]
                                + img[row + 1][col - 1];
                        smoothed[row][col] = sum / 6;
                    }

                    else {
                        int sum = img[row - 1][col - 1] + img[row - 1][col]
                                + img[row - 1][col + 1] + img[row][col - 1]
                                + img[row][col] + img[row][col + 1]
                                + img[row + 1][col - 1] + img[row + 1][col]
                                + img[row + 1][col + 1];

                        smoothed[row][col] = sum / 9;
                    }
                }
            }
        }
        return smoothed;
    }
}
```
