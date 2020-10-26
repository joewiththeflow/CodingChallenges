package Lesson_2_Arrays.Exercises;

import java.util.HashMap;
import java.util.Map;

public class OddOccurrence {

    // Odd Occurrences in Array
    public static int oddOccurrenceInArray(int[] A) {
        // A hashmap is a good approach for this type of problem
        Map<Integer, Integer> countMap = new HashMap<>();

        // If we loop through the given array, we can use the hashmap to count occurrences
        for (int i = 0; i < A.length; i++) {
            // First check for the key
            if (countMap.containsKey(A[i])) {
                // Key already exists so add one to the current value
                int currentValue = countMap.get(A[i]);
                countMap.put(A[i], currentValue + 1);
            } else {
                // Key does not exist, so create it with value of 1
                countMap.put(A[i], 1);
            }
        }

        // Now we can loop through the keys, looking for a key with an odd value
        for (int key : countMap.keySet()) {
            if ((countMap.get(key) % 2) != 0) {
                return key;
            }
        }

        // If we reach this stage, something has gone wrong so return -1
        return -1;
    }

    public static void main(String[] args) {

        System.out.println(oddOccurrenceInArray(new int[] {1,2,3,4,5,6,1,2,3,5,6}));
        System.out.println(oddOccurrenceInArray(new int[] {1,2,1,2,1,2,1,2,1,2,1}));
        System.out.println(oddOccurrenceInArray(new int[] {1,1,3,3,5,5,5,2,2,4,4}));
    }
}

// Expected Output

// 4
// 2
// 5
