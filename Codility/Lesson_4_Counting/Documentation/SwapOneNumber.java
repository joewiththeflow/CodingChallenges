package Lesson_4_Counting;

public class SwapOneNumber {

    // Lesson 4 - Counting: O(n^2)
    // Check to see whether we can swap one element of array A, with one element of array B, to have the sum of both arrays match.
    // Both arrays are the same size.
    // The sum of array B is greater than array A.
    // The value of any integer value is less than or equal to m.

    // The slower solution
    public static boolean slowSwapCheck(int[] A, int[] B, int m) {
        int length = A.length;

        // Get the sums of each array
        int sumA = 0;
        for (int item : A) {
            sumA += item;
        }
        int sumB = 0;
        for (int item : B) {
            sumB += item;
        }

        // Loop over A, with a nested loop of array B
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                // Work out the difference and add to sumA, subtract from sumB
                int change = B[j] - A[i];
                sumA += change;
                sumB -= change;
                // If the sums are equal then we know that we can swap one element and balance the sums
                if (sumA == sumB) {
                    return true;
                }
                // If not, we must revert the sums back before we begin the next loop
                sumA -= change;
                sumB += change;
            }
        }
        // If we reach this point, we cannot swap one number to make the sums balance
        return false;
    }

    // Lesson 4 - Counting: O(n + m)
    // A faster solution for the above problem, using the previous CountOccurrence.getCountArray method
    public static boolean fastSwapCheck(int[] A, int[] B, int m) {
        int length = A.length;

        // Get the sums of each array
        int sumA = 0;
        for (int item : A) {
            sumA += item;
        }
        int sumB = 0;
        for (int item : B) {
            sumB += item;
        }

        // Work out the difference between both sums
        int diff = sumB - sumA;

        // If the difference is odd, we can actually never make the proper swap i.e. one is already odd and one already even
        if (diff % 2 != 0) {
            return false;
        }

        // Divide the difference by 2
        diff /= 2;

        // Get a count array of array A
        // NOTE: We must use the previous method in the documentation to get the count array
        int[] countArray = CountOccurrence.getCountArray(A, m);

        // Loop through array B, checking if we have a possible value which minus the difference is also in the countArray
        // i.e. the value in array A that must exist for the value of B, will be the value of B minus half the difference
        // Or put another way, the value that B is losing must be double the value A is losing to balance
        for (int i = 0; i < length; i++) {
            // Check that the difference is greater than 0 and less than or equal to m
            // Finally check that the value exists in array A by checking the countArray created for A
            if ((B[i] - diff >= 0) && (B[i] - diff <= m) && (countArray[B[i] - diff] > 0)) {
                return true;
            }
        }
        // If we reach this point, there is no two values that can be swapped successfully
        return false;

    }

    public static void main(String[] args) {

        // Test Slower method: O(n^2)
        int[] firstArray = new int[] {1,2,3,4,5,6,7};   // Sum 28
        int[] secondArray = new int[] {1,2,3,4,6,7,9};  // Sum 30
        int m = 9; // the highest number in both arrays

        System.out.println(slowSwapCheck(firstArray, secondArray, m)); // true

        int[] thirdArray = new int[] {1,2,3,4,5,6,8};   // Sum 29
        int[] fourthArray = new int[] {1,2,3,4,6,7,9};  // Sum 30
        System.out.println(slowSwapCheck(thirdArray, fourthArray, m)); // false



        // Test Faster method: O(n + m)

        System.out.println(fastSwapCheck(firstArray, secondArray, m)); // true

        int[] thirdArray2 = new int[] {1,2,3,4,5,6,8};   // Sum 29
        int[] fourthArray2 = new int[] {1,2,3,4,6,7,9};  // Sum 30
        System.out.println(fastSwapCheck(thirdArray2, fourthArray2, m)); // false

    }
}

// Expected Output

// true
// false
// true
// false