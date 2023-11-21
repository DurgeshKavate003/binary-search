public class Main {

    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a Number : ");

        int target = myObj.nextInt();

        int left = 0;
        int right = sortedArray.length - 1;

        boolean iterativeResult = binarySearchIterative(sortedArray, target);
        System.out.println("Iterative Binary Search Result: " + iterativeResult);

        boolean recursiveResult = binarySearchRecursive(sortedArray, target, left, right);
        System.out.println("Recursive Binary Search Result: " + recursiveResult);
    }

    public static boolean binarySearchIterative(int[] array, int x) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + ((right - left) / 2);
    
            if (array[mid] == x) {
                return true;
            } else if (x < array[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }

    public static boolean binarySearchRecursive(int[] array, int x, int left, int right) {
        if (left > right) {
            return false;
        }

        int mid = left + ((right - left) / 2);

        if (array[mid] == x) {
            return true;
        } else if (x < array[mid]) {
            return binarySearchRecursive(array, x, left, mid - 1);
        } else {
            return binarySearchRecursive(array, x, mid + 1, right);
        }
    }

}
