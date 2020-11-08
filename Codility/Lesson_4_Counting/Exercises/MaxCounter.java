package Lesson_4_Counting.Exercises;

public class MaxCounter {

    // Lesson 4 - Counting

    // MaxCounters

    // You are given N counters, initially set to 0, and you have two possible operations on them:
    //
    //increase(X) − counter X is increased by 1,
    //max counter − all counters are set to the maximum value of any counter.
    //A non-empty array A of M integers is given. This array represents consecutive operations:
    //
    //if A[K] = X, such that 1 ≤ X ≤ N, then operation K is increase(X),
    //if A[K] = N + 1 then operation K is max counter.
    //For example, given integer N = 5 and array A such that:
    //
    //    A[0] = 3
    //    A[1] = 4
    //    A[2] = 4
    //    A[3] = 6
    //    A[4] = 1
    //    A[5] = 4
    //    A[6] = 4
    //the values of the counters after each consecutive operation will be:
    //
    //    (0, 0, 1, 0, 0)
    //    (0, 0, 1, 1, 0)
    //    (0, 0, 1, 2, 0)
    //    (2, 2, 2, 2, 2)
    //    (3, 2, 2, 2, 2)
    //    (3, 2, 2, 3, 2)
    //    (3, 2, 2, 4, 2)

    // the function should return [3, 2, 2, 4, 2], as explained above.
    //
    //Write an efficient algorithm for the following assumptions:
    //
    //N and M are integers within the range [1..100,000];
    //each element of array A is an integer within the range [1..N + 1].


    // The below version was correct but marked as non-performant
    public static int[] maxCountersSlow(int N, int[] A) {
        // Create an array of size N
        int[] counterArray = new int[N];
        // Create a max value to represent N + 1
        int max = N + 1;
        // Track the current max value of any counter
        int currentCounterMax = 0;

        // Loop through array A
        for (int i = 0; i < A.length; i++) {
            if (A[i] < max) {
                // Add one to the corresponding counter
                counterArray[A[i] - 1] += 1;
                // Set this value to the current counter max if necessary
                if (counterArray[A[i] - 1] > currentCounterMax) {
                    currentCounterMax = counterArray[A[i] - 1];
                }
            } else if (A[i] == max) {
                // Set all counters to the maximum of any counter i.e. currentCounterMax
                for (int j = 0; j < counterArray.length; j++) {
                    counterArray[j] = currentCounterMax;
                }
            }
        }
        return counterArray;
    }


    // Fast version 100% correct - O(N + M)
    public static int[] maxCountersFast(int N, int[] A) {
        // Create an array of size N
        int[] counterArray = new int[N];
        // Create a max value to represent N + 1
        int max = N + 1;
        // Track the current max value of any counter
        int currentCounterMax = 0;
        // Track the max the last time N + 1 was seen
        int maxLastTimeNPlusOneWasSeen = 0;

        // Loop through array A
        for (int i = 0; i < A.length; i++) {
            if (A[i] < max) {
                // Add an additional check to see if this value is lower than the currentCounterMax
                if (counterArray[A[i] - 1] < maxLastTimeNPlusOneWasSeen) {
                    // Set the counter to the current max first
                    counterArray[A[i] - 1] = maxLastTimeNPlusOneWasSeen;
                }
                // Add one to the corresponding counter
                counterArray[A[i] - 1] += 1;
                // Set this value to the current counter max if necessary
                if (counterArray[A[i] - 1] > currentCounterMax) {
                    currentCounterMax = counterArray[A[i] - 1];
                }
            } else if (A[i] == max) {
                maxLastTimeNPlusOneWasSeen = currentCounterMax;
            }
        }

        // Loop through the counter array, checking that each value is at least maxLasTimeNPlusOneWasSeen
        for (int i = 0; i < counterArray.length; i++) {
            // Add an additional check to see if this value is lower than the currentCounterMax
            if (counterArray[i] < maxLastTimeNPlusOneWasSeen) {
                // Set the counter to the current max first
                counterArray[i] = maxLastTimeNPlusOneWasSeen;
            }
        }
        return counterArray;
    }

    public static void main(String[] args) {

        // Slow version
        int[] counterArray = maxCountersSlow(5, new int[] {3,4,4,6,1,4,4});
        for (int item : counterArray) {
            System.out.print(String.format("%d, ", item));
        }
        System.out.println();


        // Fast version
        int[] counterArray2 = maxCountersFast(5, new int[] {3,4,4,6,1,4,4});
        for (int item : counterArray2) {
            System.out.print(String.format("%d, ", item));
        }
    }
}

// Expected Output

// 3, 2, 2, 4, 2,
// 3, 2, 2, 4, 2,
