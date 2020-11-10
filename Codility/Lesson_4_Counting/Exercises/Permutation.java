package Lesson_4_Counting.Exercises;

public class Permutation {

    // Lesson 4 - Counting

    // Permutation Check

    public static int permutationCheck(int[] A) {

        int[] countArray = new int[A.length];

        // Loop through array A
        for (int i = 0; i < A.length; i++) {
            // Check if the value is less than or equal to N
            if (A[i] <= A.length) {
                // Increment the corresponding value in countArray
                countArray[A[i] - 1] += 1;
            } else {
                // The array is not a permutation so return 0
                return 0;
            }
        }

        // Loop through the count array and ensure values all equal 1
        for (int i = 0; i < countArray.length; i++) {
            if (countArray[i] != 1) {
                return 0;
            }
        }

        // If we arrive here, the array is a permutation
        return 1;
    }

    public static void main(String[] args) {

        System.out.println(permutationCheck(new int[] {4,1,3,2})); // Permutation of 1 to N so returns 1
        System.out.println(permutationCheck(new int[] {4,1,3})); // Not a permutation (no 2) so returns 0
    }
}

// Expected Output

// 1
// 0
