# Binary Search Implementation in Java

This Java code provides an implementation of binary search, both iteratively and recursively, to find a target value in a sorted array.

## Usage

1. **Main Class (`Main`):**
   - The `main` method serves as the entry point.
   - Initializes a sorted array (`sortedArray`).
   - ### Array
        ``` java
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
   - Two variables (`left` and `right`) are used to track the search range.

2. **User Input:**
   - The code now uses the `Scanner` class to obtain user input from the console.
   - A prompt is displayed, asking the user to enter a number.
   - The entered number is stored in the variable `target`.
   - ### Code 
        ``` java
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int target = myObj.nextInt();


4. **Iterative Binary Search (`binarySearchIterative`):**
   - Method for iteratively searching for the target value.
   - Uses a while loop to update pointers and narrow down the search range.
   - Returns `true` if the target is found; otherwise, returns `false`.

5. **Recursive Binary Search (`binarySearchRecursive`):**
   - Recursive implementation of binary search.
   - Base case checks for an empty search range.
   - Returns `true` if the target is found; otherwise, makes recursive calls on the appropriate half; otherwise, returns `false`.

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
