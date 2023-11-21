# Binary Search Implementation in Java

This Java code provides an implementation of binary search, both iteratively and recursively, to find a target value in a sorted array.

## Usage

1. **Main Class (`Main`):**
   - The `main` method serves as the entry point.
   - Initializes a sorted array (`sortedArray`) and a target value (`target`).
   - Two variables (`left` and `right`) are used to track the search range.

2. **Iterative Binary Search (`binarySearchIterative`):**
   - Method for iteratively searching for the target value.
   - Uses a while loop to update pointers and narrow down the search range.
   - Returns `true` if the target is found; otherwise, returns `false`.

3. **Recursive Binary Search (`binarySearchRecursive`):**
   - Recursive implementation of binary search.
   - Base case checks for an empty search range.
   - Returns `true` if the target is found; otherwise, makes recursive calls on the appropriate half.

## Example

```java
public class Main {

    public static void main(String[] args) {
        // Example usage
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 2;

        int left = 0;
        int right = sortedArray.length - 1;

        boolean iterativeResult = binarySearchIterative(sortedArray, target);
        System.out.println("Iterative Binary Search Result: " + iterativeResult);

        boolean recursiveResult = binarySearchRecursive(sortedArray, target, left, right);
        System.out.println("Recursive Binary Search Result: " + recursiveResult);
    }

    // ... (binarySearchIterative and binarySearchRecursive methods)
}
