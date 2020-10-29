package Lesson_3_Time_Complexity.Exercises;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MissingElement {

    // Missing Element
    // An array with N integers, representing the sequence 1...(N+1), meaning that one positive number is missing

    // From the codility documentation, we are shown the method: sum = (n * (n + 1)) / 2
    // The time complexity is O(N)
    public static int findMissingElementWithFormula(int[] A) {

        // Calculate the sum using the formula: sum = (n * (n + 1)) / 2
        // Remember that we are looking for numbers between 1 and (n + 1) so really: sum = ((n + 1) * (n + 1)) / 2
        int sum = ((A.length + 1) * (A.length + 1)) / 2;

        // We can now loop through the array, subtracting the elements from the sum to be left with the missing number
        for(int i = 0; i < A. length; i++) {
            sum -= A[i];
        }

        return sum;
    }

    // Alternative HashSet method with time complexity of O(n)
    public static int findMissingElementWithHashSet(int[] A) {
        // A hashset is a good idea as we can keep track of any numbers (keys) seen
        Set<Integer> countSet = new HashSet<>();

        // Get the length of the array
        int length = A.length;

        for (int i = 0; i < length; i++) {
            // Add each number to the set
            // If it already exists in the set then it won't be added as this is a set
            countSet.add(A[i]);
        }

        // Now we can find out which number is missing
        // Remember that we are searching between 1 and N (the number of integers) + 1
        for (int i = 1; i <= (length + 1); i++) {
            // If the number does not exist, return it as this is the missing value
            if (!countSet.contains(i)) {
                return i;
            }
        }

        // If we reach this point there is a problem or the array is empty
        return 1;
    }

    // Alternative HashMap method with time complexity of O(n)
    public static int findMissingElementWithHashMap(int[] A) {
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

        // Test Formula method
        System.out.println(String.format("Missing element in sequence 1..(N+1): %d", findMissingElementWithHashSet(new int[] {}))); // 1
        System.out.println(String.format("Missing element in sequence 1..(N+1): %d", findMissingElementWithHashSet(new int[] {1}))); // 2
        System.out.println(String.format("Missing element in sequence 1..(N+1): %d", findMissingElementWithHashSet(new int[] {2}))); // 1
        System.out.println(String.format("Missing element in sequence 1..(N+1): %d", findMissingElementWithHashSet(new int[] {1,2}))); // 3
        System.out.println(String.format("Missing element in sequence 1..(N+1): %d", findMissingElementWithHashSet(new int[] {1,3}))); // 2
        System.out.println(String.format("Missing element in sequence 1..(N+1): %d", findMissingElementWithHashSet(new int[] {1,2,6,7,3,8,4,10,5}))); // 9
        System.out.println(String.format("Missing element in sequence 1..(N+1): %d", findMissingElementWithHashSet(new int[] {1,2,5,6,3,7}))); // 4
        System.out.println(String.format("Missing element in sequence 1..(N+1): %d", findMissingElementWithHashSet(new int[] {1,2,3,4,5,6,7,8,9,10,12}))); //11

        // Test HashSet method
        System.out.println(String.format("Missing element in sequence 1..(N+1): %d", findMissingElementWithHashSet(new int[] {}))); // 1
        System.out.println(String.format("Missing element in sequence 1..(N+1): %d", findMissingElementWithHashSet(new int[] {1}))); // 2
        System.out.println(String.format("Missing element in sequence 1..(N+1): %d", findMissingElementWithHashSet(new int[] {2}))); // 1
        System.out.println(String.format("Missing element in sequence 1..(N+1): %d", findMissingElementWithHashSet(new int[] {1,2}))); // 3
        System.out.println(String.format("Missing element in sequence 1..(N+1): %d", findMissingElementWithHashSet(new int[] {1,3}))); // 2
        System.out.println(String.format("Missing element in sequence 1..(N+1): %d", findMissingElementWithHashSet(new int[] {1,2,6,7,3,8,4,10,5}))); // 9
        System.out.println(String.format("Missing element in sequence 1..(N+1): %d", findMissingElementWithHashSet(new int[] {1,2,5,6,3,7}))); // 4
        System.out.println(String.format("Missing element in sequence 1..(N+1): %d", findMissingElementWithHashSet(new int[] {1,2,3,4,5,6,7,8,9,10,12}))); //11

        // Test HashMap method
        System.out.println(String.format("Missing element in sequence 1..(N+1): %d", findMissingElementWithHashMap(new int[] {}))); // 1
        System.out.println(String.format("Missing element in sequence 1..(N+1): %d", findMissingElementWithHashMap(new int[] {1}))); // 2
        System.out.println(String.format("Missing element in sequence 1..(N+1): %d", findMissingElementWithHashMap(new int[] {2}))); // 1
        System.out.println(String.format("Missing element in sequence 1..(N+1): %d", findMissingElementWithHashMap(new int[] {1,2}))); // 3
        System.out.println(String.format("Missing element in sequence 1..(N+1): %d", findMissingElementWithHashMap(new int[] {1,3}))); // 2
        System.out.println(String.format("Missing element in sequence 1..(N+1): %d", findMissingElementWithHashMap(new int[] {1,2,6,7,3,8,4,10,5}))); // 9
        System.out.println(String.format("Missing element in sequence 1..(N+1): %d", findMissingElementWithHashMap(new int[] {1,2,5,6,3,7}))); // 4
        System.out.println(String.format("Missing element in sequence 1..(N+1): %d", findMissingElementWithHashMap(new int[] {1,2,3,4,5,6,7,8,9,10,12}))); //11

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
// Missing element in sequence 1..(N+1): 1
// Missing element in sequence 1..(N+1): 2
// Missing element in sequence 1..(N+1): 1
// Missing element in sequence 1..(N+1): 3
// Missing element in sequence 1..(N+1): 2
// Missing element in sequence 1..(N+1): 9
// Missing element in sequence 1..(N+1): 4
// Missing element in sequence 1..(N+1): 11
// Missing element in sequence 1..(N+1): 1
// Missing element in sequence 1..(N+1): 2
// Missing element in sequence 1..(N+1): 1
// Missing element in sequence 1..(N+1): 3
// Missing element in sequence 1..(N+1): 2
// Missing element in sequence 1..(N+1): 9
// Missing element in sequence 1..(N+1): 4
// Missing element in sequence 1..(N+1): 11
