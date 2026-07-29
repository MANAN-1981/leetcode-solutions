# Quick Revision

## Pattern Used

BinarySearch

## Key Idea

The key insight is that we can treat the 2D matrix as a 1D sorted array and use binary search to find the target element. This is possible because the matrix is sorted in a way that each row is sorted and the last element of each row is less than or equal to the first element of the next row.

## Important Observations

The important observations are: the matrix is sorted, the matrix can be treated as a 1D sorted array, the binary search algorithm can be used to find the target element in logarithmic time.

## Formula

mid / cols and mid % cols

## Interview Tips

When explaining this problem in an interview, be sure to highlight the key insight that the 2D matrix can be treated as a 1D sorted array. Also, explain the binary search algorithm and how it is used to find the target element in logarithmic time. Finally, discuss the edge cases and how they are handled.

---

## Revision Questions

**Q1.** What is the time complexity of the algorithm?

**Q2.** How does the algorithm handle edge cases?

**Q3.** What is the key insight that allows us to treat the 2D matrix as a 1D sorted array?

**Q4.** How does the binary search algorithm work?

**Q5.** What are the advantages and disadvantages of using binary search in this problem?

**Q6.** How would you optimize the algorithm for large matrices?

**Q7.** What are some potential pitfalls when implementing this algorithm?

**Q8.** How would you test the algorithm to ensure it is working correctly?

