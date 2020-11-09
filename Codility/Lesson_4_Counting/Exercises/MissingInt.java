package Lesson_4_Counting.Exercises;

public class MissingInt {

    // Lesson 4 - Counting
    // Largest missing positive integer
    // Perhaps it would be a bit better to use a hashmap here rather than such a large count array
    public static int largestMissingPositiveInteger(int[] A) {

        // Create an array with index for every possible positive value from 1...1000000
        int[] countArray = new int[1000000];

        // Loop through array A,
        for (int i = 0; i < A.length; i++) {
            // Check value is greater than 0
            if (A[i] > 0) {
                // Increment the value at position A[i] - 1
                countArray[A[i] - 1] += 1;
            }
        }

        // Loop through the countArray, and find the first 0 value
        for (int i = 0; i < countArray.length; i++) {
            if (countArray[i] == 0) {
                return i + 1;
            }
        }

        // If we get to here there has been a problem so just return 1
        return 1;
    }

    public static void main(String[] args) {

        System.out.println(largestMissingPositiveInteger(new int[] {1,3,6,4,1,2})); // 5
        System.out.println(largestMissingPositiveInteger(new int[] {-1,-2})); // 1
        System.out.println(largestMissingPositiveInteger(new int[] {1,2,3,4})); // 5
    }
}

// Expected Output

// 5
// 1
// 5
