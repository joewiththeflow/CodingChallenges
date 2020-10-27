package Lesson_3_Time_Complexity.Exercises;

public class TapeEquilibrium {

    // Minimal Absolute Difference
    // Get the minimal absolute difference as we move along the array and split into two each time
    public static int minimalAbsoluteDifference(int[] A) {
        // If there are only two numbers, just return the difference
        if (A.length == 2) {
            return Math.abs(A[0] - A[1]);
        }

        // We must add the numbers of the array to get the total sum
        // We can then use this to calculate the size of the sum on each side of the split
        // array as we move through it one more time.
        // We must also track the minimum absolute difference as we move through a second time.

        int total = 0;
        int sumFirst = 0;
        int sumSecond = 0;
        int minimumAbsoluteDifference = Integer.MAX_VALUE;

        // Loop through array to get the total
        for (int i = 0; i < A.length; i++) {
            total += A[i];
        }

        // Set the second sum to start at the total before the loop
        sumSecond = total;
        // Loop through the array, adjusting the first and second sums as we go
        // Remember that we don't wish to hit the last number as we go through the following loop
        for (int i = 0; i < (A.length - 1); i++) {
            sumFirst += A[i];
            sumSecond -= A[i];
            int absoluteDiff = Math.abs(sumFirst - sumSecond);
            if (absoluteDiff < minimumAbsoluteDifference) {
                minimumAbsoluteDifference = absoluteDiff;
            }
        }

        return minimumAbsoluteDifference;
    }
    
    public static void main(String[] args) {

        System.out.println(String.format("Minimal absolute difference: %d", minimalAbsoluteDifference(new int[] {-10, -20, -30, -40, 100})));
        System.out.println(String.format("Minimal absolute difference: %d", minimalAbsoluteDifference(new int[] {-100, 100})));
        System.out.println(String.format("Minimal absolute difference: %d", minimalAbsoluteDifference(new int[] {100, -100})));
        System.out.println(String.format("Minimal absolute difference: %d", minimalAbsoluteDifference(new int[] {100, 100})));
    }
}

// Expected Output

// Minimal absolute difference: 20
// Minimal absolute difference: 200
// Minimal absolute difference: 200
// Minimal absolute difference: 0
