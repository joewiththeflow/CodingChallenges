package Lesson_3_Time_Complexity.Exercises;

import java.util.HashMap;
import java.util.Map;

public class MissingElement {

    // Missing Element
    // An array with N integers, representing the sequence 1...(N+1), meaning that one positive number is missing
    public static int findMissingElement(int[] A) {
        // A hashmap is a good idea as we can keep track of any numbers (keys) seen
        Map<Integer, Integer> countMap = new HashMap<>();

        // Get the length of the array
        int length = A.length;

        for (int i = 0; i < length; i++) {
            // Record each number observed with a 1 as it should only occur once
            countMap.put(A[i], 1);
        }

        // Now we can find out which number is missing
        // Remember that we are searching between 1 and N (the number of integers) + 1
        for (int i = 1; i <= (length + 1); i++) {
            // If the key does not exist, return it as this is the missing value
            if (!countMap.containsKey(i)) {
                return i;
            }
        }

        // If we reach this point there is a problem or the array is empty
        return 1;
    }
    
    public static void main(String[] args) {

        System.out.println(String.format("Missing element in sequence 1..(N+1): %d", findMissingElement(new int[] {}))); // 1
        System.out.println(String.format("Missing element in sequence 1..(N+1): %d", findMissingElement(new int[] {1}))); // 2
        System.out.println(String.format("Missing element in sequence 1..(N+1): %d", findMissingElement(new int[] {2}))); // 1
        System.out.println(String.format("Missing element in sequence 1..(N+1): %d", findMissingElement(new int[] {1,2}))); // 3
        System.out.println(String.format("Missing element in sequence 1..(N+1): %d", findMissingElement(new int[] {1,3}))); // 2
        System.out.println(String.format("Missing element in sequence 1..(N+1): %d", findMissingElement(new int[] {1,2,6,7,3,8,4,10,5}))); // 9
        System.out.println(String.format("Missing element in sequence 1..(N+1): %d", findMissingElement(new int[] {1,2,5,6,3,7}))); // 4
        System.out.println(String.format("Missing element in sequence 1..(N+1): %d", findMissingElement(new int[] {1,2,3,4,5,6,7,8,9,10,12}))); //11
    }
}

// Expected Output

// Missing element in sequence 1..(N+1): 1
// Missing element in sequence 1..(N+1): 2
// Missing element in sequence 1..(N+1): 1
// Missing element in sequence 1..(N+1): 3
// Missing element in sequence 1..(N+1): 2
// Missing element in sequence 1..(N+1): 9
// Missing element in sequence 1..(N+1): 4
// Missing element in sequence 1..(N+1): 11
