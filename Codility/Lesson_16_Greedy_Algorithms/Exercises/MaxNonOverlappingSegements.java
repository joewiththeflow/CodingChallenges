package Lesson_16_Greedy_Algorithms.Exercises;

public class MaxNonOverlappingSegements {

    // This solution is correct and attempts to find the critical path
    public static int maxNumberOfSegments(int[] A, int[] B) {

        // Check length is not 0
        if (A.length == 0) {
            return 0;
        }

        // We require a variable to track the current number of segments
        int currentNumberOfSegments = 1;

        int endPoint = B[0];

        // Loop through and find the critical path
        for (int i = 1; i < A.length; i++) {
            // Check if the this segment's start point is after the current end point value
            if (A[i] > endPoint) {
                // Add one to currentNumberOfSegments
                currentNumberOfSegments += 1;
                // Adjust end point to this segment's values
                endPoint = B[i];
            }
        }
        return currentNumberOfSegments;
    }
}
