package Lesson_4_Counting.Exercises;

public class FrogRiver {

    // Lesson 4 - Counting
    
    // Frog River One
    
    // This method gives back the minimum number of seconds that pass before the values 1 to X have all appeared.
    // The values in the A array are from 1...100000
    // Each value in Array A represents a leaf falling at that position i.e. between 1 and X.
    // Each position in array A represents the second which a leaf falls
    // For example, you are given integer X = 5 and array A such that:
    
    //A[0] = 1
    //A[1] = 3
    //A[2] = 1
    //A[3] = 4
    //A[4] = 2
    //A[5] = 3
    //A[6] = 5
    //A[7] = 4
    
    // In second 6, a leaf falls into position 5. 
    // This is the earliest time when leaves appear in every position across the river.
    public static int minimumTimeAllNumbersHaveOccurred(int X, int[] A) {
        // Variable to keep track of earliest time
        int earliestTime = -1;

        // Create an array to hold the first second that each number occurs
        // Each number is represented by its position ( minus 1, due to 0 based index i.e. 0 represents 1)
        int[] secondArray = new int[X];

        // Unfortunately, creating an array in this way means every value is already 0
        // A value could be 0 due to not being present, or due to being at position 0
        // Therefore we should make a point of updating every value to be -1
        for (int i = 0; i < secondArray.length; i++) {
            secondArray[i] = -1;
        }

        // Loop through the array
        for (int i = 0; i < A.length; i++) {
            // Check the leaf at this position hasn't already landed
            // Remember that the secondArray starts at 0, whereas the lowest value in A is 1
            if (secondArray[(A[i] - 1)] == -1) {
                // Add i to the secondArray, at the position which corresponds to the current value in A
                secondArray[(A[i] - 1)] = i;
            }
        }

        // Loop through the secondArray and if -1 is encountered, return -1
        for (int i = 0; i < secondArray.length; i++) {
            if (secondArray[i] == -1) {
                return -1;
            } else if (secondArray[i] > earliestTime) {
                // set earliest time to the highest value found
                earliestTime = secondArray[i];
            }
        }
        return earliestTime;
    }

    public static void main(String[] args) {
        System.out.println(minimumTimeAllNumbersHaveOccurred(5, new int[] {1,3,4,1,2,5,4,3})); // 5
        System.out.println(minimumTimeAllNumbersHaveOccurred(5, new int[] {1,3,4,1,2,4,3,3,5,4,3,2})); // 8
    }
}

// Expected Output

// 5
// 8
